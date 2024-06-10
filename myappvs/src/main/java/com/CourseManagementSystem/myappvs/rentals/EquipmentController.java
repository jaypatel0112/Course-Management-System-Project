package com.CourseManagementSystem.myappvs.rentals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/inventory")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private RentalService rentalService;

    @GetMapping
    public String getInventoryList(Model model) {
        List<Equipment> inventoryList = equipmentService.findAll();
        model.addAttribute("inventoryList", inventoryList);
        return "inventory";
    }

    @PostMapping("/rent")
    public ResponseEntity<String> rentEquipment(@RequestBody RentalRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String userEmail = authentication.getName();
            LocalDate rentalDate = LocalDate.parse(request.getRentalDate());
            LocalDate returnDate = LocalDate.parse(request.getReturnDate());
            String message = rentalService.rentEquipment(userEmail, request.getEquipmentId(), rentalDate, returnDate);
            if (message.equals("Rental successful!")) {
                return ResponseEntity.ok(message);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("You need to be logged in to rent equipment.");
        }
    }

    @GetMapping("/rentals")
    public String getAllRentals(Model model) {
        List<Rental> rentalList = rentalService.findAllRentals();
        model.addAttribute("rentalList", rentalList);
        return "rentals";
    }

    @GetMapping("/userRentals")
    public ResponseEntity<List<Rental>> getUserRentals() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String userEmail = authentication.getName();
            List<Rental> rentals = rentalService.getUserRentals(userEmail);
            return ResponseEntity.ok(rentals);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Equipment> addEquipment(@RequestBody Equipment equipment) {
        Equipment newEquipment = equipmentService.save(equipment);
        return new ResponseEntity<>(newEquipment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id) {
        Equipment equipment = equipmentService.findById(id).orElse(null);
        if (equipment != null) {
            return new ResponseEntity<>(equipment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
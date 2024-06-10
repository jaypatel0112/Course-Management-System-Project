package com.CourseManagementSystem.myappvs.rentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/rentals")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @PostMapping("/rent")
    public ResponseEntity<String> rentEquipment(@RequestBody RentalRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String userEmail = authentication.getName();
            LocalDate rentalDate = LocalDate.parse(request.getRentalDate());
            LocalDate returnDate = LocalDate.parse(request.getReturnDate());
            String message = rentalService.rentEquipment(userEmail, request.getEquipmentId(), rentalDate, returnDate);
            if (message.equals("Rental successful!")) {
                return ResponseEntity.ok().build();
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @GetMapping("/userRentals")
    public List<Rental> getUserRentals() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String userEmail = authentication.getName();
            return rentalService.getUserRentals(userEmail);
        }
        return null;
    }

    @DeleteMapping("/deleteRental/{id}")
    public ResponseEntity<Void> deleteRental(@PathVariable Long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            rentalService.deleteRentalById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
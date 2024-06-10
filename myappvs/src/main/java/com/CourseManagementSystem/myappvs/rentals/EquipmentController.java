package com.CourseManagementSystem.myappvs.rentals;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inventory")
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;

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
    public String rentEquipment(@RequestParam Long resourceId, @RequestParam Long classId,
                                @RequestParam String allocationDate, @RequestParam String returnDate, Model model) {
        String message = rentalService.rentEquipment(resourceId, classId, LocalDate.parse(allocationDate), LocalDate.parse(returnDate));
        model.addAttribute("message", message);
        return "redirect:/inventory";
    }

    @GetMapping("/rentals")
    public String getAllRentals(Model model) {
        List<Rental> rentalList = rentalService.findAllRentals();
        model.addAttribute("rentalList", rentalList);
        return "rentals";
    }
}

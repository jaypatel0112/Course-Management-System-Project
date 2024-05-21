package com.CourseManagementSystem.myappvs.rentals;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/inventory")
    public String viewInventory(Model model) {
        model.addAttribute("inventoryList", equipmentService.findAllEquipment());
        return "inventory";
    }
}
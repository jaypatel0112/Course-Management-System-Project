package com.CourseManagementSystem.myappvs.rentals;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
public class EquipmentService {

        @Autowired
        private EquipmentRepository equipmentRepository;

        public List<Equipment> findAll() {
            return equipmentRepository.findAll();
        }

        public Optional<Equipment> findById(Long id) {
            return equipmentRepository.findById(id);
        }

        public Equipment save(Equipment equipment) {
            return equipmentRepository.save(equipment);
        }

        public void deleteById(Long id) {
            equipmentRepository.deleteById(id);
        }
    }

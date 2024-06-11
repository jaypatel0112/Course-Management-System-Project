package com.CourseManagementSystem.myappvs.rentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class EquipmentRepositoryTest {

    @Autowired
    private EquipmentRepository equipmentRepository;

    private Equipment equipment;

    @BeforeEach
    public void setUp() {
        equipment = new Equipment();
        equipment.setResourceName("Projector");
        equipment.setType("Electronics");
        equipment.setStatus("Available");
        equipment.setMaxQuantity(10);
        equipment.setAvailableQuantity(10);
    }

    @Test
    public void testRepository() {
        long repoCountBefore = equipmentRepository.count();

        equipmentRepository.save(equipment);
        Long equipmentId = equipment.getResourceId();
        assertEquals(repoCountBefore + 1, equipmentRepository.count());

        Equipment fetchedEquipment = equipmentRepository.findById(equipmentId).orElse(new Equipment());
        assertEquals(equipmentId, fetchedEquipment.getResourceId());
        assertEquals("Projector", fetchedEquipment.getResourceName());

        equipmentRepository.delete(equipment);
        assertEquals(repoCountBefore, equipmentRepository.count());
    }

    @Test
    public void testFindByStatus() {
        equipmentRepository.save(equipment);
        List<Equipment> availableEquipments = equipmentRepository.findByStatus("Available");
        assertFalse(availableEquipments.isEmpty());
        assertEquals("Available", availableEquipments.get(0).getStatus());

        equipmentRepository.delete(equipment);
    }
}
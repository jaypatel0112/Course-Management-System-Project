package com.CourseManagementSystem.myappvs.rentals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;


@Service
public class RentalService {
    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private RentalRepository rentalRepository;

    @Transactional
    public String rentEquipment(String userEmail, Long equipmentId, LocalDate rentalDate, LocalDate returnDate) {
        Optional<Equipment> optionalEquipment = equipmentRepository.findById(equipmentId);
        if (optionalEquipment.isPresent()) {
            Equipment equipment = optionalEquipment.get();

            // Check if user already rented this equipment
            boolean alreadyRented = rentalRepository.existsByUserEmailAndEquipmentAndReturnDateAfter(userEmail, equipment, LocalDate.now());
            if (alreadyRented) {
                return "You have already rented this equipment.";
            }

            // Check availability
            if (equipment.getAvailableQuantity() > 0) {
                equipment.setAvailableQuantity(equipment.getAvailableQuantity() - 1);
                equipmentRepository.save(equipment);

                Rental rental = new Rental();
                rental.setEquipment(equipment);
                rental.setUserEmail(userEmail);
                rental.setRentalDate(rentalDate);
                rental.setReturnDate(returnDate);
                rentalRepository.save(rental);

                return "Rental successful!";
            } else {
                return "No equipment available!";
            }
        } else {
            return "Equipment not found!";
        }
    }

    public List<Rental> getUserRentals(String userEmail) {
        return rentalRepository.findByUserEmail(userEmail);
    }

    public void deleteRentalById(Long id) {
        rentalRepository.deleteById(id);
    }
}

    public List<Rental> findAllRentals() {
        return rentalRepository.findAll();
    }
}


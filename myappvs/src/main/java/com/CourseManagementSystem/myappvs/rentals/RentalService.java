package com.CourseManagementSystem.myappvs.rentals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> findAllRentals() {
        return rentalRepository.findAll();
    }


}


package com.CourseManagementSystem.myappvs.rentals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CourseManagementSystem.myappvs.rentals.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

}

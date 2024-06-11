package com.CourseManagementSystem.myappvs.rentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;


@DataJpaTest
    @TestPropertySource(locations = "classpath:application-test.properties")
    public class RentalRepositoryTest {

        @Autowired
        private RentalRepository rentalRepository;

        private Rental rental;

        @BeforeEach
        public void setUp() {
            rental = new Rental();

            rental.setId(1L);
            rental.setRentalDate(LocalDate.now());
            rental.setReturnDate(LocalDate.now().plusDays(7));
        }

        @Test
        public void testRepository() {
            long repoCountBefore = rentalRepository.count();

            rentalRepository.save(rental);
            Long rentalId = rental.getId();
            assertEquals(repoCountBefore + 1, rentalRepository.count());

            Rental fetchedRental = rentalRepository.findById(rentalId).orElse(new Rental());
            assertEquals(rentalId, fetchedRental.getId());

            rentalRepository.delete(rental);
            assertEquals(repoCountBefore, rentalRepository.count());
        }
    }
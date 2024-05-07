package com.CourseManagementSystem.myappvs.rentals;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "Rentals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long allocationId;

    @Column(name = "class_id")
    private Long classId;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Equipment equipment;

    @Column(name = "allocation_date", nullable = false)
    private LocalDate allocationDate;

    @Column(name = "return_date")
    private LocalDate returnDate;
}

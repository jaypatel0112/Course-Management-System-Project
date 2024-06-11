package com.CourseManagementSystem.myappvs.instructor;
import com.CourseManagementSystem.myappvs.instructor.Instructor;
import com.CourseManagementSystem.myappvs.instructor.InstructorDto;
import com.CourseManagementSystem.myappvs.instructor.InstructorRepository;
import com.CourseManagementSystem.myappvs.instructor.InstructorService;
import com.CourseManagementSystem.myappvs.instructor.InstructorMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Time;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class InstructorTests {

    @Mock
    private InstructorRepository instructorRepository;

    @InjectMocks
    private InstructorService instructorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetInstructorDetail_InstructorDoesNotExist() {
        // Given
        Long instructorId = 1L;

        when(instructorRepository.findByInstructorId(instructorId)).thenReturn(Optional.empty());

        // When / Then
        assertThrows(RuntimeException.class, () -> {
            instructorService.getInstructorDetail(instructorId);
        });
    }
}

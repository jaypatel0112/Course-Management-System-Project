package com.CourseManagementSystem.myappvs.discussion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;





@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "discussion")
public class Discussion {
//    @Id
//    private Long id;


    private LocalDate date;

    private String topicHeading;

    private Long courseId;
    private String emailId;
    private String description;



}

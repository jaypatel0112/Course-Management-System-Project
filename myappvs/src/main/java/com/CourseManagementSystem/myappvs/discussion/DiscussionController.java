package com.CourseManagementSystem.myappvs.discussion;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/discussions")
public class DiscussionController {


    private DiscussionService discussionService;



    public DiscussionController(DiscussionService discussionService) {
        this.discussionService = discussionService;
    }

    @GetMapping("/showDiscussion/{id}")
    public  List<Discussion> showDiscussion(@PathVariable Long id){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Check if user is authenticated
        if (authentication != null && authentication.isAuthenticated()) {
            // Extract user email from authentication principal
            String emailId = authentication.getName();
            System.out.println("email id the user is "+emailId);
            List<Discussion> currentDiscussion = discussionService.getDiscussion(id);

            return currentDiscussion;


        }
        return null;

    }
    @PostMapping("/create")
    public Discussion createDiscussion(@Validated @RequestBody Discussion discussion) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
//            String emailId = authentication.getName();
//            // Here you can fetch and set the student object based on the
//
//
//            Long courseid = discussion.getCourseId();
//            UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//            discussion.setEmailId(userDetails.getUsername());
//
//            //discussion.setEmailId(emailId);
//            discussion.setId(Long.valueOf(UUID.randomUUID().toString()));
//            discussion.setDate(LocalDate.now());
            String emailId = authentication.getName();
            // Here you can fetch and set the student object based on the


            Long courseid= discussion.getCourseId();


            discussion.setEmailId(emailId);
            discussion.setDate(LocalDate.now());
            return discussionService.saveDiscussion(discussion);


        }
        return null;
    }
    @PutMapping("/update/{id}")
    public Discussion updateDiscussion(@PathVariable String emailId, @RequestBody Discussion discussionDetails) {
        return discussionService.updateDiscussion(emailId, discussionDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDiscussion(@PathVariable Long id) {
        discussionService.deleteDiscussion(String.valueOf(id));
    }
//    @PostMapping("/testInsert")
//    public Discussion insertTestDiscussion() {
//        Student student = new Student();
//        student.setStudentIdNumber(1L);
//        student.setEmailId("student@example.com");
//        student.setName("John Doe");
//
//        Catalog catalog = new Catalog();
//        catalog.setCourseId(1L);
//        catalog.setCourseId(101L);
//        catalog.setCourseName("Computer Science");
//
//
//        Discussion discussion = new Discussion();
//        //discussion.setId(1L);
//        discussion.setDate(LocalDate.now());
//        discussion.setTopicHeading("Introduction to CS101");
//
//        discussion.setCourseId(catalog.getCourseId());
//        discussion.setDescription("Discussion about the introduction to CS101 course.");
//
//        return discussionService.saveDiscussion(discussion);
//    }

}

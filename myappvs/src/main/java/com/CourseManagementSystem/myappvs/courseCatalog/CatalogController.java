package com.CourseManagementSystem.myappvs.courseCatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
	
	@Autowired
	private CatalogService service;
	
	@GetMapping("/getCourses")
	private List<Catalog> displayCourses(){
		return service.getAllCourses();
	}
	
	

}

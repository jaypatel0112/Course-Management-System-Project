package com.CourseManagementSystem.myappvs.advsior;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface AdvisorRepository extends CrudRepository<Advisor, Long> {

    
    List<Advisor> findByName(String name);
    
}

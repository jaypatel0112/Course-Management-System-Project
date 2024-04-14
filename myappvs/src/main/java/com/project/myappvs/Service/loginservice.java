package com.project.myappvs.Service;

import com.project.myappvs.Model.Student;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component 
public class Loginservice {
    public Boolean login(Student student){
        return true;
    }
}

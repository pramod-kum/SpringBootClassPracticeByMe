package ComponentScanTest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
//@Controller
public class Teacher {

    public String teach(){
        return "He is teaching Spring Boot";
    }
}

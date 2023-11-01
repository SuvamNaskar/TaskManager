package in.suvam.todoauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Rotator {
    @GetMapping("/")
    public String call()
    {
        sql s = new sql();
        s.insertRow();
        return "/";
    }
}

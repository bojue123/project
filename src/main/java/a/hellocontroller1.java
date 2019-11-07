package a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller1 {
    @ResponseBody
    @RequestMapping("/hello1")
    public String hello(){
        System.out.println("777");
        return "hello,world!";
    }

}

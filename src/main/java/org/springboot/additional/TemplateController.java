package org.springboot.additional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

    @RequestMapping("/template")
    public String showView() {
        return "hello-world";
    }

    @RequestMapping("/kiss")
    public String kiss() {return "kiss";}

    @RequestMapping("/dime")
    public String denis() {return "dime";}
}

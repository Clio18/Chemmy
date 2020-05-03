package clio.chemmy.viewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/start")
    public String locale() {
        return "start";
    }
}
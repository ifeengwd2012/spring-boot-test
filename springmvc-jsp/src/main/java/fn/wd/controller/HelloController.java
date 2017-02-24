package fn.wd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Time: 2017-02-23 17:02
 * Created by fengweidong.
 */
@Controller
public class HelloController {

    @Value("${application.message}")
    private String message;

    @RequestMapping("hello")
    public String hello(Model model){

        model.addAttribute("message",message);

        return "hello";
    }

    @RequestMapping("index")
    public String index(Model model){

        model.addAttribute("message",message);

        return "index";
    }

}

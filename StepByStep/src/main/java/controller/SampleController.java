package controller;

import model.Dummy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bijon on 8/31/2016.
 */
@Controller
public class SampleController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message","Hello!!!!");
        return "hello";
    }

    @RequestMapping("/add")
    public String addObject(Model model) {
        model.addAttribute("dummy",new Dummy());
        return "addObject";
    }
    @RequestMapping("/save")
    public String saveObject(Dummy dummy) {
        System.out.println(dummy.getField1());
        System.out.println(dummy.getField2());
        return "redirect:/add";
    }

}

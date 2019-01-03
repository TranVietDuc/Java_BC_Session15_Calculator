package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Caculate {

    @GetMapping("/")
    public ModelAndView getStart (){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/processCaculation")
    public ModelAndView ProcessCaculation (@RequestParam(name = "number1") double number1,@RequestParam(name = "number2") double number2,@RequestParam(name = "operation") String operation){
        ModelAndView modelAndView = new ModelAndView("index");
        double result ;
        switch (operation){
            case "Mul":
                result = number1 * number2;
                break;
            case "Sub":
                result = number1 - number2;
                break;
            case "Div" :
                result = number1/number2;
                break;
            default:   result = number1 + number2;
        }
        modelAndView.addObject("result","Result is: " + result);

        return modelAndView;
    }
}

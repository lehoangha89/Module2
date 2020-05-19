package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;

@Controller
public class Calculator {
    @Autowired
    CalculatorService calculatorService;
    @GetMapping("/")
    String getIndex(){
        return "index";
    }

    @RequestMapping("/ketqua")
    public String ketqua(@RequestParam String number1, @RequestParam String number2, @RequestParam String cal, Model model) {
        model.addAttribute("so1", number1);
        model.addAttribute("so2", number2);
        model.addAttribute("calculator", calculatorService.cal(Double.parseDouble(number1), Double.parseDouble(number2), cal));
        return "index";
    }

}

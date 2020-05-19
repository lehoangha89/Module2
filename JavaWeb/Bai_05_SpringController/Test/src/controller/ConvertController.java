package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;

@Controller
public class ConvertController {
    @Autowired
    ConvertService convertService;
    @GetMapping("/convert")
    public String ketqua(Model model, @RequestParam String USD,@RequestParam String VND){
        double result=convertService.convert(Double.parseDouble(USD),Double.parseDouble(VND));
        model.addAttribute("ketqua",result);
        return "result";
    }
}

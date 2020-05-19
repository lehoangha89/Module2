package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ChuyenDoi;

@Controller
public class Convert {
    @Autowired
    ChuyenDoi chuyenDoi;
    @GetMapping("/convert")
    public String convert(@RequestParam String USD,@RequestParam String VND, Model model){
        double result=chuyenDoi.result(Double.parseDouble(USD),Double.parseDouble(VND));
        model.addAttribute("ketqua",result);
        return "result";
    }
}

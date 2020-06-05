package com.codegym.controller;

import com.codegym.model.DichvuDiKem;
import com.codegym.service.DichvuDikemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DichvuDikemController {
    @Autowired
    private DichvuDikemService dichvuDikemService;

    @GetMapping("/create-dikem")
    public ModelAndView showDikem(){
        ModelAndView modelAndView=new ModelAndView("dichvuDikem/create");
        modelAndView.addObject("createDikem",new DichvuDiKem());
        return modelAndView;
    }

    @PostMapping("/create-dikem")
    public ModelAndView save(@Valid @ModelAttribute ("createDikem") DichvuDiKem dichvuDiKem,
                             BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("dichvuDikem/create");
            return modelAndView;
        }
        dichvuDikemService.save(dichvuDiKem);
        ModelAndView modelAndView=new ModelAndView("dichvuDikem/create");
        modelAndView.addObject("createDikem",new DichvuDiKem());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }
}

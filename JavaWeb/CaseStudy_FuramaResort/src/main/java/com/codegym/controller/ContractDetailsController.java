package com.codegym.controller;

import com.codegym.model.Contract;
import com.codegym.model.ContractDetails;
import com.codegym.model.Customer;
import com.codegym.model.DichvuDiKem;
import com.codegym.service.ContractDetailsService;
import com.codegym.service.ContractService;
import com.codegym.service.DichvuDikemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ContractDetailsController {
    @Autowired
    private ContractDetailsService contractDetailsService;
    @Autowired
    private DichvuDikemService dichvuDikemService;
    @Autowired
    private ContractService contractService;

    @ModelAttribute("dichvudi_kem")
    public Iterable<DichvuDiKem> dichvuDiKems() {
        return dichvuDikemService.findAll();
    }
    @ModelAttribute("con_tract")
    public Page<Contract> contracts(Pageable pageable) {
        return contractService.findAll(pageable);
    }

    @GetMapping("/list-contractDetails")
    public ModelAndView listContract(@RequestParam("keyword") Optional<String> keyword) {
        Iterable<ContractDetails> contractDetails=contractDetailsService.findAll();
        ModelAndView modelAndView = new ModelAndView("contractDetails/list");
        modelAndView.addObject("contractDetailsList", contractDetails);
        return modelAndView;
    }

    @GetMapping("/create-contractDetails")
    public ModelAndView showContractDetails(){
        ModelAndView modelAndView=new ModelAndView("contractDetails/create");
        modelAndView.addObject("createContractDetails",new ContractDetails());
        return modelAndView;
    }
    @PostMapping("/create-contractDetails")
    public ModelAndView saveContractDetails(@Valid @ModelAttribute("createContractDetails") ContractDetails contractDetails,
                                     BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("contractDetails/create");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("contractDetails/create");
        contractDetailsService.save(contractDetails);
        modelAndView.addObject("createContractDetails", new ContractDetails());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/edit-contractDetails/{id}")
    public ModelAndView editContractDetails(@PathVariable Long id) {
        ContractDetails contractDetails = contractDetailsService.findById(id);
        if (contractDetails != null) {
            ModelAndView modelAndView = new ModelAndView("contractDetails/edit");
            modelAndView.addObject("contractDetailsEdit", contractDetails);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-contractDetails")
    public ModelAndView updateContract(@Validated @ModelAttribute("contractDetailsEdit") ContractDetails contractDetails,
                                       BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/contractDetails/edit");
            return modelAndView;
        }
        contractDetailsService.save(contractDetails);
        ModelAndView modelAndView = new ModelAndView("/contractDetails/edit");
        modelAndView.addObject("message", "Contract Details updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-contractDetails/{id}")
    public ModelAndView showDelete(@PathVariable Long id) {
        ContractDetails contractDetails = contractDetailsService.findById(id);
        if (contractDetails != null) {
            ModelAndView modelAndView = new ModelAndView("contractDetails/delete");
            modelAndView.addObject("contractDetailsDelete", contractDetails);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-contractDetails")
    public String remove(@ModelAttribute("contractDetailsDelete") ContractDetails contractDetails) {
        contractDetailsService.delete(contractDetails.getId());
        return "redirect:list-contractDetails";
    }
}

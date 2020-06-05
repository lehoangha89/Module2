package com.codegym.controller;


import com.codegym.model.*;
import com.codegym.service.EmployeeService;
import com.codegym.service.LevelEmployeeService;
import com.codegym.service.PartEmployeeService;
import com.codegym.service.PositionEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private LevelEmployeeService levelEmployeeService;
    @Autowired
    private PartEmployeeService partEmployeeService;
    @Autowired
    private PositionEmployeeService positionEmployeeService;

    @ModelAttribute("position_employee")
    public List<PositionEmployee> positionEmployees() {
        return positionEmployeeService.findAll();
    }
    @ModelAttribute("level_employee")
    public List<LevelEmployee> levelEmployees() {
        return levelEmployeeService.findAll();
    }
    @ModelAttribute("part_employee")
    public List<PartEmployee> partEmployees() {
        return partEmployeeService.findAll();
    }

    @GetMapping("/create-level")
    public ModelAndView showLevel(){
        ModelAndView modelAndView=new ModelAndView("employee/level");
        modelAndView.addObject("createLevel",new LevelEmployee());
        return modelAndView;
    }
    @PostMapping("/create-level")
    public ModelAndView saveLevel(@Valid @ModelAttribute("createLevel") LevelEmployee levelEmployee,
                                  BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("employee/level");
            return modelAndView;
        }
        levelEmployeeService.save(levelEmployee);
        ModelAndView modelAndView=new ModelAndView("employee/level");
        modelAndView.addObject("createLevel",new LevelEmployee());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/create-part")
    public ModelAndView showPart(){
        ModelAndView modelAndView=new ModelAndView("employee/part");
        modelAndView.addObject("createPart",new PartEmployee());
        return modelAndView;
    }
    @PostMapping("/create-part")
    public ModelAndView savePart(@Valid @ModelAttribute("createPart") PartEmployee partEmployee,
                                 BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("/employee/part");
            return modelAndView;
        }
        partEmployeeService.save(partEmployee);
        ModelAndView modelAndView=new ModelAndView("/employee/part");
        modelAndView.addObject("createPart",new PartEmployee());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/list-employee")
    public ModelAndView listService(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 3) Pageable pageable) {
        Page<Employee> employees;
        String keywordEmployee=null;
        if (keyword.isPresent()) {
            keywordEmployee=keyword.get();
            employees = employeeService.findAllByNameEmployeeContaining(keywordEmployee, pageable);
        } else {
            employees = employeeService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("keyword",keywordEmployee);
        modelAndView.addObject("listEmployee", employees);
        if (employees.getTotalPages() == 0) {
            modelAndView.addObject("message", "Not found!");
        }
        return modelAndView;
    }

    @GetMapping("/create-employee")
    public ModelAndView showCreateEmployee() {
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("createEmployee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public ModelAndView saveEmployee(@Valid @ModelAttribute("createEmployee") Employee employee,
                                     BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("employee/create");
            return modelAndView;
        }
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("createEmployee", new Employee());
        modelAndView.addObject("message", "Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView editEmployee(@PathVariable Long id){
        Employee employee=employeeService.findById(id);
        if (employee!=null){
            ModelAndView modelAndView=new ModelAndView("employee/edit");
            modelAndView.addObject("editEmployee",employee);
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("erorr.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-employee")
    public ModelAndView updateEmployee(@Valid @ModelAttribute ("editEmployee") Employee employee,
                                       BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("employee/edit");
            return modelAndView;
        }
        employeeService.save(employee);
        ModelAndView modelAndView=new ModelAndView("employee/edit");
        modelAndView.addObject("editEmployee",employee);
        modelAndView.addObject("message","Thay đổi thành công");
        return modelAndView;
    }

    @GetMapping("/delete-employee/{id}")
    public ModelAndView deleteEmployee(@PathVariable Long id){
        Employee employee=employeeService.findById(id);
        if (employee!=null){
            ModelAndView modelAndView=new ModelAndView("employee/delete");
            modelAndView.addObject("deleteEmployee",employee);
            return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("erorr.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-employee")
    public String remove(@ModelAttribute("employee") Employee employee) {
        employeeService.delete(employee.getId());
        return "redirect:list-employee";
    }
}

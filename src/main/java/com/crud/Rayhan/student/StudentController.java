package com.crud.Rayhan.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student_information_insert")
    public String greeting(Model model) {
		StudentEntity studentEntity =new StudentEntity();
		model.addAttribute("crud", studentEntity);
		
        return "Student/home";
        
      
    }
	
	@PostMapping("/student_information_save")
	public String save(StudentEntity studentEntity){
		studentService.save(studentEntity);
		return "redirect:student_information_insert";//For redirect use controller
		
	}
	
	@GetMapping("/student_information_showlist")
	public String showList(Model model){
		model.addAttribute("student_list", studentService.list());
		return "Student/list";
	}
	
	@GetMapping("/student_information_delete/{id}")
	public String delete(@PathVariable int id){
		studentService.delete(id);
		return "redirect:/student_information_showlist";
	}
	
	@GetMapping("/student_information_edit/{id}")
	
	public String edit(@PathVariable int id,Model model){
		
	
		model.addAttribute("student_entity", studentService.edit(id));
		
	return "Student/rename";
	
		
	}

}
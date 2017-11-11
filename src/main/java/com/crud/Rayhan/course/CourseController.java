package com.crud.Rayhan.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/course_information_insert")
    public String greeting(Model model) {
		CourseEntity courseEntity =new CourseEntity();
		model.addAttribute("crud1", courseEntity);
		
        return "Courses/home1";
        
      
    }
	
	@PostMapping("/course_information_save")
	public String save(CourseEntity courseEntity){
		courseService.save(courseEntity);
		return "redirect:course_information_insert";//For redirect use controller
		
	}
	
	@GetMapping("/course_information_showlist")
	public String showList(Model model){
		model.addAttribute("course_list", courseService.list());
		return "Courses/list1";
	}
	
	@GetMapping("/course_information_delete/{id}")
	public String delete(@PathVariable int id){
		courseService.delete(id);
		return "redirect:/course_information_showlist";
	}
	
	@GetMapping("/course_information_edit/{id}")
	
	public String edit(@PathVariable int id,Model model){
		
	
		model.addAttribute("course_entity", courseService.edit(id));
		
	return "Courses/rename1";
	
		
	}


}

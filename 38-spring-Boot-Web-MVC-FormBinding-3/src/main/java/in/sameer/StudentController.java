package in.sameer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sameer.binding.Student;

@Controller
public class StudentController {
	
	public String formLoad(Model model) {
		
		List<String> coursel = new ArrayList<>();
		coursel.add("Java");
		coursel.add("Python");
		coursel.add("Php");
		coursel.add(".Net");
		
		List<String> timingL = new ArrayList<>();
		timingL.add("Morning");
		timingL.add("Afternoon");
		timingL.add("Evening");
		
		Student student = new Student();
		model.addAttribute("courses",coursel);
		model.addAttribute("timings",timingL);
		model.addAttribute("student",student);
		return "index";
		
	}
	
	
	  @PostMapping("/save") 
	  public String handleSubmit(Student s, Model model) {
	  System.out.println(s);
	  
	  List<String> coursel = new ArrayList<>(); 
	  coursel.add("Java");
	  coursel.add("Python"); 
	  coursel.add("Php"); 
	  coursel.add(".Net");
	  
	  List<String> timingL = new ArrayList<>(); 
	  timingL.add("Morning");
	  timingL.add("Afternoon");
	  timingL.add("Evening");
	  
	  Student student = new Student();
	  model.addAttribute("courses",coursel);
	  model.addAttribute("timings",timingL); 
	  model.addAttribute("student",student);
	  
	  model.addAttribute("msg","Student Saved");
	  
	  return "index"; 
	  
	  }
	 
}

package in.sameerit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<String> getCourses(){
		return Arrays.asList("java","Python","PHP","AWS");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning","Evening","Afternoon","Night");
	}
}

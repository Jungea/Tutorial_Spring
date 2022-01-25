package kr.co.mytutorial.controller;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mytutorial.model.Student;

@Controller()
@RequestMapping("form")
public class FormController {

	String view_prefix = "form/";

	@RequestMapping("/")
	public String index(Model model) {
		return view_prefix + "index";
	}

	@RequestMapping(value = "/edit1", method = RequestMethod.GET)
	public String edit1(Model model) {
		return view_prefix + "edit1";
	}

	@RequestMapping(value = "/edit1", method = RequestMethod.POST)
	public String edit1(Model model, @RequestParam("name") String name, @RequestParam("grade") int grade) {
		model.addAttribute("name", name);
		model.addAttribute("grade", grade);
		System.out.printf("이름: %s. 학년: %d\n", name, grade);
		return view_prefix + "edit1";
	}

	@RequestMapping(value = "/edit2", method = RequestMethod.GET)
	public String edit2(Model model) {
		model.addAttribute("student", new Student());
		return view_prefix + "edit2";
	}

	@RequestMapping(value = "/edit2", method = RequestMethod.POST)
	public String edit2(Model model, Student student) {
		System.out.printf("이름: %s. 학년: %d\n", student.getName(), student.getGrade());
		return view_prefix + "edit2";
	}

	@RequestMapping(value = "/edit3", method = RequestMethod.GET)
	public String edit3(Model model) {
		model.addAttribute("student", new Student());
		return view_prefix + "edit3";
	}

	@RequestMapping(value = "/edit3", method = RequestMethod.POST)
	public String edit3(Model model, Student student) {
		System.out.printf("이름: %s. 학년: %d\n", student.getName(), student.getGrade());
		return view_prefix + "edit3";
	}

}

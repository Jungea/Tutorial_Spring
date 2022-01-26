package kr.co.mytutorial.controller.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mytutorial.dto.Department;
import kr.co.mytutorial.dto.Student;
import kr.co.mytutorial.mapper.DepartmentMapper;
import kr.co.mytutorial.mapper.StudentMapper;

@Controller
@RequestMapping("mybatis/student")
public class StudentController {

	String view_prefix = "mybatis/student/";

	@Autowired
	StudentMapper studentMapper;
	@Autowired
	DepartmentMapper departmentMapper;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "좋은 아침");
		return view_prefix + "index";
	}

	@RequestMapping("list")
	public String list(Model model) {
		List<Student> students = studentMapper.findAll();
		model.addAttribute("students", students);
		return view_prefix + "list";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		Student student = new Student();
		List<Department> departments = departmentMapper.findAll();
		model.addAttribute("student", student);
		model.addAttribute("departments", departments);
		return view_prefix + "edit";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(Model model, Student student) {
		studentMapper.insert(student);
		return "redirect:list";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(Model model, @RequestParam("id") int id) {
		Student student = studentMapper.findOne(id);
		List<Department> departments = departmentMapper.findAll();
		model.addAttribute("student", student);
		model.addAttribute("departments", departments);
		return view_prefix + "edit";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String edit(Model model, Student student) {
		studentMapper.update(student);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(Model model, @RequestParam("id") int id) {
		studentMapper.delete(id);
		return "redirect:list";
	}
}

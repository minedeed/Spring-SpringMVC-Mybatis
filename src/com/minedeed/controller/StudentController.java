package com.minedeed.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.minedeed.entiy.Student;
import com.minedeed.service.StudentService;
import com.minedeed.utill.ResponseUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("student")
public class StudentController {
	@Resource
	private StudentService studentSerivce;
	private Student stu = null;

	@RequestMapping("/login")
	public ModelAndView login(String username, String password, Model model) throws IOException {
		stu = new Student();
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		stu.setUsername(username);
		stu.setPassword(password);
		System.out.println("23333" + stu.getUsername());
		ModelAndView modelAndView = new ModelAndView();
		stu = studentSerivce.login(stu);
		if (stu == null) {
			modelAndView.setViewName("fail");
		} else if (stu != null) {
			modelAndView.addObject("username", username);
			modelAndView.addObject("password", password);
			modelAndView.addObject("id", stu.getId());
			modelAndView.addObject("name", stu.getName());
			modelAndView.addObject("address", stu.getAddress());
			modelAndView.addObject("birthday", stu.getBirthday());
			modelAndView.addObject("tel", stu.getTel());
			modelAndView.addObject("email", stu.getEmail());
			modelAndView.addObject("stu", stu);
			modelAndView.setViewName("success");
		}
		return modelAndView;

	}

	@RequestMapping("/login2")
	public ModelAndView login(HttpServletResponse res) throws IOException {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("login");

		return modelAndView;

	}

	// 添加或者修改
	@RequestMapping("/reg")
	public ModelAndView reg(Student student, HttpServletResponse res) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("reg");

		return modelAndView;
	}

	@RequestMapping("/test")
	public ModelAndView dotest(HttpServletResponse res, HttpServletRequest req) {
		System.out.println("aaaa");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;

	}

	@RequestMapping("/daka")
	public ModelAndView daka() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("dacg");
		return mav;

	}

	@RequestMapping("/addUser")
	public ModelAndView addUser(String name, String username, String password, String address, String birthday,
			String tel, String email, Model model) {
		stu = new Student();
		model.addAttribute("name", name);
		model.addAttribute("password", password);
		model.addAttribute("address", address);
		model.addAttribute("birthday", birthday);
		model.addAttribute("tel", tel);
		model.addAttribute("email", email);
		model.addAttribute("username", username);
		stu.setName(name);
		stu.setPassword(password);
		stu.setAddress(address);
		stu.setTel(tel);
		stu.setEmail(email);
		stu.setBirthday(birthday);
		stu.setUsername(username);
		studentSerivce.add(stu);
		System.out.println(stu.getName() + stu.getAddress());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return null;
	}
	@RequestMapping("/query")
	public ModelAndView queryUser(Integer id,Model model){
		model.addAttribute("id", id);
		stu=studentSerivce.query(id);
		
		System.out.println(stu.getName() + stu.getAddress());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", stu);
		modelAndView.setViewName("update");
		return modelAndView;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateUser(Student stu, Model model){
		System.err.println(stu.getId());
		studentSerivce.update(stu);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("updateSuccess");
		return modelAndView;
		
	}

}

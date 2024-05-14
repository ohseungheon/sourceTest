package com.example.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.miniproject.entity.Corpor;
import com.example.miniproject.repository.CorRepository;
import com.example.miniproject.repository.JobOpeningRepository;

@Controller
public class MyController {
	@Autowired
	CorRepository correpository;
	@Autowired
	JobOpeningRepository jobopeningrespository;
	@RequestMapping("/")
	public String root() {

		return "loginForm";
	}

	@RequestMapping("/signUpForm")
	public String signUpForm() {

		return "signUpForm";
	}

	@RequestMapping("/signUp")
	public String signUp() {

		return "signUpSuccess";
	}

	@RequestMapping("/loginForm")
	public String loginForm() {

		return "loginForm";
	}

	@RequestMapping("/login")
	public String login() {

		return "main";
	}

	@RequestMapping("/searchMain")
	public String searchMain() {

		return "searchMain";
	}

//	@RequestMapping("/showCorList")
//	public @ResponseBody String showCorList(Model model) {
//		List<Corpor> list = correpository.findAll();
//		model.addAttribute("list", list);
//
//		Gson gson = new Gson();
//		JsonObject copor = new JsonObject();
//	    for (Corpor dto : list) {
//	        JsonObject corporInfo = new JsonObject(); // 새로운 JsonObject를 생성하여 각 객체의 정보를 담음
//
//	        corporInfo.addProperty("cno", dto.getCno());
//	        corporInfo.addProperty("cname", dto.getCname());
//
//	        // 현재 반복되는 객체의 정보를 별도의 JsonObject에 담은 후, 이를 전체 JsonObject에 추가함
//	        copor.add("corpor" + dto.getCno(), corporInfo);
//	    }
//		String jsonStr = gson.toJson(copor);
//		System.out.println(jsonStr);
//		return jsonStr;
//	}
	@RequestMapping("/showCorList1")
	public String showCorList1(@RequestParam("search") String search  , Model model) {
		List<Corpor> list1 = correpository.getCorporList(search);
		model.addAttribute("list1", list1);
		return "searchMain";
	}
	
	@RequestMapping("/showCorList2")
	public String showCorList2(@RequestParam("search") String search  , Model model) {
		List<Corpor> list2 = correpository.getCorporList(search);
		model.addAttribute("list2", list2);
		return "searchMain";
	}
	

}

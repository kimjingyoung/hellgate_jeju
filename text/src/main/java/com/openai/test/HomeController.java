package com.openai.test;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mysql.cj.Session;
import com.openai.test.dto.MemberDto;
import com.openai.test.service.MemberService;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private ModelAndView mv;
	
	
	@Autowired
	private MemberService sv;
	
	@GetMapping("/")
	public String home() {
		logger.info("home()");
		
		return "home";
	}
	
	@GetMapping("/joinFrm")
	public String joinFrm() {
		logger.info("joinFrm()");
		String view =null;
		view = "joinFrm";
		
		return view;
	}
	
	@PostMapping("/joinProc")
	public String joinProc(MemberDto dto,  RedirectAttributes rttr) {
		logger.info("joinProc()");
		String view = null;
		
		view = sv.joinMember(dto, rttr);
		
		return view;
	}
	
	@PostMapping("/LoginProc")
	public String LoginProc(MemberDto dto, HttpSession session, RedirectAttributes rttr) {
		logger.info("LoginProc()");
		
		String view = sv.loginProc(dto,session , rttr);
		
		return view;
	}
	
	@GetMapping("/main")
	public String mainFrm() {
		logger.info("mainFrm()");
		String view = "main";
		
		return view;
	}
	
	@GetMapping("/update")
	public String update() {
		logger.info("update()");
		String view = "updateFrm";
		
		return view;
	}
	
	@PostMapping("/updateProc")
	public String updateProc(MemberDto dto, HttpSession session, RedirectAttributes rttr) {
		logger.info("updateProc()");
		String view = null;
		
		view = sv.updateProc(dto, session, rttr);
		
		return view;
	}
	
	@GetMapping("/deleteProc")
	public String deleteProc(HttpSession session, RedirectAttributes rttr) {
		logger.info("deleteProc()");
		String view = null;
		
		view=sv.deleteProc(session, rttr);
		
		return view;
	}
	@GetMapping("/admloginProc")
	public String admloginProc(MemberDto dto, HttpSession session, RedirectAttributes rttr) {
		logger.info("admloginProc()");
		String view =sv.admloginProc(dto, session, rttr);
		
		
		return view;
	}
	
}

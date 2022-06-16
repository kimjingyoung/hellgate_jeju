package com.openai.test.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.openai.test.dao.MemberDao;
import com.openai.test.dto.MemberDto;

import lombok.extern.java.Log;

@Service
public class MemberService {
	@Autowired // 얘다른곳에 있어서 끌고와서 쓰기위해 작성(servlet context .xml beens graph 에 있음)
	private MemberDao dao;

	private ModelAndView mv; // 일반 객체
//	

	public String joinMember(MemberDto dto, RedirectAttributes rttr) {
		String view = null;
		String msg = null;

		try {
			dao.joinMember(dto);
			msg = "회원가입성공!";
			view = "redirect:/";

		} catch (Exception e) {
			e.printStackTrace();
			view = "redirect:joinFrm";
			msg = "퉤";
		}

		rttr.addFlashAttribute("msg", msg);

		return view;
	}

	public String loginProc(MemberDto dto, HttpSession session , RedirectAttributes rttr) {
		String view = null;
		String msg = null;

		int num = dao.LoginProc(dto); // 1을
		

		if (num == 1) {
			// 로그인 성공시점
			dto = dao.getInfo(dto);
			session.setAttribute("info",dto);
			view = "redirect:main";
			
		} else {
			msg = "입력한 정보가 맞지 않습니다.";
			view = "redirect:/";
		}
		
		rttr.addFlashAttribute("msg", msg);
		
		return view;
	}
	
	public String updateProc(MemberDto dto, HttpSession session, RedirectAttributes rttr) {
		String msg = null;
		String view = null;
	
		try {
			dao.updateProc(dto);
			dto = dao.getInfo(dto);
			session.setAttribute("info", dto);
			msg = "회원정보가 수정되었습니다.";
			view = "redirect:main";
		} catch(Exception e) {
			e.printStackTrace();
			msg = "회원정보 수정을 실패했습니다";
			view="redierct:update";
		}
		rttr.addFlashAttribute("msg",msg);
		
		return view;
	}
	
	public String deleteProc( HttpSession session, RedirectAttributes rttr) {
		String msg=null;
		String view=null;
		MemberDto dto = (MemberDto)session.getAttribute("info");
		try {
			dao.deleteProc(dto);
			session.removeAttribute("info");
			msg="데이터 삭제 성공";
			view = "redirect:main";
		}catch (Exception e) {
			e.printStackTrace();
			msg="데이터 삭제 안됨 ㅅㄱ";
			view="redirect:main";
		}
		rttr.addFlashAttribute("msg", msg);
		return view;
		
	}
	public String admloginProc(MemberDto dto, HttpSession session, RedirectAttributes rttr) {
		String msg = null;
		String view = null;
		
		int num = dao.admloginProc(dto);
		
		if(num == 1) {
			dto = dao.getInfo(dto);
			session.setAttribute("admin", dto);
			msg="관리자 로그인 성공";
			view="redirect:adminFrm";
		}
		else {
			msg="관리자 로그인에 실패하였습니다.";
			view = "redirect:/";
		}
		rttr.addFlashAttribute("msg",msg);
		
		return view;
	}

}

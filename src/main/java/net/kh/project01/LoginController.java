package net.kh.project01;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/login")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//1.세션 종료
		session.invalidate();
		//2.홈으로 이동
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(String id, String pwd, String toURL, boolean rememberId, HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("id = " + id);
		System.out.println("pwd = " + pwd);
		System.out.println("rememberId = " + rememberId);
		//1.id, pwd 확인
		if(!loginCheck(id, pwd)) {
			//2-1.일치하지 않으면 로그인 폼으로 이동
			String msg = URLEncoder.encode("id 또는 pwd가 일치하지 않습니다.", "utf-8");
			
			return "redirect:/login/login?msg="+msg;
		}
		//2-2.일치하면 홈으로 이동
		//2-3.세션 객체 얻어오기
		HttpSession session = request.getSession();
		//2-4.세션 객체에 id저장
		session.setAttribute("id", id);
		
		if(rememberId) {
			//3-1.쿠키 생성
			Cookie cookie = new Cookie("id", id);
			//4-1.응답에 저장
			response.addCookie(cookie);
		} else {
			//3-2.쿠키 삭제
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(0);
			
			response.addCookie(cookie);
		}
		//5. 홈으로 이동
		toURL = toURL == null || toURL.equals("") ?  "/" : toURL;
		return "redirect:" + toURL;
	}

	private boolean loginCheck(String id, String pwd) {
		return "asdf".equals(id) && "12345678".equals(pwd);
	}

}

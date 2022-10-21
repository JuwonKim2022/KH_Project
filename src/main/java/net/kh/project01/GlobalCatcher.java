package net.kh.project01;

import java.io.FileNotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("net.kh.project02") //지정된 패키지 내에서만 예외 처리
public class GlobalCatcher {
	
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, Model m) {
//		System.out.println("catcher() in Global - ExceptionController");
		m.addAttribute("ex", ex);
		return "error";
	}
	@ExceptionHandler({NullPointerException.class, FileNotFoundException.class})
	public String catcher2(Exception ex, Model m) {
//		System.out.println("catcher2() in Global - ExceptionController");
		m.addAttribute("ex", ex);
		return "error";
	}

}

package net.kh.project01;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST) //<- 500에서 400으로 바뀜
class MyException extends RuntimeException{
	MyException(String msg) {
		super(msg);
	}
	MyException() { 
		this("");
	}
}

@Controller
public class ExceptionController2 {
	
	@RequestMapping("/ex4")
	public String main4() throws Exception {
		throw new MyException("예외가 발생했습니다.");
	}
	@RequestMapping("/ex5")
	public String main5() throws Exception {
		throw new FileNotFoundException("File Not Found 예외가 발생했습니다.");
	}
}

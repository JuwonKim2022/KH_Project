package net.kh.project01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.naming.Binding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC6 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex, BindingResult result) {
			System.out.println("result = " + result);
			FieldError error = result.getFieldError();
		
			System.out.println("code = " + error.getCode());
			System.out.println("field = " + error.getField());
			System.out.println("msg = " + error.getDefaultMessage());
		ex.printStackTrace();
		return "yoilError";
	}

	@RequestMapping("/getYoilMVC6")
		public String main(MyDate date, BindingResult result) {
		System.out.println("result = " + result);
		
		if (!isValid(date)) {
			return "yoilError";
		}
		
		return "yoil";
	}

	private boolean isValid(MyDate date) {
		return isValid(date.getYear(), date.getMonth(), date.getDay());
	}

	private @ModelAttribute("yoil") char getYoil(MyDate date) {
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
	}
	
	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		
		int datOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1.일요일		2.월요일	...
		return "일월화수목금토".charAt(datOfWeek);
	}

	private boolean isValid(int year, int month, int day) {
		return true;
	}

	

}

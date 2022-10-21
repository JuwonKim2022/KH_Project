package net.kh.project01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class YoilTellerMVC5 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
		ex.printStackTrace();
		return "yoilError";
	}

	@RequestMapping("/getYoilMVC5")
//	public String main(@ModelAttribute("myDate") MyDate date , Model model) throws IOException { 
		public String main(@ModelAttribute MyDate date , Model model) throws IOException { //생략 가능. 이와 같음
		
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

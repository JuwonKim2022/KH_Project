package net.kh.project01;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController {
//	@RequestMapping("/register/add")
//	@GetMapping("/register/add") -> 이 메서드를 servlaet-context 코드 한줄 입력하면 없애도 됨
//	public String register() {
//		return "registerForm";
//	}
	
//	@RequestMapping(value="/register/save", method = RequestMethod.POST)
	
	//날짜 형식 적절하게 변환해주는 메소드
	@InitBinder
	public void toDate(WebDataBinder binder) {
		ConversionService conversionService = binder.getConversionService();
//		System.out.println("conversionService=" + conversionService);
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
//		binder.registerCustomEditor(String[].class, "hobby", new StringArrayPropertyEditor("#"));
//		binder.setValidator(new UserValidator()); //UserValidator를 WebDataBinder의 로컬validator로 등록
//		binder.addValidators(new UserValidator());


	}
	
	@RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
	public String Register() {
		return "registerForm";
	}
	
	@PostMapping("/save")	//4.3부터
	public String save(@Valid User user, BindingResult result, Model m) throws Exception{
		System.out.println("result = " + result);
		System.out.println("user = " + user);
		
		//수동 검증 : Validator를 직접 생성, 직접 호출
//		UserValidator userValidator = new UserValidator();
//		userValidator.validate(user, result);	//BindingResult는 Error의 자손
		
		//User객체를 검증한 결과 에러가 있으면, registerForm을 이용해서 에러를 보여줘야 함
		if(result.hasErrors()) {
			return "registerForm";
		}
		//유효성 검사
//		if(!isValid(user)) {
//			String msg = URLEncoder.encode("id를 잘못 입력하셨습니다.", "utf-8");
//			
//			m.addAttribute("msg", msg);
//			return "forward:/register/add";
//			return "redirect:/register/add";
//		}
//
		return "registerInfo";
	}

private boolean isValid(User user) {
	return false;
}
}
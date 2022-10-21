package net.kh.project01;

import javax.crypto.spec.IvParameterSpec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	int iv = 10;
	static int cv = 20;
	
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello - private static");
		System.out.println(cv);
		System.out.println(iv);
	}
	
	public static void main2() {
		System.out.println(cv);
////		System.out.println(iv);	에러
	}

}

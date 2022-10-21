package net.kh.project01;

import java.lang.reflect.Method;
import java.sql.Connection;

public class PrivateMethodCall {

	public static void name(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();
		
		Class helloClass = Class.forName("net.kh.project01.Hello");
		Hello hello = (Hello)helloClass.newInstance();
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true);
		
		main.invoke(hello);
	}	
	
}


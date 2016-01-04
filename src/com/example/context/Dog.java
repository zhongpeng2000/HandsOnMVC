/**
 * 
 */
package com.example.context;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author zhongpeng
 *
 */
public class Dog implements HttpSessionBindingListener{
	private String breed;

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("I am in a session");
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("I am not in a session");
		
	}
	
	

}

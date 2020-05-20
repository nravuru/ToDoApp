/**
 * 
 */
package com.todo.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author naresh.ravurumckesson.com
 *
 */
@RequestMapping("/")
public class LoginController {

	@GetMapping("/jaffa")
	public void login() {
		System.out.println("Login please");
	}
}

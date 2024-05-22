package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Palindromo {
	
	@GetMapping("/validate/{w}")
	public String Palindrome(@PathVariable String w) {
		if (isPal(w)) {
			return "the word " + w + " is palindrome";
		}else {
			return "the word  " + w + " isn't palindrome";
		}
	}
	
	private boolean isPal(String w) {
		int l = w.length();
		for (int i = 0; i < l / 2; i++) {
			if(w.charAt(i) != w.charAt(l - i - 1)){
				return false;
			}
		}
		return true;
	}
	
	
	
}

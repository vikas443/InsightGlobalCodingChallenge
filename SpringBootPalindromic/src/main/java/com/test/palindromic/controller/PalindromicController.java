package com.test.palindromic.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.palindromic.model.PalinDromicModel;
import com.test.palindromic.service.PalindromicService;

@RestController 
public class PalindromicController {

	@Autowired
	PalindromicService palindromicService;
	@GetMapping("/getPalindromicStr")
	public String retrieveCoursesForStudent(@RequestParam(required = false) String str) {
		 
		String subStr= palindromicService.findTheLongestPalindrome(str);
		PalinDromicModel persitedPalinDromicModel = palindromicService.saveString(subStr);
		PalinDromicModel resPalinDromicModel = palindromicService.fetchData(persitedPalinDromicModel.getId());
	 	return 	resPalinDromicModel.getName();
	}
}

package com.test.palindromic.service;

 

import com.test.palindromic.model.PalinDromicModel;

public interface PalindromicService {

	public PalinDromicModel saveString(String str);
	public PalinDromicModel fetchData(Integer id);
	public String findTheLongestPalindrome(String str);
}

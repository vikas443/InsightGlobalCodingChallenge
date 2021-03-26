package com.test.palindromic.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.palindromic.model.PalinDromicModel;
import com.test.palindromic.repository.PalinDromicRepository;
import com.test.palindromic.service.PalindromicService;

@Service
public class PalindromicServiceImpl implements PalindromicService {

	
	@Autowired
	PalinDromicRepository palinDromicRepository;
	
	
	@Override
	public PalinDromicModel saveString(String name) {
		PalinDromicModel dto = new PalinDromicModel();
		dto.setName(name);
		// TODO Auto-generated method stub
		return palinDromicRepository.save(dto);
	}

	@Override
	public  PalinDromicModel fetchData(Integer id) {
		// TODO Auto-generated method stub
		return palinDromicRepository.findById(id).get();
		 
	}

 
	@Override
	public String findTheLongestPalindrome(String str){
        if (str == null) {
            return null;
        }
        String longestPalindrome = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length() - 1; i++) {
            String returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
            returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i + 1);
            if (returnedPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = returnedPalindrome;
            }
        }
        return longestPalindrome;
    }
	
	private String findLongestPalindromeWithSpecifiedParameter(String str, int left, int right) {
        if (left > right)
            return null;

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

}

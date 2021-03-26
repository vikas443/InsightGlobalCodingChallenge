package com.test.palindromic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.palindromic.model.PalinDromicModel;

@Repository
public interface PalinDromicRepository extends CrudRepository<PalinDromicModel, Integer> {}
 

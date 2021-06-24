package com.bronson.dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bronson.dojo.models.Question;

@Repository
public interface QueRepository extends CrudRepository<Question, Long> {
	List<Question> findAll();
}

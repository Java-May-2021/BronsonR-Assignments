package com.bronson.dojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bronson.dojo.models.Answer;

@Repository
public interface AnsRepository extends CrudRepository<Answer, Long> {
	List<Answer> findAll();

}

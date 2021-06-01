package com.bronson.languages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bronson.languages.model.Language;

public interface LangRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
}

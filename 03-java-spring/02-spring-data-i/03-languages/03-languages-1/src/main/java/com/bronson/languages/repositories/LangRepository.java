package com.bronson.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bronson.languages.models.Language;

public interface LangRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
}

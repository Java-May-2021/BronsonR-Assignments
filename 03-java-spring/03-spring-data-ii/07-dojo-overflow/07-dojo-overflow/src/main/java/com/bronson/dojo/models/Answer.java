package com.bronson.dojo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String response;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="question_id")
	private Question query;
	
	 @PrePersist
	 public void onCreate() {
		 this.createdAt = new Date();
	 }
	    
	 @PreUpdate
	 public void onUpdate() {
	   	this.updatedAt = new Date();
	 }

	public Answer() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return response;
	}

	public void setAnswer(String response) {
		this.response = response;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Question getQuery() {
		return query;
	}

	public void setQuery(Question query) {
		this.query = query;
	}
	
	
	 
	 

}

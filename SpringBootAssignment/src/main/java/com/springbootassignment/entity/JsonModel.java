package com.springbootassignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

@Entity
public class JsonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "json_model_seq")
    @SequenceGenerator(name = "json_model_seq", sequenceName = "json_model_seq", allocationSize = 1)

    private Long id;

    @Column(nullable = false)
    private String jsonmodel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJsonmodel() {
		return jsonmodel;
	}

	public void setJsonmodel(String jsonmodel) {
		this.jsonmodel = jsonmodel;
	}

    // Getters and Setters
    
}

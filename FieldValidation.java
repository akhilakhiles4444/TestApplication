package com.akhilesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FieldValidation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String validationRule;
    

    @ManyToOne
    @JoinColumn(name = "custom_field_id")
    private CustomField customField;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getValidationRule() {
		return validationRule;
	}


	public void setValidationRule(String validationRule) {
		this.validationRule = validationRule;
	}


	public CustomField getCustomField() {
		return customField;
	}


	public void setCustomField(CustomField customField) {
		this.customField = customField;
	}

    
}


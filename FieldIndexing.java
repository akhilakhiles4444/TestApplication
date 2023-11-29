package com.akhilesh.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FieldIndexing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String indexingType;
    

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIndexingType() {
		return indexingType;
	}


	public void setIndexingType(String indexingType) {
		this.indexingType = indexingType;
	}


	public CustomField getCustomField() {
		return customField;
	}


	public void setCustomField(CustomField customField) {
		this.customField = customField;
	}


	@OneToOne
    @JoinColumn(name = "field_indexing_id")
    private CustomField customField;

    
}

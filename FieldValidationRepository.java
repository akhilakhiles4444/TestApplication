package com.akhilesh.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.entity.CustomField;
import com.akhilesh.entity.FieldIndexing;

public interface FieldValidationRepository extends JpaRepository<FieldIndexing, Long> {
	List<CustomField> findByCustomFieldId(Long customFieldId);
}

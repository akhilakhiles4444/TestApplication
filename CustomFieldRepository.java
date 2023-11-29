package com.akhilesh.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomFieldRepository extends JpaRepository<CustomField, Long> {
    List<CustomField> findByModuleId(Long moduleId);
}

package com.akhilesh.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.entity.FieldIndexing;

public interface FieldIndexingRepository extends JpaRepository<FieldIndexing, Long> {
    FieldIndexing findByCustomFieldId(Long customFieldId);
}

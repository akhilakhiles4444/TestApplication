package com.akhilesh.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomFieldService {
    private final CustomFieldRepository customFieldRepository;

    @Autowired
    public CustomFieldService(CustomFieldRepository customFieldRepository) {
        this.customFieldRepository = customFieldRepository;
    }

    public List<CustomField> getCustomFieldsByModuleId(Long moduleId) {
        return customFieldRepository.findByModuleId(moduleId);
    }
}


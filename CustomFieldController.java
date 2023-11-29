package com.akhilesh.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customfields")
public class CustomFieldController {
    private final CustomFieldService customFieldService;

    @Autowired
    public CustomFieldController(CustomFieldService customFieldService) {
        this.customFieldService = customFieldService;
    }

    @GetMapping("/{moduleId}")
    public List<CustomField> getCustomFieldsByModuleId(@PathVariable Long moduleId) {
        return customFieldService.getCustomFieldsByModuleId(moduleId);
    }
}


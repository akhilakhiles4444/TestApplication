

import { Component, OnInit } from '@angular/core';
import { CustomFieldService } from './custom-field.service';

@Component({
  selector: 'app-custom-field',
  templateUrl: './custom-field.component.html',
  styleUrls: ['./custom-field.component.css'],
})
export class CustomFieldComponent implements OnInit {
  customFields: any[] = [];

  constructor(private customFieldService: CustomFieldService) {}

  ngOnInit(): void {
    this.loadCustomFields();
  }

  loadCustomFields() {
    const moduleId = 112; // replace with your actual moduleId
    this.customFieldService.getCustomFieldsByModuleId(moduleId).subscribe(
      (data) => {
        this.customFields = data;
      },
      (error) => {
        console.error('Error fetching custom fields', error);
      }
    );
  }
}

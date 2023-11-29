

import { Injectable } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root',
})
export class DynamicFormService {
  constructor(private fb: FormBuilder) {}

  createFormGroup(customFields: any[]): FormGroup {
    const formGroup = this.fb.group({});
    customFields.forEach((field) => {
      formGroup.addControl(field.fieldName, this.fb.control(''));
    });
    return formGroup;
  }
}


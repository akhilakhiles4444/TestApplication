

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CustomFieldService {
  private baseUrl = 'http://localhost:8080/api/custom-fields';

  constructor(private http: HttpClient) {}

  getCustomFieldsByModuleId(moduleId: number): Observable<any[]> {
    const url = `${this.baseUrl}/module/${moduleId}`;
    return this.http.get<any[]>(url);
  }
}

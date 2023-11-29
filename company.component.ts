

import { Component, OnInit, ViewChild } from '@angular/core';
import { CompanyService } from './company.service';
import { MatPaginator, MatTableDataSource } from '@angular/material';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css'],
})
export class CompanyComponent implements OnInit {
  displayedColumns: string[] = ['name', 'industry', 'location']; // Add more columns as needed
  dataSource = new MatTableDataSource<any>();

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;

  constructor(private companyService: CompanyService) {}

  ngOnInit(): void {
    this.dataSource.paginator = this.paginator;
    this.loadCompanies();
  }

  loadCompanies() {
    const page = 0; 
    const size = 10; 
    this.companyService.getCompanies(page, size).subscribe(
      (data) => {
        this.dataSource.data = data.content;
      },
      (error) => {
        console.error('Error fetching companies', error);
      }
    );
  }
}

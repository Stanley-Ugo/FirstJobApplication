package com.embarkx.firstjobapp.company;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Long id, Company updatedCompany);
    void createCompany(Company company);
}

package com.arunvertex.MyJobPortal.company.Impl;

import com.arunvertex.MyJobPortal.company.Company;
import com.arunvertex.MyJobPortal.company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServieImpl implements CompanyService {
    @Override
    public void addCompany(Company company) {

    }

    @Override
    public List<Company> getAllCompanies() {
        return List.of();
    }

    @Override
    public Company findCompanyById(Long id) {
        return null;
    }

    @Override
    public boolean updateCompany(Long id, Company updatedCompany) {
        return false;
    }

    @Override
    public boolean deleteCompany(Long id) {
        return false;
    }
}

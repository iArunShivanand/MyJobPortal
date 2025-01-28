package com.arunvertex.MyJobPortal.company.Impl;

import com.arunvertex.MyJobPortal.company.Company;
import com.arunvertex.MyJobPortal.company.CompanyRepository;
import com.arunvertex.MyJobPortal.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServieImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void addCompany(Company company) {

        companyRepository.save(company);

    }

    @Override
    public List<Company> getAllCompanies() {

        return companyRepository.findAll();
    }

    @Override
    public Company findCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public boolean updateCompany(Long id, Company updatedCompany) {
        Optional<Company> companyOptional = companyRepository.findById(id);

        if(companyOptional.isPresent()){
            Company company = companyOptional.get();

            company.setDescription(updatedCompany.getDescription());
            company.setName(updatedCompany.getName());
            companyRepository.save(company);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCompany(Long id) {
        if(companyRepository.existsById(id)){
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

package com.arunvertex.MyJobPortal.company;

import java.util.List;

public interface CompanyService {

    void addCompany(Company company);

    List<Company> getAllCompanies();

    Company findCompanyById(Long id);

    boolean updateCompany(Long id , Company updatedCompany);

    boolean deleteCompany(Long id);

}

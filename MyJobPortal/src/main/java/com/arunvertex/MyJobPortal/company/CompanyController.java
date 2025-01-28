package com.arunvertex.MyJobPortal.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/addCompany")
    public ResponseEntity<String> addCompany(@RequestBody Company company){

        companyService.addCompany(company);
        return new ResponseEntity<>("Company is added successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/getCompanies")
    public ResponseEntity<List<Company>> getAllCompanies(){

        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @GetMapping("/getCompanies/{id}")
    public ResponseEntity<Company> findCompanyById(@PathVariable Long id){

        Company company = companyService.findCompanyById(id);
        if(company!=null)
            return new ResponseEntity<>(company,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}

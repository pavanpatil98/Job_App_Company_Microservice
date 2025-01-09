package com.pavan.companymicroservice.controller;




import com.pavan.companymicroservice.entity.Company;
import com.pavan.companymicroservice.impl.CompanyServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private CompanyServiceImpl companyService;


    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public ResponseEntity<List<Company>> getCompanys() {
        List<Company> companys = companyService.findAllCompanies();
        return new ResponseEntity<>(companys, HttpStatus.OK);
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Company> getCompanys(@PathVariable("id") Long id) {
        Company company = companyService.findCompanyById(id);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @PostMapping("/company")
    public ResponseEntity<Company> addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
        return new ResponseEntity<>(company, HttpStatus.CREATED);
    }

    @DeleteMapping("/company/{id}")
    public ResponseEntity<Long> removeCompany(@PathVariable("id") Long id) {
        companyService.removeCompany(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PutMapping("/company/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable("id") Long id, @RequestBody Company company) {
        companyService.updateCompany(id, company);
        return new ResponseEntity<>("updated company", HttpStatus.OK);
    }


}


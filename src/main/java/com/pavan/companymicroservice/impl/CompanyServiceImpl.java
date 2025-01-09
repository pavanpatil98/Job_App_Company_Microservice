package com.pavan.companymicroservice.impl;


import com.pavan.companymicroservice.clients.ReviewClient;
import com.pavan.companymicroservice.dto.ReviewMessage;
import com.pavan.companymicroservice.entity.Company;
import com.pavan.companymicroservice.repository.CompanyRepository;
import com.pavan.companymicroservice.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;
    ReviewClient reviewClient;

    public CompanyServiceImpl(CompanyRepository companyRepository,ReviewClient reviewClient){
        this.companyRepository = companyRepository;
        this.reviewClient = reviewClient;
    }
    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company findCompanyById(Long id) {
        return companyRepository.findById(id).get();
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Integer removeCompany(Long id) {
       return companyRepository.deleteById(id).get();
    }

    @Override
    public void updateCompany(Long id, Company company) {
        companyRepository.updateCompany(id,company);
    }

    @Override
    public void updateCompanyRating(ReviewMessage reviewMessage) {
        System.out.println("***************************Trying to update*******************************");
        Double companyAverageRating = reviewClient.getAverageRating(reviewMessage.getCompanyId());
        Long companyId = reviewMessage.getCompanyId();
        companyRepository.updateCompanyAverageRating(companyId,companyAverageRating);

    }
}

package com.pavan.companymicroservice.service;




import com.pavan.companymicroservice.dto.ReviewMessage;
import com.pavan.companymicroservice.entity.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> findAllCompanies();
    public Company findCompanyById(Long id);
    public void addCompany(Company Company);
    public Integer removeCompany(Long id);
    public void updateCompany(Long id,Company Company);
    public void updateCompanyRating(ReviewMessage reviewMessage);
}

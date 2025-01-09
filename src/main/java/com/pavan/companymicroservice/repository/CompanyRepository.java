package com.pavan.companymicroservice.repository;


import com.pavan.companymicroservice.entity.Company;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company,Integer> {
    public List<Company> findAll();
    public Optional<Company> findById(Long id);

    @Transactional
    @Modifying
    public Optional<Integer> deleteById(Long id);

    @Transactional
    @Modifying
    @Query("UPDATE Company c SET c.name = :#{#company.name}, c.description = :#{#company.description} WHERE c.id = :id")
    public int updateCompany(@Param("id")Long id, @Param("company")Company company);

    @Transactional
    @Modifying
    @Query("UPDATE Company c SET c.averageCompanyRating = :averageCompanyRating WHERE c.id = :id")
    public int updateCompanyAverageRating(@Param("id")Long id,@Param("averageCompanyRating") Double companyAverageRating);


}

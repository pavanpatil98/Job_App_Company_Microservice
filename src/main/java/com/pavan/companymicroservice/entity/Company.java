package com.pavan.companymicroservice.entity;

import jakarta.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue
    @SequenceGenerator(
            name="job_seq",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;

    private String name;
    private String description;

    public Double getAverageCompanyRating() {
        return averageCompanyRating;
    }

    public void setAverageCompanyRating(Double averageCompanyRating) {
        this.averageCompanyRating = averageCompanyRating;
    }

    private Double averageCompanyRating;

    /*@OneToMany(mappedBy = "company",cascade=CascadeType.ALL)
    @JsonManagedReference
    List<Job> jobs;

    @OneToMany(mappedBy = "company",cascade=CascadeType.ALL)
    @JsonManagedReference
    List<Review> reviews;*/

    public Company() {
    }

    public Company(Long id, /*List<Job> jobs,*/ String name, String description,Double companyRating) {
        this.id = id;
        /*this.jobs = jobs;*/
        this.name = name;
        this.description = description;
        this.averageCompanyRating = companyRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

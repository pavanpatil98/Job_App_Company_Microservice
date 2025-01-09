package com.pavan.companymicroservice.external;

public class Review {
    private Long id;
    private String title;
    private String description;
    private Integer rating;

    public Review() {
    }

    public Review(String title, Long id, String description, Integer rating) {
        this.title = title;
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

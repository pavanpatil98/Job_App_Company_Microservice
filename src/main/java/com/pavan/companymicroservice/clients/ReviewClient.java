package com.pavan.companymicroservice.clients;

import com.pavan.companymicroservice.external.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="reviewmicroservice",url="${review-service.url}")
public interface ReviewClient {
    /*
    @GetMapping("review")
    public ResponseEntity<List<Review>> getReview(@RequestParam("id")Long id);
    */

    //Yes, you can use List<Review> as the return type instead of ResponseEntity<List<Review>> in your Feign client interface. Feign will automatically handle the response status codes and serialization for you.
    @GetMapping("/review/averageRating")
    public Double getAverageRating(@RequestParam("companyId")Long id);
}

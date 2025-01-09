package com.pavan.companymicroservice.messaging;

import com.pavan.companymicroservice.dto.ReviewMessage;
import com.pavan.companymicroservice.service.CompanyService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqConsumer {
    private CompanyService companyService;
    public RabbitMqConsumer(CompanyService companyService){
        this.companyService = companyService;
    }

    @RabbitListener(queues = "companyRatingQueue")
    public void updateCompany(ReviewMessage reviewMessage){
        companyService.updateCompanyRating(reviewMessage);
    }
}

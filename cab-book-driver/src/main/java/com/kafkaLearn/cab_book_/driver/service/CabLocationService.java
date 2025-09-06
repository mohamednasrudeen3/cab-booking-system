package com.kafkaLearn.cab_book_.driver.service;

import com.kafkaLearn.cab_book_.driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

//     Kafka Template
//    create a template for storing my data to apache kafka

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;


    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }


}

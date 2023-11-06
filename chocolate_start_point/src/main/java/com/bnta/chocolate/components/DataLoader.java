package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateService chocolateService;

    @Autowired
    EstateService estateService;

    @Autowired
    EstateRepository estateRepository;

    @Autowired
    ChocolateRepository chocolateRepository;

    public void run(ApplicationArguments args){
        Estate estate1 = new Estate("Bounty Factory", "Sri Lanka");
        Estate estate2 = new Estate("Snickers Factory", "Ghana");

        estateService.saveEstate(estate1);
        estateService.saveEstate(estate2);

        Chocolate chocolate = new Chocolate("Bounty", 20, estate1);
        chocolateRepository.save(chocolate);



    }


}

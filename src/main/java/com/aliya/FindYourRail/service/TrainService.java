package com.aliya.FindYourRail.service;


import com.aliya.FindYourRail.entity.Train;
import com.aliya.FindYourRail.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private final TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository)
    {
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains(){
        return trainRepository.find();
    }

    public Train addTrain(Train train){
        return trainRepository.Save(train);
    }
}

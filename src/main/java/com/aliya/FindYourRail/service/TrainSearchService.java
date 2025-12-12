package com.aliya.FindYourRail.service;


import com.aliya.FindYourRail.entity.TrainSchedule;
import com.aliya.FindYourRail.repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    private TrainScheduleRepository trainScheduleRepository;

    public TrainSearchService(TrainScheduleRepository trainScheduleRepository){
        this.trainScheduleRepository = trainScheduleRepository;
    }

    public List<TrainSchedule> findTrainByStationCode(String sourceCode , String destinationCode){
       return trainScheduleRepository.findBySource_StationCodeAndDestination_StationCode(sourceCode,destinationCode);
    }

    public List<TrainSchedule> findTrainByStationName(String sourceName,String destinationName ){
        return trainScheduleRepository.findBySource_StationNameAndDestiation_StationName(sourceName,destinationName);
    }
}

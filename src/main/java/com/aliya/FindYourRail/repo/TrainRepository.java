package com.aliya.FindYourRail.repo;

import com.aliya.FindYourRail.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.InterfaceAddress;
import java.util.List;


@Repository
public interface TrainRepository extends JpaRepository<TrainRepository,Long> {
    List<Train> find();

    Train Save(Train train);
}

package com.aliya.FindYourRail.entity;


import jakarta.persistence.*;

@Entity
public class TrainSchedule {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  id;

    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    @ManyToOne
    @JoinColumn(name="source_station_id")
    private Station source;


    @ManyToOne
    @JoinColumn(name="destination_station_id")
    private Station destination;

}

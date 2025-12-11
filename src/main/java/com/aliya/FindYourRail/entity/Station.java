package com.aliya.FindYourRail.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String stationName;

    private String stationCode;
}

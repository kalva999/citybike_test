package model;

import lombok.Data;

@Data
public class Location {
    private String city;
    private String country;
    private double latitude;
    private double longitude;

}

package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int OLDEST_CAR_YEAR = 1886;
        if (year < OLDEST_CAR_YEAR) {
            throw new IllegalArgumentException("INVALID_YEAR");
        }

        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int calculateAge() {
        int ACTUAL_YEAR = LocalDate.now().getYear();
        return ACTUAL_YEAR - this.year;
    }

    public void showCarInfo() {
        System.out.println("Your car's model is: " + this.model);
        System.out.println("Your car's brand is: " + this.brand);
        System.out.println("Your car's year is: " + this.year);
        System.out.println("Your car's age is: " + this.calculateAge());
    }
}

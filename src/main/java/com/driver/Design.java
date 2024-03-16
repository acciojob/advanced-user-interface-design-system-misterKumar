package com.driver;

import java.util.Scanner;

public class Design {
    private String name;
    private String category;
    private String designerUsername;
    private double rating;

    public Design(String name, String category, String designerUsername) {
        this.name = name;
        this.category = category;
        this.designerUsername = designerUsername;
        this.rating = 0.0; // Default rating
    }

    public static Design createDesignFromUserInput(String name, String category, String designerUsername, double rating) {
        Design design = new Design(name, category, designerUsername);
        design.setRating(rating);
        return design;
    }

    public void setRating(double rating) {
    	//your code goes here
    }

    public double getRating() {
    	//your code goes here
        return rating;
    }

    public String getKey() {
    	//your code goes here
        return name + "_" + category + "_" + designerUsername;
    }

    public void displayDesignDetails() {
    	//your code goes here
    }

    public double performMathOperation() {
    	//your code goes here
        return 2 * rating;
    }

    public static void main(String[] args) {
    	//your code goes here
    }
}

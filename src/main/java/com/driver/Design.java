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
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Rating should be between 0 and 5.");
        }
        this.rating = rating;
    }

    public double getRating() {
    	//your code goes here
        return rating;
    }

    public String getKey() {
    	//your code goes here
        if (name == null || category == null || designerUsername == null) {
            throw new IllegalStateException("Incomplete design information.");
        }
        return name + "_" + category + "_" + designerUsername;
    }

    public void displayDesignDetails() {
    	//your code goes here
        System.out.println("Design Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Designer's Username: " + designerUsername);
        System.out.println("Rating: " + rating);
        System.out.println("Primary Key: " + getKey());
        System.out.println("Updated rating after adding 0.5: " + performMathOperation());
    }

    public double performMathOperation() {
    	//your code goes here
//        return 2 * rating;
        return rating+0.5;
    }

    public static void main(String[] args) {
    	//your code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter design name: ");
        String name = scanner.nextLine();

        System.out.print("Enter design category: ");
        String category = scanner.nextLine();

        System.out.print("Enter designer's username: ");
        String designerUsername = scanner.nextLine();

        System.out.print("Enter design rating: ");
        double rating = scanner.nextDouble();

        Design design = Design.createDesignFromUserInput(name, category, designerUsername, rating);

        design.displayDesignDetails();
    }
}

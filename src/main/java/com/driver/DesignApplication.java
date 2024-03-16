package com.driver;

public class DesignApplication {
    public static void main(String[] args) {
        // Create a design using user input
        Design design = Design.createDesignFromUserInput(null, null, null, 0);

        // Display design details
        design.displayDesignDetails();
    }
}


package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        //Creating a new instance of CellPhone
        CellPhone cellPhone1 = new CellPhone();

        //Prompting the default information
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your Cell Phone Service!");
        System.out.println("Enter Cell Phone Information for phone 1.");
        System.out.print("What is the serial number?: ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        cellPhone1.setModel(scanner.nextLine());
        System.out.print("Who is the carrier?: ");
        cellPhone1.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?: ");
        cellPhone1.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?: ");
        cellPhone1.setOwner(scanner.nextLine());

        //Displaying the entered information for the first phone
        display(cellPhone1);

        //Creating the second instance of Cellphone
        CellPhone cellPhone2 = new CellPhone();

        System.out.println("\nEnter Cell Phone Information for phone 2.");
        System.out.print("What is the serial number?: ");
        cellPhone2.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        cellPhone2.setModel(scanner.nextLine());
        System.out.print("Who is the carrier?: ");
        cellPhone2.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?: ");
        cellPhone2.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?: ");
        cellPhone2.setOwner(scanner.nextLine());

        //Displaying the entered information for the second phone
        display(cellPhone2);

        //Displaying from first phone to the second phone
        System.out.println("\nDialing from Phone 1 to Phone 2: ");
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        //Displaying from second phone to the first phone
        System.out.println("\nDialing from Phone 2 to Phone 1: ");
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        System.out.println("\nThank you for using the Cell Phone Service!");

        scanner.close();
    }

    //Display method to show all cell phone information
    public static void display(CellPhone cellPhone){
        System.out.println("\nEntered Cell Phone Information.");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

    }
}

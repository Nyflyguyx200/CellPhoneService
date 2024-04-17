package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        //Creating a new instance of CellPhone
        CellPhone cellPhone = new CellPhone();

        //Prompting the default information
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to your Cell Phone Service!")
        
        System.out.println("Enter Cell Phone Information.");

        System.out.print("What is the serial number?: ");
        cellphone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone?: ");
        cellphone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier?: ");
        cellphone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number?: ");
        cellphone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellphone.setOwner(scanner.nextLine());

        //Displaying the entered Information
        System.out.println("\nEntered Cell Phone Information.");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getphoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        System.out.println("Thank you for your time.");

        scanner.close();
    }
}

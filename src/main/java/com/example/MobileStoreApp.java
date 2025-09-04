package com.example;

import com.example.Exception.MobileNotFoundException;
import com.example.Exception.OutOfStockException;

import static java.lang.System.exit;

public class MobileStoreApp {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        MobileStore store = new MobileStore(); // max 10 mobiles
        int choice;
        while(true){
            System.out.println("\n===== Startup Mobile Store =====");
            System.out.println("1. Add Mobile");
            System.out.println("2. View Mobiles");
            System.out.println("3. Search Mobile by ID");
            System.out.println("4. Buy Mobile");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice==5){
                exit(0);
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter Mobile ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();
                    store.addMobile(new Mobile(id, brand, model,stock,price));
                    break;
                case 2:
                    store.viewAllMobiles();
                    break;
                case 3:
                    System.out.print("Enter Mobile ID to search: ");
                    int searchId = sc.nextInt();
                    try {
                        store.searchMobile(searchId);
                    } catch (MobileNotFoundException e) {
                        System.out.println("nn Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Mobile ID to buy: ");
                    int buyId = sc.nextInt();
                    try {
                        store.buyMobile(buyId);
                    } catch (MobileNotFoundException | OutOfStockException e) {
                        System.out.println("nn Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("n Exiting Mobile Store...");
                    break;
                default:
                    System.out.println("nn Invalid choice! Try again.");
            }
        }
    }
}

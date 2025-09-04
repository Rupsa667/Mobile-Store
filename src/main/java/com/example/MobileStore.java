package com.example;

import com.example.Exception.MobileNotFoundException;
import com.example.Exception.OutOfStockException;

public class MobileStore {
    Mobile[] mobiles=new Mobile[10];
    int count=0;



    //1. ADD MOBILE
    void addMobile(Mobile m) {
        if (count < mobiles.length) {
            mobiles[count++] = m;
            System.out.println("Mobile Added");
        } else {
            System.out.println("Mobile Not Added");
        }
    }

    //2.DISPLAY THE MOBILES
    void viewAllMobiles() {
        if (count == 0) {
            System.out.println("No Mobiles Available");
            return;
        }
        System.out.println("Mobile List");
        for (int i = 0; i < count; i++) {
            System.out.println(mobiles[i].toString());
        }
    }

    void searchMobile(int id) throws MobileNotFoundException {
        for (int i = 0; i < count; i++) {
            if (id == mobiles[i].id) {
                System.out.println("Mobile Found" + " and brand is " + mobiles[i].brand+" and model is "+mobiles[i].model+" and price is "+mobiles[i].price);
                return;
            }
        }
        throw new MobileNotFoundException("Mobile Not Found");

    }

    void buyMobile(int id)throws MobileNotFoundException , OutOfStockException {
        for (int i = 0; i < count; i++) {
            if (id == mobiles[i].id) {
                 if(mobiles[i].stock>0){
                     mobiles[i].stock--;
                     System.out.println("Purchase Successful"+" and brand is " + mobiles[i].brand+" and model is "+mobiles[i].model);
                     return;
                 }
                 else{
                       throw new OutOfStockException("out of stock");
                 }
            }
        }
        throw new MobileNotFoundException("Mobile Not Found");
    }
}

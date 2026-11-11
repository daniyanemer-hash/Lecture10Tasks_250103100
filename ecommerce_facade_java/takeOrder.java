package com.ecommerce;

public class takeOrder{
    public boolean order(int productId, int amount){
        if(amount < 0){
            System.out.println("the amount is legit");
            return 1;
        }
        else{
            return 0;
        }
    }
}

package com.ssgmce;

public class EngineerAdmission implements Runnable {

   static int seats = 60;

    public static void main(String[] args) {

        EngineerAdmission obj = new EngineerAdmission();
        Thread thread1 = new Thread(obj, "Omkar");

        Thread thread2 = new Thread(obj,"Sahil");

        System.out.println("*".repeat(20));

        System.out.println("No of Seats : " + seats);

        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        if(seats>0){
            System.out.println("Seat Allocated to : " + Thread.currentThread().getName());
            seats = seats-1;

        }else {
            System.err.println("Sorrry Next Year");
        }

        System.out.println("Seats left : "+ seats);
    }

}

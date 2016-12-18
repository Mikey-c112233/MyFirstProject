package com.mikey192c;

import java.util.Random;

public class Ai extends Player{
    Random rnd = new Random();
    int x;
    int y;

    public void get(){
        this.x = rnd.nextInt(2)+1;
        this.y = rnd.nextInt(2)+1;
        System.out.println("Robots " + x + " " +y);
    }

    public void retry (){
       get();
    }

}

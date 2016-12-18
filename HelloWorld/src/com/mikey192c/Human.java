package com.mikey192c;
import java.io.*;
import java.lang.*;

public class Human extends Player {

    public int x;
    public int y;
    public void get(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Made your turn x_y");
             this.x = Integer.parseInt(br.readLine());
             this.y = Integer.parseInt(br.readLine());
            System.out.println("Players " +x + " " +y);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void retry() {
        System.out.println("You cant make a turn here. It was already turn here, try other cell");
        get();

    }
}
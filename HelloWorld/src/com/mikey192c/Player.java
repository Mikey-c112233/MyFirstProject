package com.mikey192c;

public abstract class Player { //player sets one time in turn its figure X/O in free cell of gamefield
   public int x;
   public int y;

   public abstract void retry();

   public abstract void get();
}

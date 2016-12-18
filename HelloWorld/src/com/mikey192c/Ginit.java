package com.mikey192c;
/**
 * Created by M on 18.12.2016.
 */


public class Ginit {
    static boolean aiwinner = false;
    static boolean humwinner = false;
    public static int[][] gamefield = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    }; //game field where 0 - "blank", 1 - "X" 2 - "O"
    //now AI always turns 2nd and takes 2 as O||| human 1st takes 1 as X
    public static void main(String[] args) {
        //boolean succes;
        boolean state = true;
        // System.out.println(newGame.gamefield[0][0]);
        Human player = new Human();//
        Ai robot = new Ai();//creating players
        robot.get();
        player.get();

        for (; state == true; ) { //starting game
            turn(player);
            turn(robot);
            System.out.println("Robot wins");
/*
            state = checkwinner();
            if (state && aiwinner)
                System.out.println("Robot wins");
            else if (state && humwinner) {
                System.out.println("Robot wins");
            } else if (!state) {
                System.out.println("No one wins");
            }*/

        }

    }
     static boolean checkwinner(){
                boolean aiwinner = false;
         boolean humwinner = false;
                boolean empty = false;
         if ((gamefield[0][0]+gamefield[0][1]+gamefield[0][2])==3){
             aiwinner = true;}
              else if ((gamefield[0][0]+gamefield[0][1]+gamefield[0][2])==6){
                humwinner=true;}
          if ((gamefield[1][0]+gamefield[1][1]+gamefield[1][2])==3){
                  aiwinner=true;}
                  else if ((gamefield[1][0]+gamefield[1][1]+gamefield[1][2])==6){
                    humwinner=true;}
           if ((gamefield[2][0]+gamefield[2][1]+gamefield[2][2])==3){
                    aiwinner=true;}
                   else if ((gamefield[2][0]+gamefield[2][1]+gamefield[2][2])==6){
                      humwinner=true;}

                 if ((gamefield[0][0]+gamefield[1][0]+gamefield[2][0])==3){
                        aiwinner = true;}
                     else if ((gamefield[0][0]+gamefield[1][0]+gamefield[2][0])==6){
                             humwinner=true;}
                          if ((gamefield[0][1]+gamefield[1][1]+gamefield[2][1])==3){
                        aiwinner=true;}
                     else if ((gamefield[0][1]+gamefield[1][1]+gamefield[2][1])==6){
                             humwinner=true;}
                          if ((gamefield[0][2]+gamefield[1][2]+gamefield[2][2])==3){
                        aiwinner=true;}
                     else if ((gamefield[0][2]+gamefield[1][2]+gamefield[2][2])==6){
                             humwinner=true;}
                       if (aiwinner==true) {
                           //return true;
                            }

                         if (humwinner==true){
                             //return true;
                             }

                             for(int i=0;i<2;i++){
                                for (int j=0;j<2;j++){
                                    if(gamefield[i][j]==0){
                                          empty = true;
                                    }
                                }
                             }


                    return (aiwinner||humwinner)||empty;

     }


    public static void turn (Player p)
    {
        if (checkTurn(p)==true){
            gamefield[p.x][p.y] = maketurn(p);
        }
          else {
            p.retry();
            turn(p);
        }
        //method where player or ai puts its X or O
       // gamefield[p.x][p.y] = maketrun(p);
    }


    public static int maketurn(Player p) {
       int sym = 0;
        if (p instanceof Ai) {
            sym =2;
        }
        if (p instanceof Human) {
        sym = 1;
        }
        return sym;
    }

    static boolean checkTurn(Player p){
        if (gamefield[p.x][p.y] == 0) {
           return true;
        }
        return false;
    }
}


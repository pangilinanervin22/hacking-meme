/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how2hack;

/**
 *
 * @author pangilinan#1
 */




import java.util.*;


public class How2Hack extends Thread {

  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
      System.out.println("Press any character to start");
    String start = input.nextLine();
    animation thread1 = new animation();
    dotAnimation dots = new dotAnimation();
    thread1.run();
    space();
    System.out.println("  Welcome to anonymous");
    space(2);
    System.out.println("Choose company to hack");
    space();
    System.out.println("Type it down");
    String hack = input.nextLine();
    space(2);
    System.out.print("Preparing to hack");
    dots.loading(6);
    space();
    int load =0;
     for(int i=0; i<=4; ++i){
       System.out.print("Hacking "+hack+" "+load+"%");
       dots.loading(3);
       System.out.println();
       load += 25;
     }
    System.out.println("\nHacking is successfully \nnow restart your \n computer to see the result");
  }
  public static void space(){
     System.out.println();
  }
  public static void space(int num){
     for(int i=0; i<=num; ++i){
       System.out.println();
    }
  }
  
  
  
}

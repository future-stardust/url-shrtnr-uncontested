package edu.kpi.testcourse.logic;

import java.util.Scanner;

public class Logic {

  public static int Start(){

      System.out.print("Welcome to our program, in order to continue working, write 'next`\nEnter: ");

      Scanner str = new Scanner(System.in);
      String str1 = str.next();

      if (str1.equals("next")){

        System.out.print("To use the features of the program, you need to register, so write 'registration'\nEnter: ");
        return TransToReg();
      }

      else {
        System.out.println("try again");

    }return Start();


  }

  public static int TransToReg(){
    Scanner str = new Scanner(System.in);
    String str2 = str.next();
    if (str2.equals("registration")){
      System.out.print("");
    }
    else{
      System.out.print("try again\nEnter: ");
    }
    return 0;
  }

}

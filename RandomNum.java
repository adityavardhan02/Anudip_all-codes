package apjfsa;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
           System.out.println("guess a number below 100");
           Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           
           Random random=new Random();
           
           int target=random.nextInt(100);
           
           while(num!=target) {
        	   
        	   if(num>target) {
        		   System.out.println("Your guess is greater,guess again"); 
        		   num=sc.nextInt();
        	   }
        	   else         	   if(num<target) {
        		   System.out.println("Your guess is lower,guess again"); 
        		   num=sc.nextInt();
        	   }

				
		}
		System.out.println("Your guess is correct congratulations!!!");
		

	}

}

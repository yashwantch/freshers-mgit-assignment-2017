/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author yashw
 */
public class Customer {
    
 public Customer()
         {
          System.out.println("customer walks in");
          //System.out.println("customer w");
           //Scanner sc=new Scanner(System.in);
         }
 
 public static String[] takeOrders()
 {
	 System.out.println("customer is odering");
     String[] Ordered = new String[20];
	 int i=0;
     String a = null;
	 do
	 {
		 Scanner sc=new Scanner(System.in);
		 Ordered[i]=sc.next();
		 
		 System.out.println("you want another other Y or N");
	
             a = sc.next();
	 }while(a.equals("Y")||a.equals("y"));
	 return Ordered;
 }

 public static void paybill(int total,String[] mordered)
 {
     System.out.println("customer paid bill of amount"+total);
     
     System.out.println("Ordered items are:");
     for(Object o:mordered)
     {
         
         System.out.println(o);
     }
     new Bellboy();
 }
    
    
}

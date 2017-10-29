/*cls
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yashw
 */
public class Manager
{


    //private static Object Maincourse;

   // private static Object starters;

    //static void generatebill() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
   static HashMap<String, Integer> starters;
   static HashMap<String, Integer> Maincourse;
   static HashMap<String, Integer> Deserts;

    //static void generatebill(String[] mordered) {
        //To change body of generated methods, choose Tools | Templates.
    //}
    
   public Manager()
    {
        System.out.println("manage displays menu");
        
       
         
         System.out.println("manager showing menu card");
         
           //HashMap<Integer,String> starters;  
        starters = new HashMap<String,Integer>();
         starters.put("periperichicken",300);  
         starters.put("fishfingers",320);  
         starters.put("bbqprawns",350);
     
         
          //HashMap<Integer,String> Maincourse;  
            Maincourse = new HashMap<String,Integer>();
         Maincourse.put("grilledchicken",380);  
         Maincourse.put("grilledfish",400);  
         Maincourse.put("grilledlamb",400);
         
         // HashMap<Integer,String> Deserts;  
            Deserts = new HashMap<String,Integer>();
         Deserts.put("chocolatefudge",120);  
         Deserts.put("brownie",160);  
         Deserts.put("ferrerorocher",180);
         
         
         System.out.println("starters");
         for(Map.Entry m:starters.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  } 
          System.out.println("Maincourse");
         for(Map.Entry m:Maincourse.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  } 
          System.out.println("Deserts");
         for(Map.Entry m:Deserts.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  } 
        String[] mordered = Customer.takeOrders();
        
        
        //super(mordered);
        
        new cooking(mordered);
    }//constructor
    
    /**
     *
     */
 public static void  generatebill(String[] mordered)
    {
         int total=0;
         for(Map.Entry m:starters.entrySet()){ 
             for(Object o:mordered)
             {
                 if(o.equals(m.getValue()))
                 {
                     total=total+Integer.parseInt((String) m.getKey());
                 }
             }
         }
             for(Map.Entry e:Maincourse.entrySet()){ 
             for(Object o:mordered)
             {
                 if(o.equals(e.getValue()))
                 {
                     total=total+Integer.parseInt((String) e.getKey());
                 }
             }
            }
             for(Map.Entry d:Deserts.entrySet()){ 
             for(Object o:mordered)
             {
                 if(o.equals(d.getValue()))
                 {
                     total=total+Integer.parseInt((String) d.getKey());
                 }
             }
   //System.out.println(m.getKey()+" "+m.getValue());  
  } 
             
             Customer.paybill(total,mordered);
    }
    
    
         }

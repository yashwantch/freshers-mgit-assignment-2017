/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author yashw
 */
class cooking {
    
   

    //cooking(String[] mordered) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

      public cooking(String[] mordered) {
        for(Object o:mordered)
         {
             System.out.println(o);
         }
        System.out.println("Cooking done");
        
         new waiter(mordered);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      
    }
    
   
    


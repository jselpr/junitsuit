/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.munvi.junitsuite;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author joselopezruiz
 */
public class TestJunit1 {
    String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;
//import java.util.Timer;
//import java.util.TimerTask;
/**
 *
 * @author bparr
 */
public class Temporizador {
   public static void main(String arglist[]) {
       int minutos = 0;
       int segundos = 0;
       
       for (minutos = 0; minutos < 60; minutos++) {
           for (segundos = 0; segundos <60; segundos++) {
               
               delaySeg();
           }
       }
    
    }
   
   private static void delaySeg(){
   try{
       Thread.sleep(1000);
   }catch(InterruptedException e){
   }
   }
}


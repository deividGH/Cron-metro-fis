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
    static int limite = 0;
    static int descansos = 0;
    public Temporizador() {
    }
    
    Temporizador(int a, int b){
    limite = a;
    descansos = b;
    }
    
   public static void main(String arglist[]) {
       //Temporizador temp = new Temporizador();
       int minutos = 0;
       int segundos = 0;
       
       for (minutos = 0; minutos < limite; minutos++) {
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


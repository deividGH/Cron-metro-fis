/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;
//import java.util.Timer;
//import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.Timer;

/**
 *
 * @author bparr
 */
public class Temporizador {
   private Timer t;
   private int min,seg,hor;
    private String cadena;
   
   public Temporizador (){
    min =0;
    seg =0;
    hor =0;
    
    cadena=((hor<=9?"0":"")+hor+":"+(min<=9?"0":"")+min+":"+(seg<=9?"0":"")+seg);
}

    public int getMin() {
        return min;
    }
   
   
   public void correr(Temporizador c1) {
       
            ++c1.seg; 
          
            if(c1.seg==60) 
            {
                c1.seg = 0;
                ++c1.min;
            }
            if(c1.min==60)
            {
                c1.min = 0;
                ++c1.hor;
            }
   }
   public void reiniciar(Temporizador c1){
   c1.hor=0; c1.min=0; c1.seg=0;
   }
   public void actualizarLabel(Temporizador c1,JLabel etiqueta, JTextArea info, int serie) {
        c1.cadena = (c1.hor<=9?"0":"")+c1.hor+":"+(c1.min<=9?"0":"")+c1.min+":"+(c1.seg<=9?"0":"")+c1.seg;
        if(c1.seg == 0 && c1.min == 0 && c1.hor == 0){
        info.setText(" ");
        }
        
        if(c1.seg >= serie){
        info.setText("Fin del ejercicio, tome aliento");
        }
        if(c1.seg < serie){
        info.setText("Ejercicio en proceso");
        }
        etiqueta.setText(c1.cadena);
    }
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   new GUI();
   
   }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
/**
 *
 * @author bparr
 */


  public  class GUI extends JFrame  implements ActionListener{
       JLabel etiqueta;
       JLabel etiqueta1;
       JLabel etiqueta2;
       JTextField cantidad;
       JTextField serie;
       JButton boton;
       JButton boton1;
       JButton boton2;
       JTextArea info;
       Temporizador c1 = new Temporizador ();
       Timer t;
     private final ActionListener avanzar = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if(Integer.parseInt(cantidad.getText())== c1.getMin()){
                JOptionPane.showMessageDialog(null, "Oops! El tiempo termino");
            t.stop();
            }else{
            c1.correr(c1);
            c1.actualizarLabel(c1, etiqueta, info, Integer.parseInt(serie.getText()));
            }
            }
            
        
        
    };
       public GUI (){
           
           info = new JTextArea();
           etiqueta=new JLabel ("00:00:00");
           etiqueta1=new JLabel ("Total del ejercicio");
           etiqueta2=new JLabel ("Ejercicio por minuto");
           boton=new JButton("Iniciar");
           boton1=new JButton("Pausar");
           boton2=new JButton("Reiniciar");
           cantidad = new JTextField();
           serie = new JTextField();
           t = new Timer(1000, avanzar);
            this.setTitle("Temporizador");
           this.setLocationRelativeTo(null);
           this.setLayout(null);
           
           etiqueta.setBounds(85, 30, 80, 20);
           
           this.getContentPane().add(etiqueta);
           boton.setBounds(25, 60, 160, 25);
           this.getContentPane().add(boton);
           etiqueta1.setBounds(25, 90, 160, 25);
           this.getContentPane().add(etiqueta1);
           
           cantidad.setBounds(25, 120, 160, 25);
           this.getContentPane().add(cantidad);
           
           etiqueta2.setBounds(25, 150, 160, 25);
           this.getContentPane().add(etiqueta2);
           serie.setBounds(25, 180, 160, 25);
           this.getContentPane().add(serie);
           
           info.setBounds(25, 215, 160, 130);
           this.getContentPane().add(info);
           info.setEditable(false);
           
           boton2.setBounds(25, 360, 160, 25);
           this.getContentPane().add(boton2);
           boton2.setEnabled(false);
           this.pack();
           this.setSize(230, 440);
           this.setVisible(true);
           this.setLocationRelativeTo(null);
           boton.addActionListener(this);
           boton.setActionCommand("a");
           boton1.addActionListener(this);
           boton1.setActionCommand("b");
           boton2.addActionListener(this);
           boton2.setActionCommand("c");
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
       
      
      
        @Override
   public void actionPerformed(ActionEvent ae) {
        
         if (ae.getActionCommand().equals("a")){
             t.start();
             boton.setEnabled(false);
             boton1.setEnabled(true);
             boton2.setEnabled(true);
             cantidad.setEditable(false);
             serie.setEditable(false);
         }
//         if (ae.getActionCommand().equals("b")){
//            t.stop();
//             boton.setEnabled(true);
//             boton1.setEnabled(false);
//             boton2.setEnabled(true);
//             
//         }
          if (ae.getActionCommand().equals("c")){
              if(t.isRunning()) 
        {
            t.stop();
            boton.setEnabled(true);
        }
        
        boton2.setEnabled(false);
        boton1.setEnabled(false);
        c1.reiniciar(c1);
        serie.setEditable(true);
        cantidad.setEditable(true);
        c1.actualizarLabel(c1, etiqueta, info, Integer.parseInt(serie.getText()));
             
         }
    }

   

    }

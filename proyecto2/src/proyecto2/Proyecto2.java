/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author juras
 */
public class Proyecto2 extends JFrame{
    private JTextField texto = new JTextField();
    private JButton uno = new JButton("1");
    private JButton dos = new JButton("2");
    private JButton tres = new JButton("3");
    private JButton cuatro = new JButton("4");
    private JButton cinco = new JButton("5");
    private JButton seis = new JButton("6");
    private JButton siete = new JButton("7");
    private JButton ocho = new JButton("8");
    private JButton nueve = new JButton("9");
    private JButton cero = new JButton("0");
    private JButton mas = new JButton("+");
    private JButton menos = new JButton("-");
    private JButton x = new JButton("*");
    private JButton divi = new JButton("/");
    private JButton igual = new JButton("=");
    private JButton borrar = new JButton("Borrar");
    
    public Proyecto2(){
        setSize(390,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void AddComponentes(JPanel panel){
        //(x, y, ancho, alto)
        texto.setBounds(10, 20, 350, 50);
        uno.setBounds(10,90,80,30);
        dos.setBounds(100,90,80,30);
        tres.setBounds(190,90,80,30);
        mas.setBounds(280, 90, 80, 30);
        cuatro.setBounds(10, 120, 80, 30);
        cinco.setBounds(100, 120, 80, 30);
        seis.setBounds(190, 120, 80, 30);
        menos.setBounds(280, 120, 80, 30);
        siete.setBounds(10, 150, 80, 30);
        ocho.setBounds(100, 150, 80, 30);
        nueve.setBounds(190, 150, 80, 30);
        x.setBounds(280, 150, 80, 30);
        cero.setBounds(10, 180, 80, 30);
        igual.setBounds(100, 180, 170, 30);
        divi.setBounds(280, 180, 80, 30);
        borrar.setBounds(10, 220, 350, 30);

        panel.add(texto);
        panel.add(uno);
        panel.add(dos);
        panel.add(tres);
        panel.add(cuatro);
        panel.add(cinco);
        panel.add(seis);
        panel.add(siete);
        panel.add(ocho);
        panel.add(nueve);
        panel.add(cero);
        panel.add(mas);
        panel.add(menos);
        panel.add(x);
        panel.add(divi);
        panel.add(igual);
        panel.add(borrar);
        
        uno.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                poneruno(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerdos(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponertres(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponercuatro(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponercinco(evt);
            }
        });
        seis.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerseis(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponersiete(evt);
            }
        });
        ocho.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerocho(evt);
            }
        });
        nueve.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponernueve(evt);
            }
        });
        cero.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponercero(evt);
            }
        });
        mas.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponermas(evt);
            }
        });
        menos.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponermenos(evt);
            }
        });
        x.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerx(evt);
            }
        });
        divi.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerdivi(evt);
            }
        });
        igual.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerigual(evt);
            }
        });
        borrar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                ponerborrar(evt);
            }
        });
    }
    
    private void poneruno(ActionEvent evt){
        texto.setText(texto.getText() + "1");
    }
    private void ponerdos(ActionEvent evt){
        texto.setText(texto.getText() + "2");
    }
    private void ponertres(ActionEvent evt){
        texto.setText(texto.getText() + "3");
    }
    private void ponercuatro(ActionEvent evt){
        texto.setText(texto.getText() + "4");
    }
    private void ponercinco(ActionEvent evt){
        texto.setText(texto.getText() + "5");
    }
    private void ponerseis(ActionEvent evt){
        texto.setText(texto.getText() + "6");
    }
    private void ponersiete(ActionEvent evt){
        texto.setText(texto.getText() + "7");
    }
    private void ponerocho(ActionEvent evt){
        texto.setText(texto.getText() + "8");
    }
    private void ponernueve(ActionEvent evt){
        texto.setText(texto.getText() + "9");
    }
    private void ponercero(ActionEvent evt){
        texto.setText(texto.getText() + "0");
    }
    private void ponermas(ActionEvent evt){
        texto.setText(texto.getText() + "+");
    }
    private void ponermenos(ActionEvent evt){
        texto.setText(texto.getText() + "-");
    }
    private void ponerx(ActionEvent evt){
        texto.setText(texto.getText() + "*");
    }
    private void ponerdivi(ActionEvent evt){
        texto.setText(texto.getText() + "/");
    }
    private void ponerigual(ActionEvent evt){
        
    }
    private void ponerborrar(ActionEvent evt){
        texto.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto2 ventana = new Proyecto2();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        ventana.getContentPane().add(panel);
        ventana.AddComponentes(panel);
        ventana.setVisible(true);
    }
}   
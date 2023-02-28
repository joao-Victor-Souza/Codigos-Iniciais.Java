/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testesjava01;

/**
 *
 * @author Conta Principal
 */
public class TestesJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double valorA = 1+ Math.random() * (20-1);
        double valorAA = Math.round(valorA);
        
        double valorB= 1+ Math.random() * (20-1);
        double valorBB = Math.round(valorB);
        
        double valorC = 1+ Math.random()* (20-1);
        double valorCC = Math.round(valorC);
        
        double delta = Math.pow(valorBB, 2) - (4*valorAA * valorCC);
        
        double x1 = ((( valorBB * -1) + Math.sqrt(delta)) / (2 * valorAA));
        
       if (Double.isNaN(delta)){
           System.out.print("é um nan");
       }else{
           System.out.print("Não é um nan");
       }
    };
    
};

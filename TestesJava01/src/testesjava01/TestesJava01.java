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
         double A = 0+ Math.random() * (20-0);
         double valorA = Math.round(A);
        
        double p = 0+ Math.random() * (1-0);
        double valorP = Math.round(p);
        
       // System.out.println(valorP);
        if(valorP == 0){
            System.out.println(valorA * -1);
        }else{
            System.out.println(valorA);
        }
        
        //System.out.println(valorA *-1);
        
    };
    
};

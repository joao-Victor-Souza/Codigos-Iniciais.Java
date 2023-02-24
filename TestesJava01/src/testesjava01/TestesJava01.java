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
        //usando Math.round eu consigo converter um double para um integer.
        //isso porque eu não estou convertendo diretamente (o que é pribido)
        //mas sim arredondando e aplicando.
        
        
        //usar no código do projeto do gênio!!!!!!!
        /*double doublevalue = 3.3;
        int intvalue =(int) Math.round(doublevalue);
        //System.out.println(intvalue);
        
        if(intvalue == 3){
            System.out.println(intvalue);
        } else{ 
            System.out.println("nao");
        }
        */
        /*
        int A = 10;
        int B = 20;
        int C = 7;
        
        double delta = Math.pow(B, 2) - 4*A*C;
        
        System.out.println(delta);
        
        //System.out.println("km\u00B2");
        */
        double delta = -10;
        
        if(delta>0){
            System.out.println("Maior");
        }else if(delta == 0){
            System.out.println("igual");
        }else{
            System.out.println("menor");
        }
        
    };
    
};

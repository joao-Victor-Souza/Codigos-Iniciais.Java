/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print(" Digite a nota do aluno: ");
        float nota = entrada.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
    
} 

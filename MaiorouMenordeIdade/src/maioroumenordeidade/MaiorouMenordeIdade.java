/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maioroumenordeidade;

import java.util.Scanner;

/**
 *
 * @author Conta Principal
 */
public class MaiorouMenordeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Função Scanner para ter interação com o usuário.
        Scanner teclado = new Scanner(System.in);
        //Pedindo o ano de nascimento dele(a).
        System.out.print("Em que ano você nasceu? ");
        int nascimento = teclado.nextInt();
        //calculando a idade da pessoa.
        int idade = 2023 - nascimento;
        //Exibindo a idade da pessoa.
        System.out.println("Você tem: " +idade + " anos");
        //A depender da idade da pessoa irei exibir se é maior ou menor de idade
        if (idade>=18){
            System.out.println("Parabéns, você é maior de idade");
        } else{
            System.out.println("Você ainda é menor de idade");
        }
        
    }
    
}

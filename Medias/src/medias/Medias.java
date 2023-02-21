/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medias;

import java.util.Scanner;

/**
 *
 * @author Conta Principal
 */
public class Medias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Adicionei a função Scanner para poder receber informações do usuário.
        Scanner teclado = new Scanner(System.in);
        //Pedindo ao usuário o valor d aprimeira nota, usei Float pq pode vir um número com vírgula.
        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        //Novamente pedi ao usuário uma nota e usei Float pelo mesmo motivo.
        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        //Com os 2 valores fiz a média.
        //sempre lembrando da ordem dos fatores, e de novo Float porque eu quero um número com vírgula.
        float media = (nota1 + nota2)/2;
        //Por fim exibi a média ao usuário.
        System.out.println("Sua média foi: " + media);
        //Apendas adicionei um extra para caso ele atingisse uma meta.
        if(media>=9){
            System.out.println("Parabéns pela sua nota!");
            
        }
    }
    
}

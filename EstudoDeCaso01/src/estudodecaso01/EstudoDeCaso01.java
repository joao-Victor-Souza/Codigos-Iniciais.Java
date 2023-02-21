
package estudodecaso01;

import java.util.Scanner;


public class EstudoDeCaso01 {

  
    public static void main(String[] args) {
        //Importei a função Scanner para poder interagir com o usuário.
        Scanner teclado = new Scanner(System.in);
     //Recebendo e armazenando o nome do usuário.   
     System.out.print("Digite o seu nome: ");
     String nome = teclado.nextLine();
     //Recebendo e armazenando o Sobrenome do usuário.
     System.out.print("Digite seu sobrenome: ");
     String sobrenome = teclado.nextLine();
     //Recebendo e armazenando o local de trabalho do usuário.
     System.out.print("Digite onde trabalha: ");
     String localTrab = teclado.nextLine();
     //Recebendo e armazenando ano em que o usuário nasceu.
     System.out.print("Digite o seu ano de nascimento: ");
     float nasceu = teclado.nextFloat();
     //Recebendo e armazenando idade do usuário.
     System.out.print("Digite a sua idade: ");
     float idade = teclado.nextFloat();
     //Recebendo e armazenando Salário do usuário
     System.out.print("Digite quanto ganha: ");
     float ganho = teclado.nextFloat();
     
     //Imprimindo no terminal as informações fornecidas pelo usuário     
     System.out.println();
     
     System.out.format("\n O nome digitado foi: %S  ",nome);
    
     System.out.format("\n O sobrenome digitado foi: %S  ",sobrenome);
     
     System.out.format("\n Local de trabalho trabalho: %S  ", localTrab);
     
     System.out.format("\n O ano de nascimento digitado foi: %S ", nasceu);
    
     System.out.format("\n A idade digitada foi: %S  ",idade);
      
     System.out.format("\n O valor do pagamento informado foi: %S \n", ganho);
          
    
      
      
    }
    
}

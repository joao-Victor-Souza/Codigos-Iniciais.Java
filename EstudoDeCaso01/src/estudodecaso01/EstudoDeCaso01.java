
package estudodecaso01;

import java.util.Scanner;


public class EstudoDeCaso01 {

  
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
    
     System.out.print("Digite o seu nome: ");
     String nome = teclado.nextLine();
     
     System.out.print("Digite seu sobrenome: ");
     String sobrenome = teclado.nextLine();
    
      System.out.print("Digite onde trabalha: ");
     String localTrab = teclado.nextLine();
     
     System.out.print("Digite o seu ano de nascimento: ");
     Float nasceu = teclado.nextFloat();
     
     System.out.print("Digite a sua idade: ");
     Float idade = teclado.nextFloat();
     
     System.out.print("Digite quanto ganha: ");
     float ganho = teclado.nextFloat();
     
          
     System.out.println();
     
     System.out.format("\n O nome digitado foi: %S  ",nome);
    
     System.out.format("\n O sobrenome digitado foi: %S  ",sobrenome);
     
     System.out.format("\n Local de trabalho trabalho: %S  ", localTrab);
     
     System.out.format("\n O ano de nascimento digitado foi: %S ", nasceu);
    
     System.out.format("\n A idade digitada foi: %S  ",idade);
      
     System.out.format("\n O valor do pagamento informado foi: %S \n", ganho);
          
    
      
      
    }
    
}

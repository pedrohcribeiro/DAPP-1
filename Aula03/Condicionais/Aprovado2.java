/*
Aprovado e reprovado com todos os atributos dentro do 
 */
package Aula3.Condicionais;
import java.util.Scanner;

public class Aprovado2 {
  


    public static void main(String[] args) {
        
        String nome;
        double nota1, nota2, nota3;
    
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno(a): ");
        nome = ler.nextLine();
        
        System.out.println("Digite a nota 1 do aluno(a): ");
        nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno(a): ");
        nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota 3 do aluno(a): ");
        nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) /3;
        
        //condicionais
        
        if(media >= 6)  {
            System.out.println("O aluno(a) está Aprovado");
        }else{
            System.out.println("O aluno(a) está Reprovado");
}
}
}

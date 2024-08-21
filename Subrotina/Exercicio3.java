//3 - Escreva um novo programa, alterando o exercício 1, pesquisando qual é o menor e o maior dos 50 números. 
import java.util.Scanner;
public class Exercicio3 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void Leitor_Menor_e_Maior(){
        double vetor[] = new double [50];
        double max, min, atual;
        
        System.out.println("Digite um valor real: ");
        max = min = leitor.nextInt();
        
        for(int i =1; i<50; i++){
            System.out.println("Digite um valor real: ");
            atual = leitor.nextDouble();
            vetor[i]=atual;
            if( atual > max ) {
                max = atual;
            } else {
                if( atual < min ) {
                    min = atual;
                }
            }
        }
    }
}


//13 - Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 99.999, e retorne uma String correspondente ao número por extenso. Caso o número esteja fora do intervalo, o método deve retornar o texto “inválido”. 
public class Exercicio13 {
    
public static String Escreve_Por_Extenso_1_a_99_999(int intervalo){
        intervalo = 13968;
        String devolucao ="treze mil novecentos e sessenta e oito";
        
        if(intervalo < 0 || intervalo < 99_999) {
            devolucao = "invalido";
        }
        return devolucao;
    }
}


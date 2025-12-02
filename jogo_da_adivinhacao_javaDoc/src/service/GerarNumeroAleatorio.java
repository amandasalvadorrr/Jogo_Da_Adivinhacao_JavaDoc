package service;

import java.util.Random;

/**
 * Gera um valor aleatório no intervalo de 0 à 100 para o usuário adivinhar.
 * @author Amanda Salvador
 * @version 1.0
 * 02-12-2025
**/

public class GerarNumeroAleatorio {
    Random random = new Random();

    public int valorGerado = random.nextInt(100);
    int tentativas;

    /**
     * Verifica se o número inserido pelo usuário corresponde ao valor aleatório gerado.
     * @param opcaoEscolhida variável do tipo inteiro para receber o valor do usuário.
     * **/
    public void verificarTentativas(int opcaoEscolhida) {
        tentativas++;

        if (opcaoEscolhida == valorGerado){
            System.out.println("O NÚMERO ESTÁ CORRETO, PARABÉNS!");
            System.out.println("Quantidade de tentativas até acertar: " + tentativas);
        } else if (opcaoEscolhida > valorGerado) {
            System.out.println("CHUTE UM NÚMERO MENOR.");
            System.out.println("NÚMERO DE TENTATIVAS: " + tentativas);
        } else if (opcaoEscolhida < valorGerado){
            System.out.println("CHUTE UM NÚMERO MAIOR.");
            System.out.println("NÚMERO DE TENTATIVAS: " + tentativas);
        } else {
            System.out.println("O NÚMERO NÃO PODE SER NEGATIVO. \nTENTE NOVAMENTE");
        }
    }
}

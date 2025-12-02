package view;

import service.GerarNumeroAleatorio;
import java.util.Scanner;

/**
 * Responsável por interagir com o usuário.
 * @author Amanda Salvador
 * @version 1.0
 * 02-12-2025
**/
public class Interacao {
    Scanner scanner = new Scanner(System.in);
    GerarNumeroAleatorio gerarNumeroAleatorio = new GerarNumeroAleatorio();

    /**
     * Inicia a interação com o usuário
     * **/
    public void inicio(){
        System.out.println("VOCÊ TERÁ 10 TENTATIVAS PARA ACERTAR O NÚMERO.");

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número de 1 à 100");
            int numeroEscolhido = scanner.nextInt();
            scanner.nextLine();
            gerarNumeroAleatorio.verificarTentativas(numeroEscolhido);

            if (numeroEscolhido == gerarNumeroAleatorio.valorGerado){
                break;
            }
        }

        System.out.println("QUE PENA! VOCÊ ATINGIU O NÚMERO DE TENTATIVAS. \nTENTE NOVAMENTE.");
    }
}

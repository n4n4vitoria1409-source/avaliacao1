package atividade2;

import java.util.Scanner;

class AlturaEdificio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a altura de um andar (em metros): ");
        double alturaAndar = entrada.nextDouble();

        System.out.print("Digite a quantidade de andares do edifício: ");
        int quantidadeAndares = entrada.nextInt(5);

        // Processamento
        double alturaTotal = alturaAndar * quantidadeAndares;

        // Saída
        System.out.println("A altura total do edifício é: " + alturaTotal + " metros.");

        entrada.close();
    }
}
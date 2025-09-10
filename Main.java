import java.util.Scanner;

class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias bimestrais
        double b1 = (notas[0] + notas[1]) / 2;
        double b2 = (notas[2] + notas[3]) / 2;
        double b3 = (notas[4] + notas[5]) / 2;
        double b4 = (notas[6] + notas[7]) / 2;

        // Cálculo das médias semestrais
        double s1 = (b1 + b2) / 2;
        double s2 = (b3 + b4) / 2;

        // Cálculo da média final
        double mediaFinal = (s1 + s2) / 2;

        // Saída dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("1º Bimestre: " + b1);
        System.out.println("2º Bimestre: " + b2);
        System.out.println("1º Semestre: " + s1);
        System.out.println("3º Bimestre: " + b3);
        System.out.println("4º Bimestre: " + b4);
        System.out.println("2º Semestre: " + s2);
        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}
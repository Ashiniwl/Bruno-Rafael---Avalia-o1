package Avaliações;

import java.util.Scanner;

public class Q1AVALIAÇÃO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua 1° nota?");
        double nota1 = scanner.nextDouble();
        System.out.println("Qual sua 2° nota?");
        double nota2 = scanner.nextDouble();
        System.out.println("Qual sua 3° nota?");
        double nota3 = scanner.nextDouble();
        System.out.println("Qual sua 4° nota?");
        double nota4 = scanner.nextDouble();
        System.out.println("Qual sua 5° nota?");
        double nota5 = scanner.nextDouble();
        System.out.println("Qual sua 6° nota?");
        double nota6 = scanner.nextDouble();
        System.out.println("Qual sua 7° nota?");
        double nota7 = scanner.nextDouble();
        System.out.println("Qual sua 8° nota?");
        double nota8 = scanner.nextDouble();

        double mediaBimestral1 = (nota1 + nota2) / 2;
        double mediaBimestral2 = (nota3 + nota4) / 2;
        double mediaBimestral3 = (nota5 + nota6) / 2;
        double mediaBimestral4 = (nota7 + nota8) / 2;

        double mediaSemestral1 = (mediaBimestral1 + mediaBimestral2) / 2;
        double mediaSemestral2 = (mediaBimestral3 + mediaBimestral4) / 2;

        double mediaFinal = (mediaSemestral1 + mediaSemestral2) / 2;

        System.out.println("------------------ RESULTADOS DO ALUNO ------------------");
        System.out.printf("Sua 1° média bimestral é: %.1f\n", mediaBimestral1);
        System.out.printf("Sua 2° média bimestral é: %.1f\n", mediaBimestral2);
        System.out.printf("Sua 1° média semestral é: %.1f\n", mediaSemestral1);
        System.out.println("---------------------------------------------------------");
        System.out.printf("Sua 3° média bimestral é: %.1f\n", mediaBimestral3);
        System.out.printf("Sua 4° média bimestral é: %.1f\n", mediaBimestral4);
        System.out.printf("Sua 2° média semestral é: %.1f\n", mediaSemestral2);
        System.out.println("---------------------------------------------------------");
        System.out.printf("A sua média final é: %.1f", mediaFinal);




    }
}

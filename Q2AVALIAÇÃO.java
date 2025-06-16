package Avaliações;

import java.util.Scanner;

public class Q2AVALIAÇÃO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua temperatura em Celsius?");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Sua temperatura em Celsius: %.1fC°\n", celsius);
        System.out.printf("Sua temperatura em Fahrenheit: %.1fF°\n", fahrenheit);
        System.out.printf("Sua temperatura em Kelvin: %.1fK°\n", kelvin);
    }
}

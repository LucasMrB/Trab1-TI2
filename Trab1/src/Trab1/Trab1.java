package Trab1;

import java.util.Scanner;

class Trab1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: "); // primeiro valor
        int a = scanner.nextInt();

        System.out.println("Digite o segundo valor: "); // segundo valor
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("A soma é: " + soma); // resultado da soma 

    }
}
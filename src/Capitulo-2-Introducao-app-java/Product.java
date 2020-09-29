// Exercício 2.6: Product.java
// Calcula o produto de três números inteiros.

import java.util.Scanner;

public class Product
{
    public static void main(String[] args)
    {
        // cria Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int x; // primeiro número inserido pelo usuário
        int y; // segundo número inserido pelo usuário
        int z; // terceiro número insedrido pelo usuário
        int result; // produto dos números

        System.out.print("Enter first integer: "); // solicita entrada
        x = input.nextInt(); // lê o primeiro inteiro

        System.out.print("Enter second integer: "); // solicita entrada
        y = input.nextInt(); // lê o segundo inteiro

        System.out.print("Enter third integer: "); // solicita entrada
        z = input.nextInt(); // lê o terceiro inteiro

        result = x * y * z; // calcula o produto dos números

        System.out.printf("Product is %d%n", result);
    } // fim do método main
} // fim da classe Peoduct

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        operacoes operacoes = new operacoes();

        System.out.println("===== CALCULADORA =====");

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nDigite o primeiro número: ");
            double numeroUm = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numeroDois = scanner.nextDouble();

            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potência");
            System.out.println("6 - Sair");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            double resultado = 0;
            boolean operacaoValida = true;

            switch (opcao) {
                case 1:
                    resultado = operacoes.somar(numeroUm, numeroDois);
                    break;
                case 2:
                    resultado = operacoes.subtrair(numeroUm, numeroDois);
                    break;
                case 3:
                    resultado = operacoes.multiplicar(numeroUm, numeroDois);
                    break;
                case 4:
                    resultado = operacoes.dividir(numeroUm, numeroDois);
                    break;
                case 5:
                    resultado = operacoes.potenciar(numeroUm, numeroDois);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Encerrando a calculadora. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida && opcao >= 1 && opcao <= 5) {
                System.out.println("Resultado: " + resultado);
            }
        }

        scanner.close();
    }
}


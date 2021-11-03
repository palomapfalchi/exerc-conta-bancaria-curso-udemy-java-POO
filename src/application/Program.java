package application;

import entities.User;

import java.util.Scanner;

/*
Fazer um programa que consiga cadastrar uma conta bancária, sendo necessário informar
o número da conta, nome do titular e o valor do deposito inicial.
O depósito inicial é opcional.

Quando a conta for aberta, o número dela não pode ser alterado, apenas o nome do titular pode ser alterado.

O saldo da conta não pode ser alterado livremente.
Só aumenta com depośitos e diminui com saques.
Cada saque tem uma taxa de R$ 5.00

Objetivo: fazer um programa que realize o cadastro de uma conta, fazer um depósito e depois um saque
sempre mostrando os dados da conta.

 */
public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        User user;

        System.out.println("Abertura de conta");

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = scan.nextInt();
        System.out.print("Digite o nome do titular da conta: ");
        String nomeDoTitular = scan.next();
                        System.out.print("Será feito um deposíto inicial? (s/n)");
                        char resposta = scan.next().charAt(0);


                        if (resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = scan.nextDouble();
            user = new User(nomeDoTitular, depositoInicial, numeroDaConta);
        } else {
            user = new User(nomeDoTitular, numeroDaConta);
        }

        System.out.println();
        System.out.println(user);

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scan.nextDouble();
        user.deposito(valorDeposito);
        System.out.println(user);

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scan.nextDouble();
        user.saque(valorSaque);
        System.out.println(user);

    }

}
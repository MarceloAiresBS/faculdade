package com.mycompany.contabanco;

/**
 *
 * @author marcelo
 */
public class MovimentoBanco {

    public static void main(String[] args) {

        ContaBanco minhaConta = new ContaBanco();

        minhaConta.nomecliente = "Marcelo";
        minhaConta.tipo = "Conta Corrente";
        minhaConta.numbanco = 33;
        minhaConta.numagencia = 4319;
        minhaConta.numconta = 1037189;
        minhaConta.saldo = 1000;

        System.out.println("Nome do Correntista é: " + minhaConta.nomecliente);
        System.out.println("Tipo de conta é: " + minhaConta.tipo);
        System.out.println("Codigo do banco é: " + minhaConta.numbanco);
        System.out.println("Numero da agencia é: " + minhaConta.numagencia);
        System.out.println("Numero da conta é: " + minhaConta.numconta);
        System.out.println("Saldo atual é: R$" + minhaConta.saldo);

        minhaConta.saque(100);
        System.out.println("Saldo atualizado apos o saque R$" + minhaConta.saldo);

        minhaConta.deposito(200);
       System.out.println("Saldo atualizado apos o deposito R$" + minhaConta.saldo);
    }
}

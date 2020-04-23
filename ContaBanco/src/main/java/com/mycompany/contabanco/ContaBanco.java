package com.mycompany.contabanco;

/**
 *
 * @author marcelo
 */
public class ContaBanco {

    //atributos
    String nomecliente;
    String tipo;
    int numbanco;
    int numagencia;
    int numconta;
    double saldo;
    boolean status;

    //metodos
    void saldo() {
        if (this.saldo != 0) {
            System.out.println("Saldo insuficiente!!!! ");
        }
    }

    void saque(double valor) {
        if (this.saldo < valor) {
            System.out.println("Não a saldo para saque.");
        } else {
            this.saldo = this.saldo - valor;
            //System.out.println("Saldo atual é : " + this.saldo);
        }
    }

    void deposito(double valor) {
        this.saldo = saldo + valor;
    }

}

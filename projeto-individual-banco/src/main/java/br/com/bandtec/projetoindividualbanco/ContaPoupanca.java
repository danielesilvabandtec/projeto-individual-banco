package br.com.bandtec.projetoindividualbanco;



public class ContaPoupanca extends Conta {
    private double saldo;

    public ContaPoupanca(String agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta);
        this.saldo = saldo;
    }


    public double getRenderValor() {
        return (saldo * 0.25) + saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}


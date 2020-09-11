package br.com.bandtec.projetoindividualbanco;


public class ContaCorrente extends Conta {
    private double saldo;

    public ContaCorrente(String agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta);
        this.saldo = saldo;
    }


    public double getRenderValor() {
        return (saldo * 0.10) + saldo;
    }


}


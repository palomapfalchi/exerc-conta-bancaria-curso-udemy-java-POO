package entities;

public class User {
    private String nomeDoTitular;
    private double saldo;
    private int numeroDaConta;

    public User(String nomeDoTitular, double saldoInicial, int numeroDaConta) {
        this.nomeDoTitular = nomeDoTitular;
        deposito(saldoInicial);
        this.numeroDaConta = numeroDaConta;
    }

    public User(String nomeDoTitular, int numeroDaConta) {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void deposito(double montante){
        saldo = saldo + montante;
    }

    public void saque(double montante) {
        saldo = saldo - montante - 5.0;
    }

    @Override
    public String toString() {
        return "Dados Atualizados - " +
                "Nome Do Titular = " + nomeDoTitular + '\'' +
                ", Saldo = " + String.format("%.2f", saldo);
    }
}

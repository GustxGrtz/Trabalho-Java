package model;

import model.Usuario;

public class ContaBancaria {

    private int saldo;
    private static int contaId = 0;
    private Usuario usuario;
    private int valor;

    private ContaBancaria(int saldo, int contaId, Usuario usuario, int valor) {
        this.saldo = saldo;
        this.contaId = contaId;
        this.usuario = usuario;
        this.valor = valor;
    }

    public static ContaBancaria criarConta(int saldo, int contaId, Usuario usuario) {
        return new ContaBancaria(saldo, contaId, usuario, 0);
    }

    public int Sacar(int saldo) {
        return saldo -= getValor();
    }

    public int Depositar(int saldo) {
        return saldo += getValor();
    }

    public int verSaldo() {
        return getSaldo();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria [saldo=" + saldo + "]";
    }
}

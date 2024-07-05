package controller;

import java.util.List;

import model.ContaBancaria;
import model.Usuario;

public class Sistema {
    private String usuario;
    private ContaBancaria conta;
    private List<Usuario> usuarios;

    public Sistema(String usuario, ContaBancaria conta, List<Usuario> usuarios) {
        this.usuario = usuario;
        this.conta = conta;
        this.usuarios = usuarios;
    }

    public static ContaBancaria criarConta(int saldo, int contaId, Usuario usuario) {
        return new ContaBancaria(saldo, contaId, usuario, 0);
    }

    public Usuario criarUsuario(String nome, int cpf, String email) {
        return new Usuario(nome, cpf, email);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Sistema [usuario=" + usuario + ", conta=" + conta + "]";
    }
}

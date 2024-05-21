package view;

import controller.Cafeteria;
import models.Insumo.Insumo;
import models.Pessoa.Pessoa;
import models.Produto.*;
import models.Venda.Venda;

public class IFuncionalidade {

    //////// PARTE DO PRODUTO ////////
    public static void ListarProdutos(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarProdutos());
        } catch (Exception erroListarProduto) {
            System.out.println("Não há produtos registradas");
        }
    }

    public static void AdicionarProduto(Cafeteria cafeteria, Produto produto) throws Exception{
        try {
            cafeteria.AdicionarProduto(produto);
        } catch (Exception erroAdicionarProduto) {
            System.out.println("Produto ja registrado");
        }
    }

    public static void RemoverProduto(Cafeteria cafeteria, Produto produto) throws Exception{
        try {
            cafeteria.RemoverProduto(produto);
        } catch (Exception erroRemoverProduto) {
            System.out.println("Produto não encontrado");
        }
    }

    //////// PARTE DO INSUMO ////////
    public static void ListarInsumos(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarInsumos());
        } catch (Exception erroListarInsumos) {
            System.out.println("Não há insumos registrados");
        }
    }
    
    public static void AdicionarInsumo(Cafeteria cafeteria, Insumo insumo) throws Exception{
        try {
            cafeteria.AdicionarInsumo(insumo);
        } catch (Exception erroAdicionarInsumo) {
            System.out.println("Insumo ja registrado");
        }
    }

    public static void RemoverInsumo(Cafeteria cafeteria, Insumo insumo) throws Exception{
        try {
            cafeteria.RemoverInsumo(insumo);
        } catch (Exception erroRemoverInsumo) {
            System.out.println("Insumo não encontrado");
        }
    }

    //////// PARTE DA PESSOA ////////
    public static void ListarPessoas(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarPessoas());
        } catch (Exception erroListarPessoas) {
            System.out.println("Não há pessoas registradas");
        }
    }
    
    public static void ListarFuncionarios(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarFuncionarios());
        } catch (Exception erroListarFuncionarios) {
            System.out.println("Não há funcionários registrados");
        }
    }

    public static void ListarUsuarios(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarUsuarios());
        } catch (Exception erroListarUsuarios) {
            System.out.println("Não há usuários registrados");
        }
    }

    public static void AdicionarFuncionario(Cafeteria cafeteria, Pessoa funcionario) throws Exception{
        try {
            cafeteria.AdicionarFuncionario(funcionario);
        } catch (Exception erroAdicionarFuncionário) {
            System.out.println("Funcionário ja registrado");
        }
    }

    public static void RemoverFuncionario(Cafeteria cafeteria, Pessoa funcionario) throws Exception{
        try {
            cafeteria.RemoverFuncionario(funcionario);
        } catch (Exception erroRemoverInsumo) {
            System.out.println("Funcionário não encontrado");
        }
    }

    public static void AdicionarUsuario(Cafeteria cafeteria, Pessoa usuario) throws Exception{
        try {
            cafeteria.AdicionarUsuario(usuario);
        } catch (Exception erroAdicionarUsuario) {
            System.out.println("Usuário ja registrado");
        }
    }

    public static void RemoverUsuario(Cafeteria cafeteria, Pessoa usuario) throws Exception{
        try {
            cafeteria.RemoverUsuario(usuario);
        } catch (Exception erroRemoverUsuario) {
            System.out.println("Usuário não encontrado");
        }
    }

    //////// PARTE DA VENDA ////////
    public static void ListarVendas(Cafeteria cafeteria) throws Exception{
        try {
            System.out.println(cafeteria.ListarVendas());
        } catch (Exception erroListarVenda) {
            System.out.println("Não há vendas registradas");
        }
    }

    public static void AdicionarVenda(Cafeteria cafeteria, Venda venda) throws Exception{
        try {
            cafeteria.AdicionarVenda(venda);
        } catch (Exception erroAdicionarVenda) {
            System.out.println("Venda ja registrada");
        }
    }

    public static void RemoverVenda(Cafeteria cafeteria, Venda venda) throws Exception{
        try {
            cafeteria.RemoverVenda(venda);
        } catch (Exception erroRemoverVenda) {
            System.out.println("Venda não encontrada");
        }
    }

}

import java.util.ArrayList;

import Cafeteria.util.Log;
import controller.Cafeteria;
import models.Insumo.Insumo;
import models.Pessoa.Funcionario;
import models.Pessoa.Pessoa;
import models.Pessoa.Usuario;
import models.Produto.*;
import models.Venda.Venda;
import view.IFuncionalidade;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cafeteria cafeteria = new Cafeteria();

        Textos textos = new Textos(new ArrayList<String>());
        
        textos.add("Aluno 1");
        textos.add("Aluno 2");
        textos.add("Aluno 3");
        textos.add("Aluno 4");

        Produto leite = new Produto("Leite Integral", 15, 8.98);
        Produto leite2 = new Produto("Leite Desnatado", 30, 12.98);
        Produto cafe = new Produto("Café Preto", 9, 4.98);
        Insumo acucar = new Insumo("Açúcar", 20, 2.50);
        Insumo agua = new Insumo("Água", 50, 1.50);
        Venda venda1 = new Venda(cafe, agua, null , null);
        Pessoa funcionario1 = new Funcionario("Giorgian Arrasca", "111.222.333-44", 1440.18);
        Pessoa usuario1 = new Usuario("Pedro Gelbisco", "314.613.645-66", "pedroviski@email.com");
        

        //////// PARTE DO PRODUTO ////////

        IFuncionalidade.ListarProdutos(cafeteria);
        IFuncionalidade.AdicionarProduto(cafeteria, leite);
        IFuncionalidade.AdicionarProduto(cafeteria, leite2);
        IFuncionalidade.AdicionarProduto(cafeteria, cafe);
        IFuncionalidade.AdicionarProduto(cafeteria, cafe);
        IFuncionalidade.RemoverProduto(cafeteria, cafe);
        IFuncionalidade.RemoverProduto(cafeteria, cafe);
        Log.salvar(textos.getTextos(), "teste");
        System.out.println();

        //////// PARTE DO INSUMO ////////

        IFuncionalidade.ListarInsumos(cafeteria);
        IFuncionalidade.AdicionarInsumo(cafeteria, agua);
        IFuncionalidade.AdicionarInsumo(cafeteria, acucar);
        IFuncionalidade.AdicionarInsumo(cafeteria, acucar);
        IFuncionalidade.RemoverInsumo(cafeteria, acucar);
        IFuncionalidade.RemoverInsumo(cafeteria, acucar);
        System.out.println();

        //////// PARTE DA PESSOA ////////

        IFuncionalidade.ListarPessoas(cafeteria);
        IFuncionalidade.ListarFuncionarios(cafeteria);
        IFuncionalidade.AdicionarFuncionario(cafeteria, funcionario1);
        IFuncionalidade.AdicionarFuncionario(cafeteria, funcionario1);
        IFuncionalidade.RemoverFuncionario(cafeteria, funcionario1);
        IFuncionalidade.RemoverFuncionario(cafeteria, funcionario1);

        IFuncionalidade.ListarUsuarios(cafeteria);
        IFuncionalidade.AdicionarUsuario(cafeteria, usuario1);
        IFuncionalidade.AdicionarUsuario(cafeteria, usuario1);
        IFuncionalidade.RemoverUsuario(cafeteria, usuario1);
        IFuncionalidade.RemoverUsuario(cafeteria, usuario1);
        System.out.println();


        //////// PARTE DA VENDA ////////

        IFuncionalidade.ListarVendas(cafeteria);
        IFuncionalidade.AdicionarVenda(cafeteria, venda1);
        IFuncionalidade.AdicionarVenda(cafeteria, venda1);
        IFuncionalidade.RemoverVenda(cafeteria, venda1);
        IFuncionalidade.RemoverVenda(cafeteria, venda1);
        System.out.println();

        System.out.println(Log.ler("teste"));
    }
}
import model.ContaBancaria;
import model.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria c = new ContaBancaria(2500, 1, null, 0);
        Usuario u = new Usuario("teste", 123, "teste@gmail");

    }
}

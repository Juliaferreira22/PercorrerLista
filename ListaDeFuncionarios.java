import java.util.ArrayList;

public class ListaDeFuncionarios<T extends Funcionario> {

    /* Atributos */
    private ArrayList<T> funcionarios;

    /* Métodos */
    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int indice) {
        this.funcionarios.remove(indice);
    }

    public void listarFuncionarios() {
        for (int i = 0; i < funcionarios.size(); ++i) {

            System.out.println("Funcionario do mês " + i);

            funcionarios.get(i).listarDados();

        }
    }

    public ListaDeFuncionarios() {
        funcionarios = new ArrayList<T>();
    }

}

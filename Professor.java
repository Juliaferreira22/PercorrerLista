import java.util.ArrayList;

public class Professor implements Funcionario {

    /* Atributos */
    private float salario;
    private ArrayList<String> turmas;

    /* Métodos */
    @Override
    public void listarDados() {
        System.out.println("Sou um professor");
    }

    @Override
    public void demissao() {

    }

    @Override
    public void reduzirSalario() {

    }

    @Override
    public float obterSalario() {
        return 0;
    }

    public void mostrarTurmas() {

    }

    public void alterarTurmas() {

    }

}
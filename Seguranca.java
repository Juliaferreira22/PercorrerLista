public class Seguranca implements Funcionario {

    /* Atributos */
    float salario;
    String armamento;

    /* Métodos */
    public void alterarArmas() {

    }

    public void mostrarArmas() {

    }

    @Override
    public void listarDados() {
        System.out.println("Sou um segurança");
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
}

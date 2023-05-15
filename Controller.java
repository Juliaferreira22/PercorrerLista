public class Controller {
    public static void main(String[] args) {
        ListaDeFuncionarios<Funcionario> lista = new ListaDeFuncionarios<Funcionario>();

        Seguranca s = new Seguranca();
        lista.adicionarFuncionario(s);

        Professor p = new Professor();
        lista.adicionarFuncionario(p);

        lista.listarFuncionarios();
    }
}

package views;
import controllers.EmprestimoController;
import models.Emprestimo;
import models.ItemLivro;

public class ListarEmprestimo {
    Emprestimo emprestimo = new Emprestimo();

    public void renderizar(){
        EmprestimoController emprestimoController = new EmprestimoController();
        System.out.println("\n __________________________________");
        System.out.println("|                                  |");
        System.out.println("|      Listagem de Empréstimos     |");
        System.out.println("|__________________________________|\n");
        ItemLivro item = new ItemLivro();
        item = new ItemLivro();
    
        for (Emprestimo emprestimoCadastrada : emprestimoController.listar() ) {
            System.out.println("\n######## EMPRESTIMO ########");
 
                    System.out.println("Usuário: " + emprestimoCadastrada.getUsuario().getNome());
                    System.out.println("Funcionário:" + emprestimoCadastrada.getFuncionario().getNome());

                    for(ItemLivro itemCadastrado : emprestimoCadastrada.getLivros()){
                        System.out.println("-Livro: " + itemCadastrado.getLivro().getTitulo());

                    }
                 
        }
    } 
}

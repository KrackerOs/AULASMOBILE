package aula;

public class Aula5 {
    
    public static void main(String[] args) {
        //objeto
        Aula5 livro = new Aula5();

        livro.nome = "O Senhor dos Anéis";
        livro.descrição = "Uma obra-prima da literatura de fantasia.";
        livro.isbn = "9783161484100";
        livro.preco = 39.90;
        livro.autor = "J.R.R. Tolkien";
        livro.dataPub = "1954";

        livro.dadosLivro();
    }
}
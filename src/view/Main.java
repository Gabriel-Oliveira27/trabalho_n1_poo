package view;


import Models.Livro;


public class Main {


    public static void main(String[] args) {
        Livro livro = new Livro(
                1,
                "Dom Casmurro",
                "Machado de Assis",
                1899
        );


        System.out.println(livro.getAutor());
        livro.setAutor("Pedeo do forró");
        System.out.println(livro.getAutor());


    }
}


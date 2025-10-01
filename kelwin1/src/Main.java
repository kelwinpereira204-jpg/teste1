public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme: Top Gun: maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura com galâ dos anos 80
                   Muito bom" 
                   Ano de lançamento
                
                """ + anoDeLancamento;
        System.out.println(sinopse);
        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao); //fechar e abrir }}}}}
    }

}

public class Main {
    
    public static void main(String[] args) {
        Serie serie = new Serie("Sevem", Genero.POLICIAL, 2 );
        serie.inserirPersonagem("Brad Pitty");
        serie.inserirPersonagem("Morgan Freeman");
        // serie.exibir();
        serie.corrigirNome("Seven");

        Serie serie2 = new Serie("Brooklin 99", Genero.COMEDIA, 10 );
        serie2.inserirPersonagem("Peralta");
        serie2.inserirPersonagem("Cheddar");
        // serie2.exibir();

        serie.inserirPersonagem("Batatinha");
        // serie.exibir();

        serie.removerPersonagem("Batatinha");
        serie.removerPersonagem("Brad Pitty");
        serie.removerPersonagem("Morgan Freeman");
        // serie.exibir();

        Serie serie3 = new Serie("The Sinner", Genero.SUSPENSE, 3);
        serie3.inserirPersonagem("Robert");
        // serie3.exibir();

        ListaSerie listaSerie = new ListaSerie();
        listaSerie.incluirSerie(serie);
        listaSerie.incluirSerie(serie2);
        listaSerie.incluirSerie(serie3);
        listaSerie.retornarSerie();
        listaSerie.retornarSerieDetalhes();
    }




}

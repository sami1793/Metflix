public class App {
    public static void main(String[] args) throws Exception {
        //A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        //How I met your mother y 
        //reproducir el episodio.

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al metodo que crea las pelis y series.

        //Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");
        Serie serieBuscada = miMetflix.buscarSerie("Merli");

        //Temporada temporada = serieBuscada.buscarTemporada(5);
        Temporada temporada = serieBuscada.buscarTemporada(1);

        //Episodio episodio = temporada.buscarEpisodio(1);
        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();

        //BUSCO PELICULA
        //Volver al Futuro

        Pelicula peliculaBuscada= miMetflix.buscarPelicula("Volver al futuro");
        peliculaBuscada.reproducir();


        //BUSCO DIRECTOR
        //Director de Titanic

        Director directorBuscado= miMetflix.buscarDirectorPorPelicula("Titanic");
        System.out.println("El director de la peli es: "+directorBuscado.nombre);


    }
}

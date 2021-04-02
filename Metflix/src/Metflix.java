import java.util.ArrayList;
import java.util.List;

public class Metflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    
    //Metodo que inicializa el catalogo cno las pelis/series qeu querramos
    public void inicializarCatalogo(){

        //Pelis: Titanic, Batman: El caballero de la noche 
        Pelicula titanic; //declara una variable que apuntara a una Pelicula
        titanic = new Pelicula(); //Estas ultimoas 2 lineas: Pelicula titanic = new Pelicula();

        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; //3hs 30

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";

        //Agrego a la lista de actores del objeto titanic
        titanic.actores.add(actor); //metodo Add -> agregar a una lista

        titanic.director=new Director();
        titanic.director.nombre="James Cameron";

        //Recien ahora estoy agregando a Titanic al catalogo
        this.peliculas.add(titanic);

        //Otra Peli
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: el caballero de la nohe";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        //No voy a declarar otra variable actor, voy a reusar
        //siempre primero antes de reusar
        // re instanciar
        actor = new Actor(); //Creo un nuevo actor, pero referenciado con la variable actor
        actor.nombre = "Christian Bale";

        batman.actores.add(actor);

        this.peliculas.add(batman);

        ////////////AGREGO 3ra Pelicula como TAREA////////////////
        //"Volver al futuro"

        Pelicula volverFuturo=new Pelicula();//creo un objeto de la clase Pelicula
        volverFuturo.nombre="Volver al futuro";
        volverFuturo.añoLanzamiento=1985;
        volverFuturo.duracion=116;

        actor = new Actor();//reinstancio 
        actor.nombre="Michael J. Fox";

        //Pelicula tiene un atributo "actores" con una lista de actores, con add lo agrego
        volverFuturo.actores.add(actor);//agrego el actor a la lista de actores

        //la clase Metflix tiene una LISTA de peliculas, entonces agrego la pelicula:
        this.peliculas.add(volverFuturo);//agregué la pelicula a la lista
       //////////////Terminé de agregar 3ra pelicula(TAREA)//////////

      

        //How I met your mother. Serie

        Serie howIMetYM = new Serie();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento = 2005;
        
        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";

        howIMetYM.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";

        howIMetYM.actores.add(actor);
        
        //T5:E11
        //creo la temporada
        Temporada temporada = new Temporada();
        temporada.numero = 5;
     
        //Creo el episodio
        Episodio episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);


        //T3
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 3;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Little Boys";
        episodio.numero = 4;

        temporada.episodios.add(episodio);

        //Agrego la temporada
        howIMetYM.temporadas.add(temporada);

        //Aca esta toda la serie con 2 temporadas y cada una con 2 episodios.
        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.nombre = "The BigBang Theory";
        bbt.añoLanzamiento = 2007;
        
        actor = new Actor();
        actor.nombre = "Kaley Cuoco";

        bbt.actores.add(actor);

        
        //creo la temporada
        temporada = new Temporada();
        temporada.numero = 1;
     
        //Creo el episodio
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;

        //vinculo temporada con episodio
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "The Cooper-Hofstadter Polarizatio";

        temporada.episodios.add(episodio);

        //Agrego la temporada
        bbt.temporadas.add(temporada);

        this.series.add(bbt);


        ///////////////AGREGO 3ra Serie (TAREA)///////////////
        //Creo una serie
        Serie cobraKai= new Serie();
        cobraKai.nombre="Cobra Kai";
        cobraKai.añoLanzamiento=2018;

        actor=new Actor();
        actor.nombre="Willian Zabka";
        cobraKai.actores.add(actor);//la serie tiene un atributo con una lista de actores

        //Creo temporada
        temporada=new Temporada();//reinstancio Temporada
        temporada.numero=2;

        //Creo episodio
        episodio=new Episodio();//reinstancio Episodio
        episodio.nombre="Hielo y fuego";
        episodio.numero=3;

        //Ahora tengo que agregar el episodio en la temporada
        temporada.episodios.add(episodio);//temporada tiene atributo episodio 

        //Agrego temporada a serie
        //porque serie tiene un atributo LIST temporada
        cobraKai.temporadas.add(temporada);

        //Finalmente agrego Serie a Metflix
        //Metflix tiene un atributo con una lista de Series

        this.series.add(cobraKai);//agrego la serie cobra kai a la lista de series

        //PRUEBO AGREGAR OTRO T1E3
        //Creo Temporada
        //Probe y no pasa nada si lo agrego despues del this.series.add(cobraKai); 
        temporada=new Temporada();
        temporada.numero=1;

        //Creo Episodio
        episodio=new Episodio();
        episodio.nombre="Esqueleto";
        episodio.numero=3;

        //Agrego episodio en temporada:
        temporada.episodios.add(episodio);

        //Agrego Temporada en Series
        //Serie tiene una lista con temporadas
        cobraKai.temporadas.add(temporada);


        ///////////////AGREGO 4TA SERIE///////////////////////////////
        ///////////////Merli////////////////////
        //Crear serie
        Serie merli= new Serie();
        merli.nombre="Merli";
        merli.añoLanzamiento=2015;
        
        actor=new Actor();//reinstancio actor
        actor.nombre="Carlos Cuevas";

        //agrego el actor a la lista de actores que tiene la serie
        merli.actores.add(actor);

        actor=new Actor();
        actor.nombre="David Solans";
        //agrego OTRO actor a la lista
        merli.actores.add(actor);

        //Crear temporada
        temporada=new Temporada();
        temporada.numero=1;

        //Crear Episodio
        episodio=new Episodio();
        episodio.numero=1;
        episodio.nombre="Episodio 1";

        //agrego episodio en Temporada
        temporada.episodios.add(episodio);

        //Agrego temporada en serie
        merli.temporadas.add(temporada);

        //Agregar serie en catalogo
        this.series.add(merli);        



    }
    
    //Buscar Serie
    public Serie buscarSerie(String nombreABuscar){

        // series = | serie1 | serie2 | serie25 | serie40 |
        //vamos a usar el foreach: que sirve para recorrer listas
        //este ciclo, tiene una variable, qeu apunta en cada vuelta
        //a cada elemento de la lista
        //o sea la primer vez, va a apuntar a serie1, despues a serie2 ddesp
        //serie25 hasta que termina.
        for (Serie serie : this.series) {
            //pregunto si el nombre de la serie actual
            //que estoy recorriendo es la que necesito
            if (serie.nombre.equals(nombreABuscar))
                return serie; //devuelvo esta serie.
        }
        //si llego hasta aca, es porque no encontro la serie.
        return null;

    }

    //Buscar pelicula
    public Pelicula buscarPelicula(String nombreABuscar){
        for(Pelicula pelicula: this.peliculas){
            if(pelicula.nombre.equals(nombreABuscar))
                return pelicula;
            
        }
        return null;
    }


    //Buscar director dada una pelicula
    
    public Director buscarDirectorPorPelicula(String nombrePelicula){
        for(Pelicula pelicula:this.peliculas){
            if(pelicula.nombre.equals(nombrePelicula))
                return pelicula.director;
        }
        return null;
    }
    
    
}

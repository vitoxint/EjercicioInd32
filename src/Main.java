public class Main {
    public static void main(String[] args) {

        Listado lista = new Listado();

        Corredora h1 = new Honorario(
                "Juan Felipe" ,"Etchegoyen Parra" , "18369785-K",
                "985545555" , 31 , "INFORMÁTICA" , 1995
        );

        Corredora h2 = new Honorario(
                "Carolina Nicol" ,"Lopez Cáceres" , "14588569-K",
                "854598745" , 46 , "Contabilidad" , 2006
        );

        Corredora c1 = new Contratado(
                "Laura Paola" ,"Valdes Gonzalez" , "20554458-8",
                "958641234" , 23 , "05/12/2010" , 970000
        );

        Corredora c2 = new Contratado(
                "Kevin" ,"Gallardo" , "19855478-3",
                "569855456" , 26 , "01/04/2021" , 650000
        );

        Corredora e1 = new Eventual(
                "Mario Alfredo" ,"Vergara Tapia" , "17554668-8",
                "865554555" , 33 , "Inmediata" , "malvert@gmail.com"
        );

        System.out.println("*** LISTA DE TRABAJADORES ***");

        lista.agregarDato(c1);
        lista.agregarDato(c2);
        lista.agregarDato(h1);
        lista.agregarDato(h2);
        lista.agregarDato(e1);

        lista.desplegarLista();

    }
}

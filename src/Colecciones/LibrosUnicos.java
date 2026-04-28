package Colecciones;
import java.util.HashSet;
import java.util.Set;
public class LibrosUnicos {
    public static void main(String[] args) {
        Set<String> biblioteca = new HashSet<>();

        biblioteca.add("El principito");
        biblioteca.add("La maria");
        biblioteca.add("El Hercolobus");
        biblioteca.add("Luna Roja");



        System.out.println("Libros Disponibles");
        for(String libro : biblioteca){
            System.out.println("- " + libro);
        }

        String libroBuscar = "El principito";
        if (biblioteca.contains(libroBuscar)) {
            System.out.println("\nEl libro '" + libroBuscar + "' sí está disponible.");
        } else {
            System.out.println("\nEl libro '" + libroBuscar + "' no se encuentra.");
        }


        int totalLibros = biblioteca.size();
        System.out.println("Total de libros únicos: " + totalLibros);
    }
}




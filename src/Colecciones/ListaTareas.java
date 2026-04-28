package Colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    public static void main(String[] args) {

        List<String> tareas = new ArrayList<>();


        tareas.add("Estudiar lógica de programación");
        tareas.add("Configurar el entorno en IntelliJ");
        tareas.add("Terminar el taller de Java");
        tareas.add(1, "Revisar Git y GitHub");


        System.out.println("--- Mis Tareas Pendientes ---");
        for (String item : tareas) {
            System.out.println("- " + item);
        }


        System.out.println("\nCompletando tarea: 'Estudiar lógica de programación'...");
        tareas.remove("Estudiar lógica de programación"); // Por valor

        System.out.println("Eliminando la tarea en la posición 0...");
        tareas.remove(0);


        int totalPendientes = tareas.size();
        System.out.println("\nNúmero total de tareas pendientes: " + totalPendientes);

        System.out.println("Lista final: " + tareas);
    }
}





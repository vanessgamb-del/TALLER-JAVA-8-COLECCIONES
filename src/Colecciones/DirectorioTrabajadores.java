package Colecciones;
import java.util.HashMap;
import java.util.Map;
public class DirectorioTrabajadores {
    public static void main(String[] args) {
        Map<String, Double> trabajadores = new HashMap<>();


        trabajadores.put("Elisa Rivas", 1700.0);
        trabajadores.put("Hannes Molsa", 2500.0);
        trabajadores.put("Hanna Molsa", 3500.0);
        trabajadores.put("Vanessa Gamboa", 2800.0);


        for (Map.Entry<String, Double> e : trabajadores.entrySet()) {
            System.out.println("Trabajador: " + e.getKey() + " → Salario: $" + e.getValue());
        }


        System.out.println("\nActualizando salario de Hanna Molsa");
        trabajadores.put("Hanna Molsa", 3700.0);


        double sumaSalarios = 0;
        for (Double salario : trabajadores.values()) {
            sumaSalarios += salario;
        }

        double promedio = sumaSalarios / trabajadores.size();

        System.out.println("\nEl salario promedio de los " + trabajadores.size() + " trabajadores es: $" + promedio);
    }
}



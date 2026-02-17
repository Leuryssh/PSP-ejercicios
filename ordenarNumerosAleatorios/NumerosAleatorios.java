import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class NumerosAleatorios {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Introduce numeros");

        try {
            String mensaje;
        while ((mensaje=br.readLine()) != null && !mensaje.isEmpty()) {
            int numero = Integer.parseInt(mensaje.trim());

            lista.add(numero);


        }

        Collections.sort(lista);
        System.out.println("Los numeros ordenados son: " + lista);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        
        
    }
}

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Lanzador {

public static void main(String[] args) {
    ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "NumerosAleatorios");
    pb.redirectErrorStream(true);
    try {
      Process proceso = pb.start();

    OutputStream os = proceso.getOutputStream();
    PrintWriter pw = new PrintWriter(os, true);

    pw.println("22");
    pw.println("40");
    pw.println("50");
    pw.println("");
    pw.close();
    
    InputStream is = proceso.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    
    String resultado;

    while((resultado = br.readLine()) !=null){
        System.out.println("El hijo me ha dicho " + resultado);
    }

    

    int exitCode = proceso.waitFor();
    System.out.println("El proceso terminó con código: " + exitCode);  
    } catch (Exception e) {
        e.printStackTrace();
    }
    


}
}
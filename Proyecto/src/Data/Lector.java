package Data;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class Lector {
    private String puesto;
    private String titulo;

    public Lector() {

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public  ArrayList<String> lerrPuestos(String puesto,Path ruta) throws IOException {
        File archivo = new File(String.valueOf(ruta));
        ArrayList<String> lista = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);


            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace(System.out);
            }
        }
        return lista;

    }
}

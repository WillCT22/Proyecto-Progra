package Data;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    /**
     * Metodo para encontrar la dirección del archivo para los usuarios
     * @return String ruta
     * @since version 2
     * @author William
     */
    public String selecionCampoU(){
        String ruta="";
        String[] options = {"Mercadeo","Ingeniería","Cocina","Construcción","Medicina","Atención al cliente"};

        String campoLaboral = (String)JOptionPane.showInputDialog(null, "Seleccione su campo laboral:",
                "Colocame", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if(campoLaboral.equals("Mercadeo")){
            ruta = "Mercadeo.txt";

        }else if(campoLaboral.equals("Ingeniería")){
            ruta = "Ingenieria.txt";
        }else if(campoLaboral.equals("Cocina")){
            ruta = "Cocina.txt";
        }else if(campoLaboral.equals("Construcción")){
            ruta = "Construccion.txt";
        }else if(campoLaboral.equals("Medicina")){
            ruta = "Medicina.txt";
        }else if(campoLaboral.equals("Atención al cliente")){
            ruta = "AtencionCliente.txt";
        }
        return ruta;
    }
    /**
     * Metodo para encontrar la dirección del archivo para los empleadores
     * @return String ruta
     * @since version 2
     * @author William
     */
    public String seleccionCampoE(){
        String[] options = {"Mercadeo","Ingeniería","Cocina","Construcción","Medicina","Atención al cliente"};

        String campoLaboral = (String)JOptionPane.showInputDialog(null, "Seleccione el campo laboral:",
                "Campo Laboral", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        String ruta="";
        if(campoLaboral.equals("Mercadeo")){
            ruta = "OfertaMercadeo.txt";

        }else if(campoLaboral.equals("Ingeniería")){
            ruta = "OfertaIngenieria.txt";
        }else if(campoLaboral.equals("Cocina")){
            ruta = "OfertaCocina.txt";
        }else if(campoLaboral.equals("Construcción")){
            ruta = "OfertaConstruccion.txt";
        }else if(campoLaboral.equals("Medicina")){
            ruta = "OfertaMedicina.txt";
        }else if(campoLaboral.equals("Atención al cliente")){
            ruta = "OfertaAtencionCliente.txt";
        }
        return ruta;
    }
    /**
     * Meotodo para leer el archivo seleccioneado y guardarlo en un ArrayList
     * @param ruta direccion del archivo
     * @return ArrayList<Stirng> con el archivo guradado
     * @since version 3
     * @author William
     */

    public  ArrayList<String> leerArchivo(Path ruta) throws IOException {
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
    /**
     * Metodo para mostrar los datos al usuario del archivo deseado.
     * @param lista,dato,tipo ArrayList<String> con el archivo deseado, para clave para la busqueda, tipo de usuario
     * @return void
     * @since version 3
     * @author William
     */
    public void mostrarDatos(@NotNull ArrayList<String>lista, String dato, String tipo){
        int contador = 0;
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).equals(dato)){
                contador++;
            }
        }
        String[] vector = new String[contador];
        int z = 0;
        for(int j = 0;j<lista.size();j++){
            if(lista.get(j).equals(dato)){
                vector[z]=lista.get(j+1);
                z++;
            }
        }

        String seleccion = (String)JOptionPane.showInputDialog(null,"Seleccione una de las opciones","Colocame",
                JOptionPane.QUESTION_MESSAGE,null,vector,vector[0]);
        for(int x = 0;x<lista.size();x++){
            if(lista.get(x).equals(seleccion)){
                if(tipo.equals("Usuario")){
                    JOptionPane.showMessageDialog(null,lista.get(x-1)+" "+lista.get(x)+"\n"
                            +lista.get(x+1)+" "+lista.get(x+2)+"\n"+lista.get(x+3)+" "+lista.get(x+4)+"\n"+lista.get(x+5)+" "+lista.get(x+6)+"\n"
                            +lista.get(x+7)+" "+lista.get(x+8)+"\n"+lista.get(x+9)+" "+lista.get(x+10)+"\n"+lista.get(x+11)+" "+lista.get(x+12),"Colocame",JOptionPane.INFORMATION_MESSAGE);
                }else if(tipo.equals("Empleador")){
                    JOptionPane.showMessageDialog(null,lista.get(x-1)+" "+lista.get(x)+"\n"
                            +lista.get(x+1)+" "+lista.get(x+2)+"\n"+lista.get(x+3)+" "+lista.get(x+4)+"\n"+lista.get(x+5)+" "+lista.get(x+6)+"\n"
                            +lista.get(x+7)+" "+lista.get(x+8),"Colocame",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }




    }
}

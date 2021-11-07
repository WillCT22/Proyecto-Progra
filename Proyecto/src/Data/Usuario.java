package Data;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;


public class Usuario {
    private String nombre;
    private String telefono;
    private String correo;
    private String titulo;
    private String anosExperiencia;


    public Usuario(String nombre, String telefono, String correo, String titulo, String anosExperiencia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.titulo = titulo;
        this.anosExperiencia = anosExperiencia;

    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(String anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void guardarDatos(String nombre, String telefono, String correo,
                             String titulo, String anosExperiencia, Path ruta) throws IOException {
        File datos = new File(String.valueOf(ruta));
        if(!datos.exists()){
            datos.createNewFile();
        }
        FileWriter fw = new FileWriter(datos,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nombre:\n"+nombre+"\n");
        bw.write("Telefono:\n"+telefono+"\n");
        bw.write("Correo:\n"+correo+"\n");
        bw.write("Titulos:\n"+titulo+"\n");
        bw.write("Años:\n"+anosExperiencia+"\n");
        bw.write("***********\n");
        bw.close();


    }
}

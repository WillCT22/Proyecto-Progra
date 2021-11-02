package Data;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Usuario {
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
    private String titulo;
    private int anosExperiencia;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void subirCurriculum(){

    }
    public void guardarDatos(String nombre, int telefono, String correo, String direccion,
                             String titulo, int anosExperiencia,String ruta) throws IOException {
        File datos = new File(ruta);
        if(!datos.exists()){
            datos.createNewFile();
        }
        FileWriter fw = new FileWriter(datos);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nombre: "+nombre+"\n");
        bw.write("Telefono: "+telefono+"\n");
        bw.write("Correo: "+correo+"\n");
        bw.write("Direccion: "+direccion+"\n");
        bw.write("Titulos: "+titulo+"\n");
        bw.write("Anos: "+anosExperiencia+"\n");
        bw.write("***********\n");
        bw.close();


    }
}

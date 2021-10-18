package Data;

public class Usuario {
    String nombre;
    int telefono;
    String correo;
    String direccion;
    String titulo;
    String campoLaboral;
    int anosExperiencia;

    public Usuario(String nombre, int telefono, String correo, String direccion,
                   String titulo, String campoLaboral, int anosExperiencia) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.titulo = titulo;
        this.campoLaboral = campoLaboral;
        this.anosExperiencia = anosExperiencia;
    }
    public void subirCurriculum(){

    }
    public void guardarDatos(String nombre, int telefono, String correo, String direccion,
                             String titulo, String campoLaboral, int anosExperiencia){

    }
}

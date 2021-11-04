package Data;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Empleador {
    private String puesto;
    private String empresa;
    private String experienciMinima;
    private String horario;
    private int salrio;
    private String ubicacion;

    public Empleador(String puesto, String empresa, String experienciMinima, String horario, int salrio, String ubicacion) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.experienciMinima = experienciMinima;
        this.horario = horario;
        this.salrio = salrio;
        this.ubicacion = ubicacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getExperienciMinima() {
        return experienciMinima;
    }

    public void setExperienciMinima(String experienciMinima) {
        this.experienciMinima = experienciMinima;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSalrio() {
        return salrio;
    }

    public void setSalrio(int salrio) {
        this.salrio = salrio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void guardarDatos(String puesto, String empresa, String experienciMinima, String horario,
                             String ubicacion, int salrio,Path ruta) throws IOException {
        File datos = new File(String.valueOf(ruta));
        if(!datos.exists()){
            datos.createNewFile();
        }
        FileWriter fw = new FileWriter(datos,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nombre: "+puesto+"\n");
        bw.write("Telefono: "+empresa+"\n");
        bw.write("Correo: "+experienciMinima+"\n");
        bw.write("Direccion: "+horario+"\n");
        bw.write("Titulos: "+ubicacion+"\n");
        bw.write("Años: "+salrio+"\n");
        bw.write("***********\n");
        bw.close();


    }
}

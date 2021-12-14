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
    private String salrio;
    private String ubicacion;
    private String correo;
    private String codigoIdentificacion;

    public Empleador(String puesto, String empresa, String experienciMinima, String horario, String salrio, String ubicacion,String correo, String codigoIdentificacion) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.experienciMinima = experienciMinima;
        this.horario = horario;
        this.salrio = salrio;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public Empleador() {
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
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

    public String getSalrio() {
        return salrio;
    }

    public void setSalrio(String salrio) {
        this.salrio = salrio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void guardarDatos(String puesto, String empresa, String experienciMinima, String horario,
                             String ubicacion, String salrio,String correo, String codigoIdentificacion, Path ruta) throws IOException {
        File datos = new File(String.valueOf(ruta));
        if(!datos.exists()){
            datos.createNewFile();
        }
        FileWriter fw = new FileWriter(datos,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Puesto:\n"+puesto+"("+codigoIdentificacion+")"+"\n");
        bw.write("Nombre de la empresa:\n"+empresa+"\n");
        bw.write("Correo de la empresa:\n"+correo+"\n");
        bw.write("Experiencia minima:\n"+experienciMinima+" años\n");
        bw.write("Horario:\n"+horario+"\n");
        bw.write("Ubicación:\n"+ubicacion+"\n");
        bw.write("Salario:\n"+salrio+" colones\n");
        bw.write("***********\n");
        bw.close();


    }
}

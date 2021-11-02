package Data;

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
}

package Data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Usuario prueba = new Usuario();
        prueba.setNombre("Mario");
        prueba.setCorreo("Mario@gamil.com");
        prueba.setDireccion("Garita alajuela");
        prueba.setTelefono(74893426);
        prueba.setTitulo("Master mercadeo");
        prueba.setAnosExperiencia(4);

        Path file = Paths.get("prueba.txt");
        prueba.guardarDatos(prueba.getNombre(), prueba.getTelefono(), prueba.getCorreo(),prueba.getDireccion(),
                prueba.getTitulo(), prueba.getAnosExperiencia(), file);

    }
}

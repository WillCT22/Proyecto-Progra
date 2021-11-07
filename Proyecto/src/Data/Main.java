package Data;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int cont = 0;
        while(cont==0){
            int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción\n"+
                    "1) Busco empleo\n"+"2) Busco Un trabajador\n"+"0) Salir"));
            switch (op){
                case 1:
                    int cont2 = 2;
                    while (cont2==2){
                        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción\n"+
                                "1) Subir Datos personales\n"+"2) Buscar ofertas de empleo\n"+"0) Regresar"));
                        switch (op2){
                            case 1:
                                String[] options = {"Mercadeo","Ingeniería","Cocina","Construcción","Medicina","Atención al cliente"};

                                String campoLaboral = (String)JOptionPane.showInputDialog(null, "Seleccione su campo laboral:",
                                        "Campo Laboral", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                                String ruta="";
                                if(campoLaboral.equals("Mercadeo")){
                                    ruta = "Mercadeo.txt";

                                }else if(campoLaboral.equals("Ingeniería")){
                                    ruta = "Ingenieria.txt";
                                }else if(campoLaboral.equals("Cocina")){
                                    ruta = "Cocina.txt";
                                }else if(campoLaboral.equals("Construcción")){
                                    ruta = "Construccion.txt";
                                }else if(campoLaboral.equals("Medicina")){
                                    ruta = "Medicina";
                                }else if(campoLaboral.equals("Atención al cliente")){
                                    ruta = "AtencionCliente.txt";
                                }
                                JTextField nombre = new JTextField(5);
                                JTextField telefono = new JTextField(5);
                                JTextField correo = new JTextField(5);
                                JTextField titulos = new JTextField(5);
                                JTextField anosExp = new JTextField(5);

                                JPanel datos = new JPanel();
                                datos.setLayout(new BoxLayout(datos, BoxLayout.Y_AXIS));
                                datos.add(new JLabel("Nombre: "));
                                datos.add(nombre);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Telefono: "));
                                datos.add(telefono);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Correo: "));
                                datos.add(correo);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Titulos: "));
                                datos.add(titulos);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Años de experiencia: "));
                                datos.add(anosExp);
                                datos.add(Box.createVerticalStrut(5));
                                JOptionPane.showConfirmDialog(null, datos,
                                        "Ingrse sus datos personales", JOptionPane.OK_CANCEL_OPTION);

                                Usuario persona = new Usuario(nombre.getText(),telefono.getText(),correo.getText(),titulos.getText(),anosExp.getText());
                                Path file = Paths.get(ruta);
                                persona.guardarDatos(nombre.getText(),telefono.getText(),correo.getText(),titulos.getText(),anosExp.getText(),file);
                                break;
                            case 2:
                                // Prueba!
                                Lector prueba = new Lector();
                                ArrayList<String> prueba2 = prueba.lerrPuestos("Cheff ejecutivo", Paths.get("OfertaCocina.txt"));
                                for(int i = 0; i< prueba2.size(); i++){
                                    System.out.println(prueba2.get(i));
                                }

                                break;
                            case 0:
                                cont2 = 17;
                                break;
                        }

                    }break;
                case 2:
                    int cont3 = 4;
                    while (cont3==4){
                        int op3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción\n"+
                                "1) Subir oferta de empleo\n"+"2) Buscar trabajadores\n"+"0) Regresar"));
                        switch (op3){
                            case 1:
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
                                    ruta = "OfertaMedicina";
                                }else if(campoLaboral.equals("Atención al cliente")){
                                    ruta = "OfertaAtencionCliente.txt";
                                }
                                JTextField puesto = new JTextField(5);
                                JTextField empresa = new JTextField(5);
                                JTextField correo = new JTextField(5);
                                JTextField horario = new JTextField(5);
                                JTextField anosExp = new JTextField(5);
                                JTextField salario = new JTextField(5);
                                JTextField ubicaion = new JTextField(5);

                                JPanel datos = new JPanel();
                                datos.setLayout(new BoxLayout(datos, BoxLayout.Y_AXIS));
                                datos.add(new JLabel("Puesto: "));
                                datos.add(puesto);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Empresa: "));
                                datos.add(empresa);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Correo: "));
                                datos.add(correo);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Horario: "));
                                datos.add(horario);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Años de experiencia: "));
                                datos.add(anosExp);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Salario: "));
                                datos.add(salario);
                                datos.add(Box.createVerticalStrut(5));
                                datos.add(new JLabel("Ubicacion: "));
                                datos.add(ubicaion);
                                JOptionPane.showConfirmDialog(null, datos,
                                        "Ingrse los datos del puesto", JOptionPane.OK_CANCEL_OPTION);

                                Empleador jefe = new Empleador();
                                Path file = Paths.get(ruta);
                                jefe.guardarDatos(puesto.getText(),empresa.getText(),anosExp.getText(),horario.getText(),ubicaion.getText(),salario.getText(),
                                        correo.getText(),file);
                                break;
                            case 2:
                                break;
                            case 0:
                                cont3 = 17;
                                break;
                        }

                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"¡Gracias por usar el progrma!");
                    cont++;
                    break;
            }
        }


    }
}

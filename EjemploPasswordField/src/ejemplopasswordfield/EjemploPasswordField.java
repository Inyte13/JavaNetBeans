package ejemplopasswordfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploPasswordField {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ejemplo JPasswordField");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(400, 200);
    ventana.setLayout(new FlowLayout());
    ventana.setLocationRelativeTo(null);
    // Crear el campo de texto con 15 columnas de ancho
    JPasswordField campoPassword = new JPasswordField(15);
    campoPassword.setEchoChar('*');
    ventana.add(new JLabel("Contraseña:"));
    ventana.add(campoPassword);
    JButton btnMostrar = new JButton("Mostrar contraseña");
    JTextArea areaTexto = new JTextArea(3, 25);
    btnMostrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        char passwordChars[] = campoPassword.getPassword();
        String password = new String(passwordChars);
        int longitud = campoPassword.getPassword().length;
        campoPassword.selectAll();
        boolean editable = campoPassword.isEditable();
        boolean focus = campoPassword.hasFocus();
        areaTexto.setText(
                "Contraseña ingresada: " + password +
                "\nLongitud: " + longitud +
                "\nEditable: " + editable +
                "\nTiene foco: " + focus
        );
      }
    });
    ventana.add(btnMostrar);
    ventana.add(areaTexto);
    ventana.setVisible(true);
  }
}


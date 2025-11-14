package ejemplopasswordfield;


import javax.swing.*;
import java.awt.*;

public class EjemploPasswordField extends JFrame {
  public EjemploPasswordField() {
    setTitle("Ejercicio");
    setSize(350, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel panel = new JPanel();

    JTextField usuario = new JTextField(10);
    JPasswordField password = new JPasswordField(10);
    password.setEchoChar('*');
    JCheckBox mostrar = new JCheckBox("Mostrar contraseña");

    JRadioButton formal = new JRadioButton("Saludo formal");
    JRadioButton informal = new JRadioButton("Saludo informal");
    ButtonGroup grupo = new ButtonGroup();
    grupo.add(formal);
    grupo.add(informal);
    informal.setSelected(true);

    JButton boton = new JButton("Aceptar");
    JTextArea salida = new JTextArea(4, 25);

    JPanel panelDatos = new JPanel(new GridLayout(2, 2));
    panelDatos.add(new JLabel("Usuario:"));
    panelDatos.add(usuario);
    panelDatos.add(new JLabel("Contraseña:"));
    panelDatos.add(password);

    panel.add(panelDatos);
    panel.add(mostrar);
    panel.add(formal);
    panel.add(informal);
    panel.add(boton);
    panel.add(salida);

    mostrar.addActionListener(e -> {
      if (mostrar.isSelected()){
        password.setEchoChar((char)0); // Caracter nulo
      }
    });

    boton.addActionListener(e -> {
      String strUsuario = usuario.getText();
      String strContrasena = new String(password.getPassword());
      if (formal.isSelected()){
        salida.setText("Bienvenido, " + strUsuario);
      }
      else{
        salida.setText("Hola " + strUsuario);
      }
      salida.append("\nContraseña ingresada: " + strContrasena);
    });
    add(panel);
    setVisible(true);
  }

  public static void main(String[] args) {
    new EjemploPasswordField();
    
  }

}



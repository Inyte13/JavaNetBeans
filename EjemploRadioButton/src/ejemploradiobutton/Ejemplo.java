package ejemploradiobutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ejemplo {
public static void main(String[] args) {
  JFrame ventana = new JFrame("Ejemplo JRadioButton");
  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  ventana.setSize(400, 250);
  ventana.setLocationRelativeTo(null);
  ventana.setLayout(new FlowLayout());
  JRadioButton rbHombre = new JRadioButton("Hombre");
  JRadioButton rbMujer = new JRadioButton("Mujer");
  JRadioButton rbOtro = new JRadioButton("Otro", true);
  ButtonGroup grupoGenero = new ButtonGroup();
  grupoGenero.add(rbHombre);
  grupoGenero.add(rbMujer);
  grupoGenero.add(rbOtro);
  rbOtro.setText("Prefiero no decirlo");
  rbHombre.setEnabled(true);
  String textoMujer = rbMujer.getText();
  JButton btnMostrar = new JButton("Mostrar selección");
  JTextArea areaTexto = new JTextArea(4, 25);
  btnMostrar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      String seleccion = "";
      if (rbHombre.isSelected()) {
        seleccion = rbHombre.getText();
      } else if (rbMujer.isSelected()) {
        seleccion = rbMujer.getText();
      } else if (rbOtro.isSelected()) {
        seleccion = rbOtro.getText();
      }
      rbMujer.setSelected(true);
      areaTexto.setText(
              "Opción seleccionada: " + seleccion +
              "\nTexto del botón Mujer: " + textoMujer +
              "\n¿Está habilitado 'Hombre'? " + rbHombre.isEnabled() +
              "\n'Prefiero no decirlo' está seleccionado: " + rbOtro.isSelected()
      );
    }
  });
  ventana.add(rbHombre);
  ventana.add(rbMujer);
  ventana.add(rbOtro);
  ventana.add(btnMostrar);
  ventana.add(areaTexto);
  ventana.setVisible(true);
  } 
}

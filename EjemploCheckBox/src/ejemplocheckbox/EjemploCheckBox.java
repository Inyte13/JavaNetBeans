package ejemplocheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploCheckBox {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ejemplo JCheckBox");
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setSize(400, 250);
      ventana.setLayout(new FlowLayout());
      ventana.setLocationRelativeTo(null);
      JCheckBox chkMusica = new JCheckBox("Me gusta la música");
      JCheckBox chkDeportes = new JCheckBox("Practico deportes", true);
      JCheckBox chkNoticias = new JCheckBox("Recibir noticias");
      chkNoticias.setText("Deseo recibir noticias por correo");
      chkMusica.setEnabled(true);
      String texto = chkDeportes.getText();
      JButton btnMostrar = new JButton("Mostrar selección");
      JTextArea areaTexto = new JTextArea(5, 25);
      btnMostrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          boolean musicaSeleccionada = chkMusica.isSelected();
          boolean deportesSeleccionado = chkDeportes.isSelected();
          boolean noticiasSeleccionado = chkNoticias.isSelected();
          chkDeportes.setSelected(!deportesSeleccionado);
          areaTexto.setText(
              "Música: " + musicaSeleccionada +
              "\nDeportes (invertido): " + chkDeportes.isSelected() +
              "\nNoticias: " + noticiasSeleccionado +
              "\nTexto del checkbox deportes: " + texto +
              "\nEstá habilitado Música: " + chkMusica.isEnabled()
          );
        }
      });
      ventana.add(chkMusica);
      ventana.add(chkDeportes);
      ventana.add(chkNoticias);
      ventana.add(btnMostrar);
      ventana.add(areaTexto);
      ventana.setVisible(true);
  }
}

import javax.swing.*; // Para usar los componentes gráficos como JFrame, JButton, JLabel.

public class HambreBasico {
    public static void main(String[] args) {
        // Ejecuta el código gráfico en el hilo correcto (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            // Crear la ventana principal
            JFrame ventana = new JFrame("Pregunta"); // Título de la ventana
            ventana.setSize(300, 150); // Tamaño: 300 píxeles de ancho y 150 de alto
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al cerrar la ventana

            // Crear un panel donde pondremos los elementos (texto y botones)
            JPanel panel = new JPanel(); // Un panel es un contenedor
            ventana.add(panel); // Añadir el panel a la ventana

            // Llamar a un método que agrega los componentes al panel
            colocarComponentes(panel);

            // Hacer visible la ventana
            ventana.setVisible(true);
        });
    }

    private static void colocarComponentes(JPanel panel) {
        // Agregar un texto al panel
        JLabel etiqueta = new JLabel("¿Tienes hambre pendendejo?"); // Texto en la pantalla
        panel.add(etiqueta); // Añadir la etiqueta al panel

        // Crear un botón "Sí"
        JButton botonSi = new JButton("Sí");
        panel.add(botonSi); // Añadir el botón al panel
        botonSi.setPreferredSize(new java.awt.Dimension(250, 70)); // Más grande

        // Acción cuando se presiona el botón "Sí"
        botonSi.addActionListener(e -> JOptionPane.showMessageDialog(null, "¡come algo gilipollas!"));

        // Crear un botón "No"
        JButton botonNo = new JButton("No");
        panel.add(botonNo); // Añadir el botón al panel
        botonNo.setPreferredSize(new java.awt.Dimension(250, 70)); // Más grande

        // Acción cuando se presiona el botón "No"
        botonNo.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "¡venezolano tenia que ser!");
            System.exit(0); // Termina el programa al hacer clic en "No"
        });
    }
}

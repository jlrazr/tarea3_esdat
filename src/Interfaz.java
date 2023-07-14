import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    // Atributos para los elementos de la interfaz
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtAnho;
    private JTextArea txtResultados;
    private ArbolBinario arbol;

    public Interfaz() {
        // Configurar la ventana
        setSize(500, 500);
        setTitle("Gestión de Árbol Binario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar el árbol binario
        arbol = new ArbolBinario();

        // Crear los elementos de la interfaz
        JPanel panel = new JPanel(new GridLayout(8, 2));

        JLabel lblId = new JLabel("Id:");
        txtId = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();

        JLabel lblAnho = new JLabel("Año:");
        txtAnho = new JTextField();

        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para insertar un nuevo libro en el árbol binario
            }
        });

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para eliminar un libro del árbol binario
            }
        });

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para buscar un libro en el árbol binario
            }
        });

        txtResultados = new JTextArea();
        txtResultados.setEditable(false);

        // Añadir los elementos al panel
        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblAnho);
        panel.add(txtAnho);
        panel.add(btnInsertar);
        panel.add(btnEliminar);
        panel.add(btnBuscar);
        panel.add(txtResultados);

        // Añadir el panel a la ventana
        add(panel);
    }
}
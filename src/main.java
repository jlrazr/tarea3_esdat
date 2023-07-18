import javax.swing.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InterfazUsuario frame = new InterfazUsuario();
                frame.setVisible(true);
            }
        });
    }
    
}

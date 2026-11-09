package uff.ic.lleme.tcc00328.aulas.threads.temporizador;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import uff.ic.lleme.tcc00328.aulas.threads.temporizador.view.TelaPrincipal;

public abstract class Main {

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        TelaPrincipal.getInstance();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}

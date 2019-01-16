import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewContactAction extends AbstractAction {

    public NewContactAction() {
        putValue(Action.NAME, "Ajouter un contact");
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_A);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke('A', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String nom = JOptionPane.showInputDialog(null, "Nom du contact", "Création d'un contact", JOptionPane.QUESTION_MESSAGE);
        String infos = JOptionPane.showInputDialog(null, "Informations du contact", "Création d'un contact", JOptionPane.QUESTION_MESSAGE);
    }

}

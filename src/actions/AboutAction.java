package actions;

import base.AddressBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AboutAction extends AbstractAction {

    public AboutAction() {
        putValue(Action.NAME, "A propos");
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "AdressBook v0.0.1 par Bryan NICOT");
    }

}

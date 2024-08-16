package UserInterface.CustomerControl;

import javax.swing.JLabel;

import UserInterface.Style_EcuaFauna;

public class SOJLabel extends JLabel{
    public SOJLabel(String text) {
        super(text);
        customizeComponent();
    }

    private void customizeComponent() {
        setFont(Style_EcuaFauna.FONT);
        setForeground(Style_EcuaFauna.COLOR_FONT_LIGHT);
        setHorizontalAlignment(Style_EcuaFauna.ALIGNMENT_LEFT);  // Puedes ajustar la alineación según sea necesario
    }
}

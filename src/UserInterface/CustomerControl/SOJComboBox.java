package UserInterface.CustomerControl;

import javax.swing.JComboBox;

import UserInterface.Style_EcuaFauna;

public class SOJComboBox<T> extends JComboBox<T> {
    public SOJComboBox() {
        super();
        customizeComponent();
    }

    public SOJComboBox(T[] items) {
        super(items);
        customizeComponent();
    }

    private void customizeComponent() {
        setFont(Style_EcuaFauna.FONT);
        setForeground(Style_EcuaFauna.COLOR_FONT);
    }
}

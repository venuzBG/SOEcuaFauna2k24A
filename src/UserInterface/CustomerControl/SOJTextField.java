package UserInterface.CustomerControl;

import UserInterface.Style_EcuaFauna;
import java.awt.Insets;
import javax.swing.JTextField;

public class SOJTextField extends JTextField{
    public SOJTextField(int columns) {
        super(columns);
        customizeComponent();
    }

    private void customizeComponent() {
        setFont(Style_EcuaFauna.FONT);  
        setForeground(Style_EcuaFauna.COLOR_FONT_LIGHT);  
        setCaretColor(Style_EcuaFauna.COLOR_CURSOR);  
        setMargin(new Insets(5, 5, 5, 5));  
        setOpaque(false);  
    }
}

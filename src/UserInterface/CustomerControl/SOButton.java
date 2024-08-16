package UserInterface.CustomerControl;

import java.awt.event.MouseListener;

import javax.swing.JButton;
import UserInterface.Style_EcuaFauna;

import org.w3c.dom.events.MouseEvent;

public class SOButton extends JButton implements MouseListener {
    public SOButton(String text){
        customizeComponent(text);
    }

    
    private void customizeComponent(String text) {
        setText(text);                   // Establece el texto del botón
        setOpaque(false);        // Hace que el botón sea transparente
        setFocusPainted(false);         // Elimina el borde de enfoque cuando se selecciona
        setBorderPainted(false);        // Elimina el borde del botón
        setContentAreaFilled(false);    // Elimina el área de contenido del botón
        setForeground(Style_EcuaFauna.COLOR_FONT_LIGHT);  // Establece el color del 
        setFont(Style_EcuaFauna.FONT);  // Establece la fuente usando Style_ExamII
        setCursor(Style_EcuaFauna.CURSOR_HAND);  // Cambia el cursor a la mano cuando el ratón está sobre el botón
    }



    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        setForeground(Color.BLACK);
        setCursor(Style_EcuaFauna.CURSOR_HAND);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        setForeground(Color.GRAY);
        setCursor(Style_EcuaFauna.CURSOR_DEFAULT);
    }
}

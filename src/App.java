import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;
// import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;

import UserInterface.Form.HormigueroVirtual;

public class App {
    public static void main(String[] args) throws Exception {

        // testing: DAO
        // try {
        // HormigaDAO sDao = new HormigaDAO();
        // for(HormigaDTO s : sDao.readAll())
        // System.out.println(s.toString());
        // } catch (Exception e) {
        // System.out.println(e.toString());
        // }

        // FlatDarkLaf.setup();
        // FlatDarkLaf.supportsNativeWindowDecorations();
        // try {
        //     UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
        // } catch (UnsupportedLookAndFeelException e) {
        //     e.printStackTrace();
        // }
        // FlatLightLaf.setup();
        // FlatLightLaf.supportsNativeWindowDecorations();
        // Crear instancia de la clase HormigueroVirtual
        // try {
        //     UIManager.setLookAndFeel(new FlatMonokaiProIJTheme());
        // } catch (UnsupportedLookAndFeelException e) {
            //     e.printStackTrace();
        // }

        // FlatLightLaf.setup();
        // FlatLightLaf.supportsNativeWindowDecorations();
        // try {
        //     UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
        // } catch (UnsupportedLookAndFeelException e) {
        //     e.printStackTrace();
        // }
        
        new HormigueroVirtual();
    }
}

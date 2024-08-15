package UserInterface.Form;

import javax.swing.*;
import java.awt.*;

public class HormigueroVirtual {

    public HormigueroVirtual() {
        // Crear el frame principal
        JFrame frame = new JFrame("EcuaFauna 2k24A");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Crear un panel para contener todos los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // Cedula Label
        JLabel cedulaLabel = new JLabel("Cédula:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(cedulaLabel, gbc);
        
        // Cedula TextField
        JTextField cedulaField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(cedulaField, gbc);
        
        // Nombre Label
        JLabel nombreLabel = new JLabel("Nombre:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nombreLabel, gbc);
        
        // Nombre TextField
        JTextField nombreField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nombreField, gbc);
        
        // Icono y Hormiguero Virtual Label
        JLabel iconoLabel = new JLabel(new ImageIcon("/UserInterface/Resource/Icono/hormiga.png")); // Cambia la ruta al icono correspondiente
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(iconoLabel, gbc);
        
        JLabel hormigueroLabel = new JLabel("Hormiguero Virtual");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(hormigueroLabel, gbc);
        
        // Botón Crear hormiga Larva
        JButton crearLarvaButton = new JButton("Crear hormiga Larva");
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(crearLarvaButton, gbc);
        
        // Tabla de 6 columnas y 3 filas
        String[] columnNames = {"Col1", "Col2", "Col3", "Col4", "Col5", "Col6"};
        Object[][] data = {
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""},
            {"", "", "", "", "", ""}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH; // Ajusta el tamaño para eliminar el espacio vacío
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel.add(tableScrollPane, gbc);
        
        // ComboBox GenoAlimento
        String[] genoAlimentoOptions = {"<GenoAlimento>", "X", "XX", "XY"};
        JComboBox<String> genoAlimentoComboBox = new JComboBox<>(genoAlimentoOptions);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panel.add(genoAlimentoComboBox, gbc);
        
        // Botón alimentar con Genoalimento
        JButton alimentarButton = new JButton("alimentar con Genoalimento");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(alimentarButton, gbc);
        
        // ComboBox IngestaNativa
        String[] ingestaNativaOptions = {"<IngestaNativa>", "Carnívoro", "Herbívoro", "Omnívoro", "Insectívoros"};
        JComboBox<String> ingestaNativaComboBox = new JComboBox<>(ingestaNativaOptions);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ingestaNativaComboBox, gbc);
        
        // Botón alimentar con Ingesta Nativa
        JButton alimentarIngestaButton = new JButton("alimentar con Ingesta Nativa");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(alimentarIngestaButton, gbc);
        
        // Botones Borrar y Guardar
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton borrarButton = new JButton("Borrar");
        JButton guardarButton = new JButton("Guardar");
        buttonsPanel.add(borrarButton);
        buttonsPanel.add(guardarButton);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        panel.add(buttonsPanel, gbc);
        
        // Agregar el panel al frame y hacerlo visible
        frame.add(panel);
        frame.setVisible(true);
    }
}

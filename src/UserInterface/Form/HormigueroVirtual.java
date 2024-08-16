package UserInterface.Form;

import UserInterface.CustomerControl.SOButton;
import UserInterface.CustomerControl.SOJComboBox;
import UserInterface.CustomerControl.SOJLabel;
import UserInterface.CustomerControl.SOJTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class HormigueroVirtual {

    private int regNroCounter = 1; // Contador para RegNro
    private DefaultTableModel model; // Modelo de la tabla

    public HormigueroVirtual() {
        // Crear el frame principal
        JFrame frame = new JFrame("EcuaFauna 2k24A");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setResizable(false);
        
        // Crear un panel para contener todos los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        // Cedula Label
        SOJLabel cedulaLabel = new SOJLabel("Cédula:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(cedulaLabel, gbc);
        
        // Cedula TextField
        SOJTextField cedulaField = new SOJTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(cedulaField, gbc);
        
        // Nombre Label
        SOJLabel nombreLabel = new SOJLabel("Nombre:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nombreLabel, gbc);
        
        // Nombre TextField
        SOJTextField nombreField = new SOJTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nombreField, gbc);
        
        // Icono y Hormiguero Virtual Label
        JLabel iconoLabel = new JLabel(new ImageIcon("/UserInterface/Resource/Icon/hormiga.png")); // Cambia la ruta al icono correspondiente
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(iconoLabel, gbc);
        
        SOJLabel hormigueroLabel = new SOJLabel("Hormiguero Virtual");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(hormigueroLabel, gbc);
        
        // Botón Crear hormiga Larva
        SOButton crearLarvaButton = new SOButton("Crear hormiga Larva");
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(crearLarvaButton, gbc);
        
        // Tabla de 7 columnas con títulos personalizados
        String[] columnNames = {"RegNro", "TipoHormiga", "Ubicacion", "Sexo", "GenoAlimento", "IngestaNativa", "Estado"};
        model = new DefaultTableModel(null, columnNames);
        JTable table = new JTable(model);

        // Ajustar los tamaños de las columnas y los espacios entre ellas
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setPreferredWidth(100); // Ancho preferido de cada columna
        }

        // Ajustar espacios entre filas y columnas
        table.setRowHeight(30); // Ajustar altura de fila
        table.setIntercellSpacing(new Dimension(10, 5)); // Espacio entre columnas (10) y filas (5)

        // Establecer color de fondo de las celdas en blanco
        table.setBackground(Color.WHITE);

        // Personalizar los bordes de las celdas
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setBackground(Color.WHITE);
                ((JComponent) cell).setBorder(new LineBorder(Color.BLUE, 2)); // Cambiar color y grosor del borde
                return cell;
            }
        });

        // Reducir espacio debajo de la tabla
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH; 
        gbc.weightx = 1.0;
        gbc.weighty = 0.2; // Reducir el peso en Y para minimizar el espacio
        panel.add(new JScrollPane(table), gbc);
        
        // ComboBox GenoAlimento
        String[] genoAlimentoOptions = {"<GenoAlimento>", "X", "XX", "XY"};
        SOJComboBox<String> genoAlimentoComboBox = new SOJComboBox<>(genoAlimentoOptions);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 0;
        panel.add(genoAlimentoComboBox, gbc);
        
        // Botón alimentar con Genoalimento
        SOButton alimentarButton = new SOButton("alimentar con Genoalimento");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(alimentarButton, gbc);
        
        // ComboBox IngestaNativa
        String[] ingestaNativaOptions = {"<IngestaNativa>", "Carnívoro", "Herbívoro", "Omnívoro", "Insectívoros"};
        SOJComboBox<String> ingestaNativaComboBox = new SOJComboBox<>(ingestaNativaOptions);
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(ingestaNativaComboBox, gbc);
        
        // Botón alimentar con Ingesta Nativa
        SOButton alimentarIngestaButton = new SOButton("alimentar con Ingesta Nativa");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(alimentarIngestaButton, gbc);
        
        // Botones Borrar y Guardar
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        SOButton borrarButton = new SOButton("Borrar");
        SOButton guardarButton = new SOButton("Guardar");
        buttonsPanel.add(borrarButton);
        buttonsPanel.add(guardarButton);
        
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 3;
        panel.add(buttonsPanel, gbc);

        // Agregar acción al botón "Crear hormiga Larva"
        crearLarvaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, 
                        "¿Está seguro de crear una hormiga?", 
                        "Confirmar", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.YES_OPTION) {
                    // Agregar una nueva fila con valores predeterminados
                    model.addRow(new Object[]{
                            regNroCounter++, // RegNro secuencial
                            "Larva",          // Tipo Hormiga
                            "",               // Ubicacion (vacío por defecto)
                            "Asexual",        // Sexo
                            "",               // GenoAlimento (vacío por defecto)
                            "",               // IngestaNativa (vacío por defecto)
                            "Vivo"            // Estado
                    });
                }
            }
        });
        
        // Agregar el panel al frame y hacerlo visible
        frame.add(panel);
        frame.setVisible(true);
    }
}

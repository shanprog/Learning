package ch_34_04.book.lst_04;

import ch_34_04.book.lst_02_03.DescriptionPanel;

import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo extends JFrame {

    private String[] flagTitles = {"Canada", "China", "Denmark",
            "France", "Germany", "India", "Norway", "United Kingdom",
            "United States of America"};

    private ImageIcon[] flagImage = {
            new ImageIcon("image/ca.gif"),
            new ImageIcon("image/china.gif"),
            new ImageIcon("image/denmark.gif"),
            new ImageIcon("image/fr.gif"),
            new ImageIcon("image/germany.gif"),
            new ImageIcon("image/india.gif"),
            new ImageIcon("image/norway.gif"),
            new ImageIcon("image/uk.gif"),
            new ImageIcon("image/us.gif")};

    private String[] flagDescription = new String[9];

    private DescriptionPanel descriptionPanel = new DescriptionPanel();

    private JComboBox jcbo = new JComboBox(flagTitles);

    public static void main(String[] args) {
        ComboBoxDemo frame = new ComboBoxDemo();
        frame.pack();
        frame.setTitle("ComboBoxDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public ComboBoxDemo() throws HeadlessException {
        flagDescription[0] = "The Canadian national flag...";
        flagDescription[1] = "Description for China ... ";
        flagDescription[2] = "Description for Denmark ... ";
        flagDescription[3] = "Description for France ... ";
        flagDescription[4] = "Description for Germany ... ";
        flagDescription[5] = "Description for India ... ";
        flagDescription[6] = "Description for Norway ... ";
        flagDescription[7] = "Description for UK ... ";
        flagDescription[8] = "Description for US ... ";

        setDisplay(0);

        add(jcbo, BorderLayout.NORTH);

        add(descriptionPanel, BorderLayout.CENTER);

        jcbo.addItemListener(e -> setDisplay(jcbo.getSelectedIndex()));
    }

    public void setDisplay(int index) {
        descriptionPanel.setTitle(flagTitles[index]);
        descriptionPanel.setImageIcon(flagImage[index]);
        descriptionPanel.setDescription(flagDescription[index]);
    }

}

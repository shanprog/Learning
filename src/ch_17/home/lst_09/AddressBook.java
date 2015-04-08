package ch_17.home.lst_09;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AddressBook extends JFrame {

    private JTextField tfName;
    private JTextField tfStreet;
    private JTextField tfCity;
    private JTextField tfState;
    private JTextField tfZip;

    private JButton add;
    private JButton first;
    private JButton next;
    private JButton previous;
    private JButton last;
    private JButton update;

    private RandomAccessFile raf;

    public AddressBook() throws HeadlessException {

        try {
            raf = new RandomAccessFile("addressBook.dat", "rw");


        } catch (IOException ioe) {

        }




        setTitle("AddressBook");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel lName = new JLabel("Name");
        JLabel lStreet = new JLabel("Street");
        JLabel lCity = new JLabel("City");
        JLabel lState = new JLabel("State");
        JLabel lZip = new JLabel("Zip");

        tfName = new JTextField(35);
        tfStreet = new JTextField(35);
        tfCity = new JTextField(20);
        tfState = new JTextField(4);
        tfZip = new JTextField(4);

        add = new JButton("Add");
        first = new JButton("First");
        next = new JButton("Next");
        previous = new JButton("Previous");
        last = new JButton("Last");
        update = new JButton("Update");

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(add);
        buttonPanel.add(first);
        buttonPanel.add(next);
        buttonPanel.add(previous);
        buttonPanel.add(last);
        buttonPanel.add(update);

        add.addActionListener(new AddAction());


        setLayout(new MigLayout());

        add(lName);
        add(tfName, "span 5, wrap");
        add(lStreet);
        add(tfStreet, "span 5, wrap");
        add(lCity);
        add(tfCity);
        add(lState);
        add(tfState);
        add(lZip);
        add(tfZip, "wrap");
        add(buttonPanel, "span 6");

        setLocationRelativeTo(this);
        setVisible(true);
        pack();
    }



    class AddAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                raf.seek(raf.length());

                raf.writeChars(tfName.getText());
                raf.writeChars(tfStreet.getText());
                raf.writeChars(tfCity.getText());
                raf.writeChars(tfState.getText());
                raf.writeChars(tfZip.getText());

            } catch (IOException ioe) {}
        }
    }

    class FirstAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddressBook view = new AddressBook();
        });
    }
}

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

    private long seek;

    public AddressBook() throws HeadlessException {

        try {
            raf = new RandomAccessFile("addressBook.dat", "rw");
            seek = 0;

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
        first.addActionListener(new FirstAction());
        last.addActionListener(new LastAction());
        next.addActionListener(new NextAction());
        previous.addActionListener(new PreviousAction());
        update.addActionListener(new UpdateAction());

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

        fillFields(0);


        setLocationRelativeTo(this);
        setVisible(true);
        pack();
    }

    private void fillFields(long seek) {

        try {
            raf.seek(seek);

            tfName.setText(raf.readUTF().trim());
            tfStreet.setText(raf.readUTF().trim());
            tfCity.setText(raf.readUTF().trim());
            tfState.setText(raf.readUTF());
            tfZip.setText(raf.readUTF());

        } catch (IOException ioe) {

        }
    }


    class AddAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                raf.seek(raf.length());

                Address address = new Address(tfName.getText(),
                        tfStreet.getText(),
                        tfCity.getText(),
                        tfState.getText(),
                        tfZip.getText());

                raf.writeUTF(address.getName());
                raf.writeUTF(address.getStreet());
                raf.writeUTF(address.getCity());
                raf.writeUTF(address.getState());
                raf.writeUTF(address.getZip());

//                System.out.println(raf.length());

            } catch (IOException ioe) {
            }
        }
    }

    class FirstAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            seek = 0;
            fillFields(seek);
        }
    }

    class LastAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                seek = (raf.length() > 0) ? raf.length() - 95 : 0;
                fillFields(seek);
            } catch (IOException ioe) {
            }
        }
    }

    class NextAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                seek = (seek + 95 <= raf.length()) ? seek + 95 : raf.length();
                fillFields(seek);
            } catch (IOException ioe) {
            }
        }
    }

    class PreviousAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            seek = (seek - 95 >= 0) ? seek - 95 : 0;
            fillFields(seek);
        }
    }

    class UpdateAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                raf.seek(seek);

                Address address = new Address(tfName.getText(),
                        tfStreet.getText(),
                        tfCity.getText(),
                        tfState.getText(),
                        tfZip.getText());

                raf.writeUTF(address.getName());
                raf.writeUTF(address.getStreet());
                raf.writeUTF(address.getCity());
                raf.writeUTF(address.getState());
                raf.writeUTF(address.getZip());
            }
            catch (IOException ioe) {

            }
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddressBook view = new AddressBook();
        });
    }
}

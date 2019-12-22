package check;

import javafx.beans.property.adapter.JavaBeanObjectProperty;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Fauzi on 04/11/2018.
 */
public class check {
    private JButton check;
    private JPanel panel1;

    public check() {
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"test");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =  new JFrame("check");
        frame.setContentPane(new check().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

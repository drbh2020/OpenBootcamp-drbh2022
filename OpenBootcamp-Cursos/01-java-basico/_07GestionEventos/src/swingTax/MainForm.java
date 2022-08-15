package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton buttonCalculate;
    private JPanel taxPanel;

//    public static ActionListener botonPulsado(ActionEvent e){
//        return actionPerformed(ActionEvent e) {
//
//        };
//    }

    public MainForm(){

        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double p = Double.parseDouble(pricePane.getText());
                    double t = Double.parseDouble(taxPane.getText());
                    double result = p + (p / 100 * t);
                    totalPane.setText(Double.toString(result));
                }
                catch(Exception ex){
                    System.out.println("Excepción: " );
                }






            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);


    }
}

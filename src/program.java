import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class program {
    public static void main(String[] args) {

       JFrame frame = new JFrame("Quantity Application");

       JLabel label = new JLabel("Quantity");
       JTextField textFilde = new JTextField();
       JButton buttonMais = new JButton("+");
       JButton buttonMenos = new JButton("-");
       frame.setLayout(new GridLayout(1,4));

       label.setHorizontalAlignment(JLabel.CENTER);
       textFilde.setHorizontalAlignment(JTextField.CENTER);
       frame.add(label);
       frame.add(textFilde);
       frame.add(buttonMais);
       frame.add(buttonMenos);

       frame.setSize(300, 100);
       frame.setVisible(true);

       int cont = 0;
       textFilde.setText(Integer.toString(cont));

       buttonMais.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               int cont = Integer.parseInt(textFilde.getText()) + 1;

               textFilde.setText(Integer.toString(cont));

           }
       });

       buttonMenos.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int cont = Integer.parseInt(textFilde.getText()) - 1;
               textFilde.setText(Integer.toString(cont));

           }
       });

    }


}

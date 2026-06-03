import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringOperations extends JFrame implements ActionListener {

    JTextField tf;
    JTextArea ta;

    JButton b1, b2, b3, b4, b5;

    StringOperations() {

        setTitle("String Operations");

        tf = new JTextField();

        ta = new JTextArea();

        b1 = new JButton("Length");
        b2 = new JButton("Uppercase");
        b3 = new JButton("Lowercase");
        b4 = new JButton("Reverse");
        b5 = new JButton("Palindrome");

        setLayout(new FlowLayout());

        add(tf);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        add(ta);

        tf.setPreferredSize(new Dimension(200, 30));
        ta.setPreferredSize(new Dimension(250, 100));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setSize(350, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String str = tf.getText();

        if(e.getSource() == b1) {
            ta.setText("Length = " + str.length());
        }

        else if(e.getSource() == b2) {
            ta.setText(str.toUpperCase());
        }

        else if(e.getSource() == b3) {
            ta.setText(str.toLowerCase());
        }

        else if(e.getSource() == b4) {

            String rev = "";

            for(int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            ta.setText(rev);
        }

        else if(e.getSource() == b5) {

            String rev = "";

            for(int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            if(str.equalsIgnoreCase(rev)) {
                ta.setText("Palindrome");
            }
            else {
                ta.setText("Not Palindrome");
            }
        }
    }

    public static void main(String args[]) {
        new StringOperations();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class wataheck extends JFrame {
    int a,b,c;
    String aa,bb;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b17,b18;
    JLabel l1,l2;
    JTextField t1;
    eHandler handler = new eHandler();
        public wataheck(String d){
            super(d);
            setLayout(new FlowLayout());
 
            l1 = new JLabel("Результат:");
            l2 = new JLabel("");
            t1 = new JTextField(10);
            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b10 = new JButton("+");
            b11 = new JButton("-");
            b12 = new JButton("*");
            b13 = new JButton("/");
            b14 = new JButton("+-");
            b15 = new JButton("0");
            b17 = new JButton("Очистить");
            b18 = new JButton("=");
            add(l2);
            add(l1);
            add(t1);
            add(b15);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b10);
            add(b11);
            add(b12);
            add(b13);
            add(b14);
            add(b17);
            add(b18);
            b1.addActionListener(handler);
            b2.addActionListener(handler);
            b3.addActionListener(handler);
            b4.addActionListener(handler);
            b5.addActionListener(handler);
            b6.addActionListener(handler);
            b7.addActionListener(handler);
            b8.addActionListener(handler);
            b9.addActionListener(handler);
            b10.addActionListener(handler);
            b11.addActionListener(handler);
            b12.addActionListener(handler);
            b13.addActionListener(handler);
            b14.addActionListener(handler);
            b15.addActionListener(handler);
            b17.addActionListener(handler);
            b18.addActionListener(handler);
        }
    public class eHandler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                {
                    try {
                        if (e.getSource() == b1) {
                            t1.setText(t1.getText() + "1");
                        }
                        if (e.getSource() == b2) {
                            t1.setText(t1.getText() + "2");
                        }
                        if (e.getSource() == b3) {
                            t1.setText(t1.getText() + "3");
                        }
                        if (e.getSource() == b4) {
                            t1.setText(t1.getText() + "4");
                        }
                        if (e.getSource() == b5) {
                            t1.setText(t1.getText() + "5");
                        }
                        if (e.getSource() == b6) {
                            t1.setText(t1.getText() + "6");
                        }
                        if (e.getSource() == b7) {
                            t1.setText(t1.getText() + "7");
                        }
                        if (e.getSource() == b8) {
                            t1.setText(t1.getText() + "8");
                        }
                        if (e.getSource() == b9) {
                            t1.setText(t1.getText() + "9");
                        }
                        if (e.getSource() == b15) {
                            t1.setText(t1.getText() + "0");
                        }
                        if (e.getSource() == b10) {
                            a = Integer.parseInt(t1.getText());
                            t1.setText("");
                            l2.setText("+");
                        }
                        if (e.getSource() == b18) {
                            if (l2.getText() == "+") {
                                b = Integer.parseInt(t1.getText());
                                c = a + b;
                                a = 0;
                                b = 0;
                                t1.setText("" + c);
                                l2.setText("");
                            }
                            if (l2.getText() == "-") {
                                b = Integer.parseInt(t1.getText());
                                c = a - b;
                                a = 0;
                                b = 0;
                                t1.setText("" + c);
                                l2.setText("");
                            }
                            if (l2.getText() == "*") {
                                b = Integer.parseInt(t1.getText());
                                c = a * b;
                                a = 0;
                                b = 0;
                                t1.setText("" + c);
                                l2.setText("");
                            }
                            if (l2.getText() == "/") {
                                b = Integer.parseInt(t1.getText());
                                c = a / b;
                                a = 0;
                                b = 0;
                                t1.setText("" + c);
                                l2.setText("");
                            }
                        }
                        if (e.getSource() == b11) {
                            a = Integer.parseInt(t1.getText());
                            t1.setText("");
                            l2.setText("-");
                        }
                        if (e.getSource() == b12) {
                            a = Integer.parseInt(t1.getText());
                            t1.setText("");
                            l2.setText("*");
                        }
                        if (e.getSource() == b13) {
                            a = Integer.parseInt(t1.getText());
                            t1.setText("");
                            l2.setText("/");
                        }
                        if (e.getSource() == b14) {
                            a = Integer.parseInt(t1.getText());
                            a = -a;
                            t1.setText("" + a);
                            l2.setText("+-");
                        }
                        if (e.getSource() == b17) {
                            a = 0;
                            b = 0;
                            c = 0;
                            l2.setText("");
                            t1.setText("");
                        }
                    }catch(Exception ex){ JOptionPane.showMessageDialog(null, "Ошибка! Попробуйте заново."); t1.setText(""); l2.setText(""); a=0;b=0;c=0;  }
                }
            }
    }
}
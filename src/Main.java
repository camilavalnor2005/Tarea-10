import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(50, 50, 100, 30);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 50, 150, 30);
        frame.add(textField1);

        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(50, 100, 100, 30);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 100, 150, 30);
        frame.add(textField2);

        JButton addButton = new JButton("Sumar");
        addButton.setBounds(50, 150, 80, 30);
        frame.add(addButton);

        JButton subtractButton = new JButton("Restar");
        subtractButton.setBounds(140, 150, 80, 30);
        frame.add(subtractButton);

        JButton multiplyButton = new JButton("Multiplicar");
        multiplyButton.setBounds(230, 150, 100, 30);
        frame.add(multiplyButton);

        JButton divideButton = new JButton("Dividir");
        divideButton.setBounds(340, 150, 80, 30);
        frame.add(divideButton);

        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(50, 200, 300, 30);
        frame.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = new Addition().calculate(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = new Subtraction().calculate(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = new Multiplication().calculate(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                double result = new Division().calculate(num1, num2);
                resultLabel.setText("Resultado: " + result);
            }
        });

        frame.setVisible(true);
    }
}

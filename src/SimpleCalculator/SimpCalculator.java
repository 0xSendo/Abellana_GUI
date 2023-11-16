package SimpleCalculator;

import javax.swing.*;

public class SimpCalculator extends JFrame {
    private JPanel Calc;
    private JTextField tfNum1;
    private JTextField tfNum2;
    private JComboBox cbOpt;
    private JButton btnCompute;
    private JLabel ResultVal;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpCalculator app = new SimpCalculator();
        app.setContentPane(app.Calc);
        app.setSize(800, 400 );
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
    public SimpCalculator() {
        btnCompute.addActionListener(e -> {
            try {
                String operation = (String) cbOpt.getSelectedItem();
                int number1 = Integer.parseInt(tfNum1.getText());
                int number2 = Integer.parseInt(tfNum2.getText());
                int result = 0;
                if (operation.equals("+")) {
                    result = number1 + number2;
                } else if (operation.equals("-")) {
                    result = number1 - number2;
                } else if (operation.equals("*")) {
                    result = number1 * number2;
                } else if (operation.equals("/")) {
                    result = number1 / number2;
                }
                lblResult.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        });
    }
}


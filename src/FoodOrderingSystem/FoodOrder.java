package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrder extends JFrame{
    private JPanel jpanel;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox noneCheckBox;
    private JCheckBox a5OffCheckBox;
    private JCheckBox a10OffCheckBox;
    private JCheckBox sundaeCheckBox;
    private JCheckBox a15OffCheckBox;
    private JButton orderButton;

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.jpanel);
        app.setSize(800, 400 );
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }


}

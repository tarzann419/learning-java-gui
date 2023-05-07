import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {


    JButton button;

    MyFrame(){


        button = new JButton();
        button.setBounds(200, 100, 200, 100);
        // using lambda statements
        button.addActionListener(e -> System.out.println("finally"));
        button.setText("first button");
        button.setFocusable(false); //to remove a border surrounding the button


        this.setTitle("New Frame");
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500, 500);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

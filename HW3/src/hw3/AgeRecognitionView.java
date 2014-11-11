/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class AgeRecognitionView extends JFrame {
    
    public AgeRecognitionView(){
        setLayout(new GridLayout(3,2,5,5));
        
        add(new JLabel("First Name"));
        add(new JTextField());
        add(new JLabel("Last name"));
        add(new JTextField());
        add(new JLabel("Age"));
        add(new JTextField());
        add(new JButton("Ok"));
        
    }
    
    public void createForm(AgeRecognition ar){
        AgeRecognitionView frame = new AgeRecognitionView();
        
        frame.setTitle("HW3: Age Recognition");
        frame.setSize(200, 125);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

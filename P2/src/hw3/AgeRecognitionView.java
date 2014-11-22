/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class AgeRecognitionView extends JFrame {
    private final JTextField jtfFirstName = new JTextField();
    private final JTextField jtfLastName = new JTextField();
    private final JTextField jtfAge = new JTextField();
    private final JButton jbtOk = new JButton("Submit");
    private final JLabel jblResponse = new JLabel("<html><br><br></html>");
    
    public AgeRecognitionView(String applicationTitle){
        
        JPanel inputPanel = new JPanel();
        JLabel jlbFname = new JLabel("First Name");
        jlbFname.setLabelFor(jtfFirstName);
        JLabel jlbLname = new JLabel("Last Name");
        jlbLname.setLabelFor(jtfLastName);
        JLabel jlbAge = new JLabel("Age");
        jlbAge.setLabelFor(jtfAge);
        jbtOk.setDefaultCapable(true);
        
        inputPanel.setLayout(new GridLayout(0,2,5,5));
        
        inputPanel.add(jlbFname);
        inputPanel.add(jtfFirstName);
        inputPanel.add(jlbLname);
        inputPanel.add(jtfLastName);
        inputPanel.add(jlbAge);
        inputPanel.add(jtfAge);
        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(jbtOk, BorderLayout.SOUTH);
        mainPanel.add(jblResponse, BorderLayout.CENTER);
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        
        add(mainPanel, BorderLayout.CENTER);
        getRootPane().setDefaultButton(jbtOk);
        setTitle(applicationTitle);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void updateActionListener(ActionListener al){
        jbtOk.addActionListener(al);
    }
    
    public void provideResponse(String response){
        jblResponse.setText("<html>" + response + "</html>");
    }
    
    public String getEnteredFname(){
        return jtfFirstName.getText();
    }

    public String getEnteredLname(){
        return jtfLastName.getText();
    } 
    
    public int getEnteredAge(){
        return Integer.parseInt(jtfAge.getText());
    } 
}


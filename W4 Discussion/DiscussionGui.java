/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Chris W Jones <chris@christopherjones.us>
 */
public class DiscussionGui extends JFrame{
    public DiscussionGui(){
        setLayout(new GridLayout(4,3));

        for (int i = 1; i <= 9; i++){
            add(new JButton(String.valueOf(i)));
        }

        add(new JButton ("*"));
        add(new JButton (String.valueOf(0)));
        add(new JButton ("#"));

} 

    public static void main(String[] args) {

        DiscussionGui frame = new DiscussionGui();
        frame.setTitle("Phone pad");
        frame.setSize(300,300);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }

}


package p2;

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
    private final JTextArea jtaResults = new JTextArea();
    private final JRadioButton jrdGenderMale = new JRadioButton("Male");
    private final JRadioButton jrdGenderFemale = new JRadioButton("Female");
    private final JButton jbtOk = new JButton("Submit");
    private final JComboBox jcbStates = new JComboBox(new String[]{
        "AK", "AL", "AR", "AZ", "CA",
        "CO", "CT", "DC", "DE", "FL",
        "GA", "HI", "IA", "ID", "IL", 
        "IN", "KS", "KY", "LA", "MA", 
        "MD", "ME", "MI", "MN", "MO", 
        "MS", "MT", "NC", "ND", "NE", 
        "NH", "NJ", "NM", "NV", "NY", 
        "OH", "OK", "OR", "PA", "RI", 
        "SC", "SD", "TN", "TX", "UT", 
        "VA", "VT", "WA", "WI", "WV", 
        "WY"
    });
    public AgeRecognitionView(String applicationTitle){
        
       /*
        * I've decided to split up the different inputs into two different 
        * panels based on which week they were required for.
        */
        
        // Inputs from HW3
        JPanel hw3InputPanel = new JPanel();
        hw3InputPanel.setLayout(new GridLayout(0,2,5,5));
        JLabel jlbFname = new JLabel("First Name");
        JLabel jlbLname = new JLabel("Last Name");
        JLabel jlbAge = new JLabel("Age");
        jlbFname.setLabelFor(jtfFirstName);       
        jlbLname.setLabelFor(jtfLastName);
        jlbAge.setLabelFor(jtfAge);        
        jbtOk.setDefaultCapable(true);

        hw3InputPanel.add(jlbFname);
        hw3InputPanel.add(jtfFirstName);
        hw3InputPanel.add(jlbLname);
        hw3InputPanel.add(jtfLastName);
        hw3InputPanel.add(jlbAge);
        hw3InputPanel.add(jtfAge);
        
        // Inputs for P2
        JPanel p2InputPanel = new JPanel();
        p2InputPanel.setLayout(new GridLayout(2,2));
        ButtonGroup group = new ButtonGroup();  // Seems like a good idea to group the radio buttons
        JLabel jlbStateOfBirth = new JLabel("State of Birth");
        jlbStateOfBirth.setLabelFor(jcbStates);
        group.add(jrdGenderFemale);
        group.add(jrdGenderMale);
        jrdGenderMale.setSelected(true);
        jtaResults.setEditable(false);
        
        p2InputPanel.add(jrdGenderFemale);
        p2InputPanel.add(jrdGenderMale);
        p2InputPanel.add(jlbStateOfBirth);
        p2InputPanel.add(jcbStates);
        
        
        // Overall panel for window
        JPanel mainPanel = new JPanel(new GridLayout(4,1));
        mainPanel.add(hw3InputPanel);
        mainPanel.add(p2InputPanel);
        mainPanel.add(jtaResults);        
        mainPanel.add(jbtOk);
        
        add(mainPanel, BorderLayout.CENTER);
        getRootPane().setDefaultButton(jbtOk);
        setTitle(applicationTitle);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void updateActionListener(ActionListener al){
        jbtOk.addActionListener(al);
    }
    
    public void provideResponse(String response){
        jtaResults.setText(response);
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
    
    public boolean getEnteredGender(){
        if (jrdGenderFemale.isSelected()) {
            return false;
        } else {
            return true;
        }
    }
    
    public String getStateOfBirth(){
        return (String) jcbStates.getSelectedItem();
    }
}

package finalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinalProjectView extends JFrame{
    private final JTextField jtfColorName = new JTextField();
    private final JTextField jtfHexCode = new JTextField();
    private final JButton jbtOk = new JButton("Submit");
    private final JPanel coloredPanel = new JPanel();
    private final JPanel colorLabelsPanel = new JPanel();
    private UserColors colorMap;
    private MouseListener ml;
    
    public FinalProjectView(String applicationTitle){
        
        jbtOk.setDefaultCapable(true);
        
        //Panel for adding new colors to the hash map
        JPanel addNewColorPanel = new JPanel();
        addNewColorPanel.setLayout(new GridLayout(1, 5));
        JLabel jlbColorName = new JLabel("Color's name: ");
        JLabel jlbColorHex = new JLabel("Color's hex: ");
        jlbColorName.setLabelFor(jtfColorName);
        jlbColorHex.setLabelFor(jtfHexCode);
        
        addNewColorPanel.add(jlbColorName);
        addNewColorPanel.add(jtfColorName);
        addNewColorPanel.add(jlbColorHex);
        addNewColorPanel.add(jtfHexCode);
        addNewColorPanel.add(jbtOk);
        
        //Add all the panels and set some defaults
        add(addNewColorPanel, BorderLayout.NORTH);
        add(colorLabelsPanel, BorderLayout.WEST);
        add(coloredPanel, BorderLayout.CENTER);
        getRootPane().setDefaultButton(jbtOk);
        setTitle(applicationTitle);
        setSize(425, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true); 
        
        // This is to catch when the user clicks on a label and update the
        // color of the panel to the color.
        ml = new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent me) {
                    JLabel l = (JLabel) me.getComponent();
                    String hexColor = l.getText().substring(l.getText().lastIndexOf("#"));
                    System.out.println(hexColor);
                    coloredPanel.setBackground(Color.decode(hexColor));
                }
                // Must be implemented due to interface but I don't need any
                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
                
            };
    }
    
    public void updateButtonActionListener(ActionListener al){
        jbtOk.addActionListener(al);       
    }
    
    public void updateMouseActionListener(MouseListener ml){
        colorLabelsPanel.addMouseListener(ml);
    }
    
    public String getEnteredColorName(){
        return jtfColorName.getText();
    }
    
    public String getEnteredColorHex(){
        return jtfHexCode.getText();
    }    

    public void generateColorLabels() {
        colorLabelsPanel.removeAll();
        colorLabelsPanel.setLayout(new GridLayout(colorMap.length(), 1));
        
        for(String colorNameAndHash: colorMap.all()){
            JLabel nextLabel = new JLabel(colorNameAndHash);
            nextLabel.addMouseListener(ml);
            colorLabelsPanel.add(nextLabel);
        }
        
        // Without this statement, the new panel and labels
        // weren't showing up.  Doing a this.pack() also fixes it.
        this.revalidate();
    }
    
    public void setColorMap(UserColors givenColorMap){
        colorMap = givenColorMap;
        generateColorLabels();
    }
}

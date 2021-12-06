package guitest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuiTest extends JFrame{
    private JLabel jLabelTitle;
    private JPanel jPanelContent;
    private JTextField jTextField;
    private JButton jButtonSetTextToLabel;
    public GuiTest() {
        initComponents();
        super.setLocationRelativeTo(null);

    }

    private void initComponents() {
        super.setPreferredSize(new Dimension(480, 290));
        super.setMaximumSize(new Dimension(480, 290));
        super.setMinimumSize(new Dimension(480, 290));
        //super.getContentPane().setLayout(new BorderLayout());
        
        jLabelTitle = new JLabel("capybara ty", SwingConstants.CENTER);
        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabelTitle.setPreferredSize(new Dimension(480,27));
        jLabelTitle.setMaximumSize(new Dimension(480,54));
        jLabelTitle.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //jLabelTitle.setAlignmentY(CENTER_ALIGNMENT);
        
        
//        JPanel panelTitle = new JPanel();
//        panelTitle.setPreferredSize(new Dimension(480,54));
//        panelTitle.setBorder(BorderFactory.createLineBorder(Color.BLUE));
//        panelTitle.setAlignmentY(CENTER_ALIGNMENT);
//        panelTitle.add(jLabelTitle, "push, align center");
                
        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 27));
        jTextField.setMaximumSize(jTextField.getPreferredSize());
        JPanel panelTextField = new JPanel();
        panelTextField.setPreferredSize(new Dimension(480,27));
        panelTextField.setMaximumSize(new Dimension(480,27));
        panelTextField.add(jTextField);
      
        jButtonSetTextToLabel = new JButton();
        jButtonSetTextToLabel.setText("Изменить текст в метке");
        jButtonSetTextToLabel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jLabelTitle.setText(jTextField.getText());
            }
        });
        JPanel panelButton = new JPanel();
        panelButton.setPreferredSize(new Dimension(480,27));
        panelButton.add(jButtonSetTextToLabel);
        jPanelContent = new JPanel();
        jPanelContent.setLayout(new BoxLayout(jPanelContent, BoxLayout.Y_AXIS));
        jPanelContent.add(jLabelTitle);
        jPanelContent.add(panelTextField);
        jPanelContent.add(panelButton);
        
        this.add(jPanelContent);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }    

    public static void main(String[] args) {
        System.out.println("capybara ty");
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTest().setVisible(true);
            }
        });
    }
    
}

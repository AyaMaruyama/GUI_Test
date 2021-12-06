package mycomponents;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CaptionComponent extends JPanel{
    private JLabel jLabelTitle;
    public CaptionComponent(String text, int widthPanel, int heightPanel){
        initComponents(text, widthPanel, heightPanel);
    }    

    private void initComponents(String text, int widthPanel, int heightPanel) {
        this.setPreferredSize(new Dimension(widthPanel, heightPanel));
        this.setPreferredSize(getPreferredSize());
        this.setPreferredSize(getPreferredSize());
        
        jLabelTitle = new JLabel(text);
        jLabelTitle.setPreferredSize(new Dimension(widthPanel, heightPanel));
        jLabelTitle.setPreferredSize(getPreferredSize());
        jLabelTitle.setPreferredSize(getPreferredSize());
        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);
        jLabelTitle.setFont(new Font("Tahoma", 1, 16));
        
        this.add(jLabelTitle);
    }

    public JLabel getjLabelTitle() {
        return jLabelTitle;
    }
}

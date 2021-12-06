package mycomponents;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBoxComponent extends JPanel{
    private JLabel jLabelTitle;
    private JComboBox jComboBox;
    
    public ComboBoxComponent(String text, int widthPanel, int heightPanel){
        initComponents(text, widthPanel, heightPanel);
    }

    private void initComponents(String text, int widthPanel, int heightPanel) {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(widthPanel, heightPanel));
        this.setMaximumSize(this.getPreferredSize());
        this.setMinimumSize(this.getPreferredSize());
        //this.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabelTitle = new JLabel(text);
        jLabelTitle.setPreferredSize(new Dimension(widthPanel/3,27));
        jLabelTitle.setMaximumSize(jLabelTitle.getPreferredSize());
        jLabelTitle.setMinimumSize(jLabelTitle.getPreferredSize());
        jLabelTitle.setHorizontalAlignment(JLabel.RIGHT);
        jComboBox = new JComboBox();
        this.add(jLabelTitle);
        this.add(jComboBox);
    }
}

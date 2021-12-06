package mycomponents;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditFieldComponent extends JPanel{
    private JLabel jLabelTitle;
    private JTextField jTextFieldEdit;
    public EditFieldComponent(String text, int widthPanel, int heightPanel, int widthEdit){
        initComponent(text, widthPanel, heightPanel, widthEdit);
    }
    private void initComponent(String text, int widthPanel, int heightPanel, int widthEdit){
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
        jTextFieldEdit = new JTextField();
        
        if(widthEdit == 0){
            jTextFieldEdit.setPreferredSize(new Dimension(((widthPanel-widthPanel/3)-40),27));
        }
        else{
            jTextFieldEdit.setPreferredSize(new Dimension(widthEdit,27));
        }
        jTextFieldEdit.setMaximumSize(jTextFieldEdit.getPreferredSize());
        jTextFieldEdit.setMinimumSize(jTextFieldEdit.getPreferredSize());
        
        this.add(jLabelTitle);
        this.add(jTextFieldEdit);
    }

    public JLabel getjLabelTitle() {
        return jLabelTitle;
    }

    public JTextField getjTextFieldEdit() {
        return jTextFieldEdit;
    }
}

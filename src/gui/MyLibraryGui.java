package gui;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mycomponents.CaptionComponent;
import mycomponents.ComboBoxComponent;
import mycomponents.EditFieldComponent;

public class MyLibraryGui extends JFrame{
    public MyLibraryGui() {
        initComponents();
        super.setLocationRelativeTo(null);

    }

    private void initComponents() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(640, 420));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JPanel captionPanel = new CaptionComponent("Добавление новой книги", this.getWidth(), 40);
        getContentPane().add(captionPanel);
        JPanel titlePanel = new EditFieldComponent("Название книги: ", this.getWidth(), 33, 250);
        getContentPane().add(titlePanel);
        JPanel publishedYearPanel = new EditFieldComponent("Год издания книги: ", this.getWidth(), 33, 70);
        getContentPane().add(publishedYearPanel);
        JPanel quantityPanel = new EditFieldComponent("Количество экземпляров: ", this.getWidth(), 33, 50);
        getContentPane().add(quantityPanel);
        JPanel comboBoxAuthors = new ComboBoxComponent("Авторы книги: ", this.getWidth(), this.getHeight());
        getContentPane().add(comboBoxAuthors);
    }
    public static void main(String[] args) {
        System.out.println("capybara ty");
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyLibraryGui().setVisible(true);
            }
        });
    }
}


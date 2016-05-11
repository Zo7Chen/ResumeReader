package ui;
import javax.swing.*;
import java.awt.*;

/**
 * Created by SilentLamb on 2016-5-8.
 */



public class MainForm extends JFrame {
    private int MainForm_width = 800;
    private int MainForm_height = 600;
    private CardLayout MyForm = new CardLayout();
    private JPanel Form1 = new JPanel();
    private JPanel Form2 = new JPanel();

    private JLabel welcome_page_msg1 = new JLabel("Username");
    private JLabel welcome_page_msg2 = new JLabel("Password");
    private JTextField input_username = new JTextField();
    private JTextField input_password = new JTextField();
    private JButton welcome_page_submit = new JButton("submit");
    //widget for welcome_page

    {
        Form1.setLayout(null);
        Form1.add(welcome_page_msg1);
        Form1.add(welcome_page_msg2);
        Form1.add(input_username);
        Form1.add(input_password);
        Form1.add(welcome_page_submit);


    }//add the widgets to Form1





    public MainForm(){
        super("ResumeReader");
        this.setSize(MainForm_width,MainForm_height);
        this.setLocationRelativeTo(null);
        this.setLayout(MyForm);
        this.add(Form1);
        this.add(Form2);
        this.setVisible(true);

    }
    public MainForm(int w,int h){
        super("ResumeReader");
        MainForm_width = w;
        MainForm_height = h;
        this.setSize(MainForm_width,MainForm_height);
        this.setLocationRelativeTo(null);
        this.setLayout(MyForm);
        this.add(Form1);
        this.add(Form2);
        this.setVisible(true);

    }

}

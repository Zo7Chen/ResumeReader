package ui;
import javax.swing.*;
import java.awt.*;

/**
 * Created by SilentLamb on 2016-5-8.
 */



public class MainForm extends JFrame {
    private int MainForm_width = 720;
    private int MainForm_height = 960;

    private JPanel Head_Panel = new JPanel();
    private JPanel Body_Panel = new JPanel();
    private JPanel Tail_Panel = new JPanel();
    //set size of three panel in MainForm
    {
        Head_Panel.setBackground(Color.BLACK);
        Head_Panel.setBounds(0,0,MainForm_width,70);
        Body_Panel.setBackground(Color.GRAY);
        Body_Panel.setBounds(0,0,MainForm_width,MainForm_height-70-60);
        Tail_Panel.setBackground(Color.GREEN);
        Tail_Panel.setBounds(0,0,MainForm_width,60);
    }


    public MainForm(){
        super("ResumeReader");
        this.setSize(MainForm_width, MainForm_height);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        //set Frame MainForm
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //set how to do when click button close

        this.add(Head_Panel);
        this.add(Body_Panel);
        this.add(Tail_Panel);
    }

}

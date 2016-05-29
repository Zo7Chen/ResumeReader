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
        Head_Panel.setBackground(Color.GREEN);
        Head_Panel.setBounds(0,0,MainForm_width,70);
        Body_Panel.setBackground(Color.GRAY);
        Body_Panel.setBounds(0,0,MainForm_width,MainForm_height-70-60);
        Tail_Panel.setBackground(Color.GREEN);
        Tail_Panel.setBounds(0,0,MainForm_width,60);
    }

    //widget in Head_Panel
    private JLabel Label_Search = new JLabel("查看");
    private JTextField TextField_Search = new JTextField(10);
    private JButton Button_Search = new JButton("确认");
    {
        Head_Panel.setLayout(new FlowLayout());
        Head_Panel.add(Label_Search);
        Label_Search.setFont(new Font("宋体",Font.PLAIN,36));
        Head_Panel.add(TextField_Search);
        TextField_Search.setFont(new Font("宋体",Font.PLAIN,36));
        Head_Panel.add(Button_Search);
        Button_Search.setFont(new Font("宋体",Font.PLAIN,36));
    }

    //widget in Body_Panel
    {

    }



    public MainForm(){
        super("ResumeReader");
        this.setSize(MainForm_width, MainForm_height);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        //set Frame MainForm
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //set how to do when click button close

        this.add(Head_Panel);
        this.add(Body_Panel);
        this.add(Tail_Panel);
    }

}

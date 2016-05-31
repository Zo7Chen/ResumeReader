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
        Body_Panel.setBounds(0,70,MainForm_width,785);
        Tail_Panel.setBackground(Color.GREEN);
        Tail_Panel.setBounds(0,70+785,MainForm_width,70);
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
    private JLabel Label_name = new JLabel("姓名");
    private JTextField TextField_name = new JTextField();
    private JLabel Label_sex = new JLabel("性别");
    private ButtonGroup ButtonGroup_sex = new ButtonGroup();
    private JRadioButton Sex_male = new JRadioButton("男",true);
    private JRadioButton Sex_female = new JRadioButton("女",false);
    private JLabel Label_NativePlace = new JLabel("籍贯");
    private JTextField TextField_NativePlace = new JTextField();
    private JLabel Label_BirthYear = new JLabel("出生年份");
    private JComboBox ComboBox_BirthYear = new JComboBox();
    private JLabel Label_GraduateSchool = new JLabel("毕业学校");
    private JTextField TextField_GraduateSchool = new JTextField();
    private PictureButton Photo = new PictureButton();
    {
        Body_Panel.setLayout(null);
        Body_Panel.add(Label_name);
        Body_Panel.add(TextField_name);
        Body_Panel.add(Label_sex);
        Body_Panel.add(Sex_male);
        Body_Panel.add(Sex_female);
        Body_Panel.add(Label_NativePlace);
        Body_Panel.add(TextField_NativePlace);
        Body_Panel.add(Label_BirthYear);
        Body_Panel.add(ComboBox_BirthYear);
        Body_Panel.add(Label_GraduateSchool);
        Body_Panel.add(TextField_GraduateSchool);
        Body_Panel.add(Photo);

        Label_name.setBounds(20,20,40,30);
        Label_name.setFont(new Font("宋体",Font.PLAIN,18));
        TextField_name.setBounds(60,20,80,30);
        TextField_name.setFont(new Font("宋体",Font.PLAIN,18));
        Label_sex.setBounds(160,20,40,30);
        Label_sex.setFont(new Font("宋体",Font.PLAIN,18));
        ButtonGroup_sex.add(Sex_male);
        ButtonGroup_sex.add(Sex_female);
        Sex_male.setBounds(200,20,50,30);
        Sex_male.setFont(new Font("宋体",Font.PLAIN,18));
        Sex_female.setBounds(250,20,50,30);
        Sex_female.setFont(new Font("宋体",Font.PLAIN,18));
        Label_NativePlace.setBounds(320,20,40,30);
        Label_NativePlace.setFont(new Font("宋体",Font.PLAIN,18));
        TextField_NativePlace.setBounds(360,20,80,30);
        TextField_NativePlace.setFont(new Font("宋体",Font.PLAIN,18));
        Label_BirthYear.setBounds(20,70,80,30);
        Label_BirthYear.setFont(new Font("宋体",Font.PLAIN,18));
        ComboBox_BirthYear.setBounds(100,70,80,30);
        ComboBox_BirthYear.setFont(new Font("宋体",Font.PLAIN,18));
        {
            int i = 1950;
            for ( ;i <= 2016;++i){
                ComboBox_BirthYear.addItem(i);
            }
        }
        Label_GraduateSchool.setBounds(200,70,80,30);
        Label_GraduateSchool.setFont(new Font("宋体",Font.PLAIN,18));
        TextField_GraduateSchool.setBounds(300,70,200,30);
        TextField_GraduateSchool.setFont(new Font("宋体",Font.PLAIN,18));
        {

        }

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

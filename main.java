import javax.swing.*;
import java.awt.*;
import java.io.*;
public class main extends JFrame{
    public static void main(String[] args) {
    //creats backgroud image object
    ImageIcon back_img =new ImageIcon("DD.jpg");

    //creats frame object
    JFrame frame=new JFrame("D&D");
    //creats img object
    ImageIcon img =new ImageIcon("DD.jpg");

    frame.setTitle("D&D Character Creator");
    frame.setSize(782,392);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);//ends program upon exit
    frame.setVisible(true);
    frame.setResizable(false);//fram can not be reshaped
    frame.setContentPane(new JLabel(back_img));//sets background image
    frame.setLayout(new GridBagLayout());
    //Code Starts here
    frame.getContentPane().add(new main_menu());
    frame.setVisible(true);
    }
}

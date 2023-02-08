//Domanic DeVivo Main
import javax.swing.*;
import java.awt.*;
public class main_menu extends JPanel{
    main_menu(){
        //create button objects
        JButton button1=new JButton("Create New Character ");
        JButton button2=new JButton("Import character ");
        JButton button3=new JButton("Exit");

        //settings for panel
        setSize(782,392);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        //add buttons to panel
        add(button1, gbc);
        add(button2, gbc);
        add(button3, gbc);

        //sets button sizes to equal each other
        button1.setMaximumSize(new Dimension(Integer.MAX_VALUE, button1.getMinimumSize().height));
        button2.setMaximumSize(new Dimension(Integer.MAX_VALUE, button1.getMinimumSize().height));
        button3.setMaximumSize(new Dimension(Integer.MAX_VALUE, button1.getMinimumSize().height));

        //add actions listeneers
        button1.addActionListener(e -> new Character_Creator());
        button2.addActionListener(e -> System.out.println("Button 2 hit"));
        button3.addActionListener(e -> System.exit(0));//ends the program 
        }
}

  
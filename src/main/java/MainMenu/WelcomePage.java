package MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage {
    private JButton DisplayWelcomeMsg;
    private JPanel PanelMain;
    private JLabel CaptionHead;
    public WelcomePage() {
        DisplayWelcomeMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("WelcomePage");
        frame.setContentPane(new WelcomePage().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

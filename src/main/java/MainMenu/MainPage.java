package MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    private JButton User;
    private JPanel PanelMain;
    private JLabel Title1;
    private JButton Course;
    private JButton CourseEnvironment;
    private JButton GradeBook;
    private JButton Exit;
    private JLabel Title2;

    public MainPage() {
        User.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("eLibCMS1");
        frame.setPreferredSize(new Dimension(800,400));
        frame.setContentPane(new MainPage().PanelMain);

/*      Graphics2D g2 = (Graphics2D) paint(Graphics g);
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        g2.draw(lin); */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vedeshkin on 14.05.2016.
 */
public class Application extends JFrame {
    private JTextField textField1;
    private JButton generateButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel mainPanel;

    public Application () {
        super("TechnicalMetalGenerator");
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Application.this, "Ooops",

                        "Under Development =(", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Application myApplication = new Application();
    }
}


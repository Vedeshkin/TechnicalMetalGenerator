import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vedeshkin on 14.05.2016.
 */
public class Application extends JFrame {
    private JButton generateButton;
    private JPanel mainPanel;
    private JTextArea tempOut;
    private JTextArea NoteOut;
    private JTextArea ScaleOut;
    private JTextArea TimeSignatureOut;

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
                tempOut.setText(String.valueOf((int)(Math.random()*100)));
            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Application myApplication = new Application();
    }
}


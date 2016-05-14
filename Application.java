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
        final MusicGenerator gen = new MusicGenerator();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempOut.setText(String.valueOf(gen.getTempo()));
                NoteOut.setText(gen.getNote());

            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Application myApplication = new Application();
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
    private JLabel History;
    private JComboBox history;
    private static Logger logger;
    private static FileHandler fh;

    public Application () {
        super("TechnicalMetalGenerator");
        setContentPane(mainPanel);
        System.setProperty("java.util.logging.SimpleFormatter.format","[%1$tc] %4$s:%5$s%n");
        try{
            fh = new FileHandler("MetalGeneratorLog.log");
            fh.setFormatter(new SimpleFormatter());
        }catch (IOException ex){}
        logger = Logger.getLogger(Application.class.getName());
        logger.addHandler(fh);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logger.info("Application has been  started");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MusicGenerator gen = new MusicGenerator();
                history.addItem(gen);
                tempOut.setText(String.valueOf(gen.getTempo()));
                NoteOut.setText(gen.getNote());
                TimeSignatureOut.setText(gen.getTimeSignature().toString());
                ScaleOut.setText(gen.getScale());

                logger.info(gen.toString());



            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Application myApplication = new Application();
    }
    public FileHandler getFileHanlder() {return fh;}
}


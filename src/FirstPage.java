import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FirstPage extends JFrame implements ActionListener, KeyListener {
    private JTextArea extraNotes1UseTextArea;
    private JPanel panel1;
    private JButton readyToStartButton;
    private boolean makeStop;

    public FirstPage(){
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel1);
        setTitle("My GUI");
        setSize(650, 400);
        setLocation(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        readyToStartButton.addActionListener(this);
        setVisible(true);
        makeStop = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        setVisible(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public boolean getStopped(){
        return makeStop;
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PopUp2 extends JFrame implements ActionListener, KeyListener {
    private JPanel panel1;
    private JButton okButton;

    public PopUp2(){
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel1);
        setTitle("Pop up");
        setSize(300, 150);
        setLocation(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        okButton.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton but = (JButton) source;
        if (but.getText().equals("Ok")){
            setVisible(false);
        }
    }
}

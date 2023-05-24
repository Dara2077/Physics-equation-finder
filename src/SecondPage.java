import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class SecondPage extends JFrame implements ActionListener, KeyListener {
    private JTextField textField1;
    private JButton submitButton;
    private JTextArea textArea1;
    private JPanel panel2;
    private JButton resetButton;
    private ArrayList<String> vars = new ArrayList<>();

    public SecondPage(){
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel2);
        setTitle("My GUI");
        setSize(600, 500);
        setLocation(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton but = (JButton) source;
        if (but.getText().equals("Next")){
            vars.add(textField1.getText());
            addEquations();
            textField1.setText("");
        }
        else{
            textArea1.setText("");
            vars.clear();
        }
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

    private void addEquations(){
        textArea1.setText("");
        Find find = new Find();
        ArrayList<String> equations = new ArrayList<String>();
        equations = find.applicableEquations(vars);
        for (int i = 0; i < equations.size(); i ++){
            int num = i + 1;
            textArea1.append(num + ". " + equations.get(i) + "\n");
        }
    }
}

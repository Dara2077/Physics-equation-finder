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
    private JTextArea textArea2;
    private JTextField numberToBeRemovedTextField;
    private JTextField textField2;
    private JButton removeButton;
    private JButton alpha;
    private JButton theta;
    private JButton torque;
    private JButton delta;
    private JButton angularV;
    private JButton pi;
    private ArrayList<String> vars = new ArrayList<>();
    private FirstPage pg;


    public SecondPage(){
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel2);
        setTitle("Physics Equation Finder");
        setSize(700, 350);
        setLocation(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        removeButton.addActionListener(this);
        alpha.addActionListener(this);
        theta.addActionListener(this);
        torque.addActionListener(this);
        delta.addActionListener(this);
        angularV.addActionListener(this);
        pi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton but = (JButton) source;
        if (but.getText().equals("Input")){
            if (!textField1.getText().equals("") && !textField1.getText().equals(" ")){
                if (!vars.contains(textField1.getText())){
                    vars.add(textField1.getText());
                    textArea2.setText("");
                    for (int i = 0; i < vars.size(); i ++ ){
                        int num = i + 1;
                        textArea2.append(num + ". " + vars.get(i) + "\n");
                    }
                    addEquations();
                }
                else{
                    PopUp2 pop = new PopUp2();
                }
                textField1.setText("");
            }
        }
        else if (but.getText().equals("Remove")){
            int num = Integer.parseInt(textField2.getText());
            textField2.setText("");
            vars.remove(num -1);
            textArea2.setText("");
            for (int i = 0; i < vars.size(); i ++ ){
                int num1 = i + 1;
                textArea2.append(num1 + ". " + vars.get(i) + "\n");
            }
            addEquations();
        }
        else if (but.getText().equals("⍺")){
            textField1.setText("⍺");
        }
        else if (but.getText().equals("θ")){
            textField1.setText("θ");
        }
        else if (but.getText().equals("\uD835\uDF0F")){
            textField1.setText("\uD835\uDF0F");
        }
        else if (but.getText().equals("Δ")){
            textField1.setText("Δ");
        }
        else if (but.getText().equals("⍵")){
            textField1.setText("⍵");
        }
        else if (but.getText().equals("\uD835\uDF0B")){
            textField1.setText("\uD835\uDF0B");
        }
        else{
            textArea1.setText("");
            textArea2.setText("");
            vars.clear();
            VarsCleared clear = new VarsCleared();
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
        if (vars.size() != 0){
            equations = find.applicableEquations(vars);
            for (int i = 0; i < equations.size(); i ++){
                int num = i + 1;
                textArea1.append(num + ". " + equations.get(i) + "\n");
            }
        }
    }
}

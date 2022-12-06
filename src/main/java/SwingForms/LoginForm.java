package SwingForms;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
   public JTextField userNameTextField;
    public JPanel myPanel;
    public JLabel UserName;
    public JButton mainButton;
    private JTextField textField1;
    private JTextField textField2;


    public LoginForm() throws HeadlessException {
        userNameTextField.setText("Iveskite username");

        mainButton.addActionListener(action -> {

            //cia galiu  daryti beet kokia logika, ciklai if tir pan

            JOptionPane.showConfirmDialog(mainButton,"Labas" + userNameTextField.getText());
        });
    }



}

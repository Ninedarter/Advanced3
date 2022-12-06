package SwingForms;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setTitle("Mano pirma forma!");
        loginForm.setVisible(true);
        loginForm.setSize(300,400);
        loginForm.setContentPane(loginForm.myPanel);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

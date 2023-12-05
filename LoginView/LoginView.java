package book.system.login;

import javax.swing.*;
import java.awt.*;

public class LoginView{
	private JLabel label;
	private JLabel usernameLabel;
	private JLabel passwordLabel;

	private JTextField usernameTextField;
	private JPasswordField passwordField;

	private JButton loginButton;
	private JButton registerButton;

    private JCheckBox checkBox;

	private JPanel mainPanel;
	private JPanel panel;

	public LoginView(){
 
     panel = new JPanel(null) {
    @Override
    protected void paintComponent(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    int panelHeight = getHeight();

    // Define the gradient paint
    GradientPaint gradientPaint = new GradientPaint(
    0, 0, new Color(0, 0, 128), // Dark Violet color
    0, panelHeight, new Color(153, 0, 153) // Light Violet color
    );

    g2d.setPaint(gradientPaint);

    // Fill the entire panel with the gradient paint
    g2d.fillRect(0, 0, getWidth(), panelHeight);
        }
    };

    label = new JLabel("LOG IN") {{
    setFont(new Font("Arial", Font.BOLD, 35));
    setBounds(130, 50, 250, 35);
    setForeground(Color.white);
    }};

    usernameLabel = new JLabel("Username") {{
    setFont(new Font("Arial", Font.PLAIN, 15));
    setBounds(55, 130, 250, 15);
    setForeground(Color.white);
    }};

    usernameTextField = new JTextField() {{
    setBounds(55, 145, 270, 30);
    }};

    passwordLabel = new JLabel("Password") {{
    setFont(new Font("Arial", Font.PLAIN, 15));
    setBounds(55, 200, 250, 15);
    setForeground(Color.white);
    }};

    passwordField = new JPasswordField() {{
    setBounds(55, 215, 270, 30);
    }};

    checkBox = new JCheckBox("Remember me"){{
    setBounds(55, 250, 270, 30);
    setForeground(Color.white);
    setOpaque(false);
    setFocusable(false);
    }};

    loginButton = new JButton("Login") {{
    setBounds(55, 320, 270, 30);
    }};

    registerButton = new JButton("Register") {{
    setBounds(55, 370, 270, 30);
    }};

     panel.add(label);
     panel.add(usernameLabel);
     panel.add(usernameTextField);
     panel.add(passwordLabel);
     panel.add(passwordField);
     panel.add(checkBox);
     panel.add(loginButton);
     panel.add(registerButton);


	}

    public JPanel getPanel(){
        return panel;
    }

	public static void main(String args[]){

        LoginView view  = new LoginView();

        JFrame frame = new JFrame();
        frame.setSize(400, 600);
        frame.add(view.getPanel());
        frame.setVisible(true);
    }
}
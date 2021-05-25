import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

class logingui implements ActionListener{
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel successtext;
    public static void main(String[] args) {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200); //updated bigger size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        
        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new logingui());
        panel.add(button);

        successtext = new JLabel("");
        successtext.setBounds(10,110,300,25);
        panel.add(successtext);

        frame.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        if (user.equals("Jason") && password.equals("123")) {
            successtext.setText("Login successful");
        }
    }
}
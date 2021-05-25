import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
class logingui {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);
        
        JTextField userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        frame.setVisible(true);
        
    }
}
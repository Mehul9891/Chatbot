import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBotController extends JFrame {

    private  JTextField textField = new JTextField();
    private JTextArea textArea = new JTextArea();


    public ChatBotController(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.setResizable(true);
        this.setLayout(null);
        this.setTitle("Java AI");


        textField.setLocation(2,540);
        textField.setSize(590,30);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textArea.append(text+"\n");
                if(text.contains("hi")){
                    botSay("Hello there !!!");
                }
                textField.setText("");
            }
        });

        textArea.setLocation(20, 5);
        textArea.setSize(540, 510);

        this.add(textField);
        this.add(textArea);
    }

    public static void main(String args[]){
        new ChatBotController();
    }

    public void botSay(String message){
        textArea.append("AI :" + message + "\n");
    }
}

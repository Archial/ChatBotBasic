



package chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class ChatBot extends JFrame {

private JTextArea chatArea = new JTextArea();
private JTextField chatField = new JTextField();
    
    public ChatBot(){
    
 JFrame frame = new JFrame();

 
 frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 frame.setSize(550, 400);
 frame.setVisible(true);
 frame.setResizable(true);
 frame.setLayout(null);
 frame.setTitle("Chat Bot Example");
 frame.add(chatArea);
 frame.add(chatField);
 
 
 
 
 //for text area
 String areaName = "Area";
 chatArea.setSize(500, 200); // W x L
 chatArea.setLocation(15, 2); 
 chatArea.setName(areaName);
 chatArea.setEditable(false);
 
 //for text field
 String fieldName = "Field";
 chatField.setSize(500, 30); // W X L
 chatField.setLocation(15, 300);
 chatField.setName(fieldName);
 
 //Action Listener
 chatField.addActionListener(new ActionListener(){

     @Override
     public void actionPerformed(ActionEvent e) {
    
        String gText = chatField.getText();
        chatArea.append("User: " + gText + "\n");
        chatField.setText("");
     
        if (gText.contains("Hello")){
        
        chat("Hi!");
       
        
        } else {
        
        chat ("No compendre homes. I only know one word.");
        
        
        }
        
 
     }
 
 
 });
 
 
    }//End constructor
    
    private void chat (String string){
    
    chatArea.append("Pookie 1.0: " + string + "\n");
    
    }
 
    public static void main(String[] args) {
       
       new ChatBot();
        
        
    }
    
}

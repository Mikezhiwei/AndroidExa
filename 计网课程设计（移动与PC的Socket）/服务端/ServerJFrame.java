package MyServer;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ServerJFrame extends JFrame{

	  
	 private  JButton servebtn;
	 public  JTextArea ta;
	 private JButton  sendbtn;
	 private ServerHead server=null;
	 private JTextField mytext=null;
	 public ServerJFrame ()
	 {
		    this.setLayout(new FlowLayout());
		    this.mytext=new  JTextField(15);
		    this.servebtn=new JButton("开启服务");
	        this.sendbtn=new JButton("发送");
		    ta=new JTextArea("",10,30);
		    this.getContentPane().add(servebtn);
		    this.getContentPane().add(ta);
		    this.getContentPane().add(mytext);
		    this.getContentPane().add(sendbtn);
		    this.setSize(650, 400);
		    this.setTitle("pc端服务器");
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	        this.servebtn.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0) {
					  server=new ServerHead(70,ServerJFrame.this);
					  server.start();
					  servebtn.setEnabled(false);
				}
	        });
	        this.sendbtn.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
				       String temp=mytext.getText();
                       ta.append("服务器"+temp+"\n");
                       mytext.setText("");
                       server.sendtoclient(temp);
                    }
	        });
	        
	         
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new ServerJFrame();
	} 
	

}

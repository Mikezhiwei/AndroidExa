package MyServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.imageio.IIOException;
public class MyServer extends Thread {

	    private  ServerSocket myserver;
	    private  Socket  serverforclient;
	    private  BufferedReader theinput;
	    private  PrintStream  theoutput;
	    private int num;
	    private String readin;
	    private ServerJFrame myframe;
	    public MyServer(Socket client,int num)
	    {
	    	   this.serverforclient=client;//�õ���ͻ��˵ĵ�Socket
	    	   this.num=num;
	    }
	    public MyServer(Socket client,int num,ServerJFrame myFrame)
	    {
	    	   this.serverforclient=client;//�õ���ͻ��˵ĵ�Socket
	    	   this.num=num;
	    	   this.myframe=myFrame;
	    }
	    public void run()
       {   
    	  try{ 
    		   this.theinput=new BufferedReader(new InputStreamReader(this.serverforclient.getInputStream()));
               this.theoutput=new PrintStream(this.serverforclient.getOutputStream());
               //������ͻ��˵�I/O��
               while(true)
               {
            	   this.readin=theinput.readLine();//��������
            	   if(readin==null){
            		   //this.myframe.ta.append("���"+num+"���ͻ������ӶϿ�");
            		   this.serverforclient.close();
            		   this.theoutput.flush();
            		   this.theoutput.close();
            		   this.theinput.close();
            		   break;
            	   }else if(readin.equals("")){
            		   theoutput.println("Why you say nothing to me");
            	   }
            	  this.myframe.ta.append("��"+num+"���ͻ���˵"+readin+"\n");
            	  //theoutput.println("What I can help you");
               }                
           }catch(SocketException e){
        	   this.myframe.ta.append("�͵�"+num+"���ͻ������ӶϿ�");
    		   try{ 
    			 this.serverforclient.close();
    		     this.theinput.close();
    		     this.theoutput.flush();
    		     this.theoutput.close();
    		 }catch(IOException er){
    			 er.printStackTrace();
    		 }
    	  }catch(IOException err){
    		  err.printStackTrace();
    	  }
    }
	    public void sendtoClient(String message)
	    {
	    	  this.theoutput.println(message);
	    }
    
    
}

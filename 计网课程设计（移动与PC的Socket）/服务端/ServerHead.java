package MyServer;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServerHead extends Thread {

	
	private MyServer servers[];
	private Socket  client[];
	private  ServerSocket server;
	private int length;
	private int port=7070;
	private ServerJFrame myframe;
	public static void main(String[] args) {
		  new ServerHead(20).start();
	}
	public ServerHead(int max,ServerJFrame myFrame)
	{
		     this.servers=new MyServer[max];//采用动态数组的数据结构
		     this.client=new Socket[max];
		     this.myframe=myFrame;
	}
	public ServerHead(int max)
	{
		     this.servers=new MyServer[max];//采用动态数组的数据结构
		     this.client=new Socket[max];
	}
	public void run()
	{ 
		      int k=0;
		      try {
				this.server=new ServerSocket(this.port,-1,InetAddress.getLocalHost());//开启服务
			    this.myframe.ta.append("Server is starting\n");
			    while(true)
			    {
			    	     client[k]=server.accept();//阻塞方法
			    	     servers[k]=new MyServer(client[k],k+1,this.myframe);
			    	     this.myframe.ta.append("第"+(1+k)+"个用户已经连接上"+"\n");
			    	     servers[k].start();//建立子线程
			    	     k++;
			    	     this.length=k;
			    	     if(k+1==servers.length)
			    	     {
			    	    	   break;
			    	     }
			    	     else
			    	     {
			    	     }
			    }
			    System.out.println("客户机已经满了");
			} catch (SocketException e) {
				    e.printStackTrace();
			} catch (IOException e) {
				    e.printStackTrace();
			}
	  }
	  public void sendtoclient(String message)
	  {
		     for(int i=0;i<this.length;i++)
		     {
		    	 this.servers[i].sendtoClient(message);
		     }
	  }
	

}

package FTP_Java;

import java.io.*;
import java.net.*;




public class FTP {
    public void server()throws Exception{
        try{  
            ServerSocket ss=new ServerSocket(6666);  
            Socket s=ss.accept();  
            DataInputStream dis=new DataInputStream(s.getInputStream());  
            String  str=(String)dis.readUTF();  
            System.out.println("message= "+str);  
            ss.close();  
            }
            catch(Exception e){
                System.out.println(e);
            }  
            }

    public void client()throws Exception{
        try{      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            dout.writeUTF("Hello Server");  
            dout.flush();  
            dout.close();  
            s.close();  
            }
        catch(Exception e){
                System.out.println(e);
            } 
    }
}

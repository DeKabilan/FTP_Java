package FTP_Java;

import java.io.*;
import java.net.*;
import java.util.*;




public class FTP {
    Scanner sc = new Scanner(System.in);
    public void server()throws Exception{
        try{
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            for ( InterfaceAddress interfaceAddress : networkInterfaceEnumeration.nextElement().getInterfaceAddresses())
                if ( interfaceAddress.getAddress().isSiteLocalAddress())
                    System.out.println("IP: "+interfaceAddress.getAddress().getHostAddress());

            String host = InetAddress.getLocalHost().getHostAddress();
            ServerSocket ss=new ServerSocket(6666);  
            Socket s=ss.accept();  
            DataInputStream dis=new DataInputStream(s.getInputStream());  
            String  str=(String)dis.readUTF();  
            System.out.println("Message = "+str);  
            ss.close();  
            }
            catch(Exception e){
                System.out.println(e);
            }  
            }
            
            public void client()throws Exception{
                try{
                    System.out.println("What is the IP of the Server: ");     
                    String host = sc.next();
                    Socket s=new Socket(host,6666);  
                    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                    System.out.println("Enter the Message: ");
                    dout.writeUTF(sc.next());
                    dout.flush();  
                    dout.close();  
                    s.close();  
            }
        catch(Exception e){
                System.out.println(e);
            } 
    }
}

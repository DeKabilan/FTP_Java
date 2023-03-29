package FTP_Java;

import java.io.*;
import java.net.*;
import java.util.*;




public class FTP {
    Scanner sc = new Scanner(System.in);
    public void server(){
        try{
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            for ( InterfaceAddress interfaceAddress : networkInterfaceEnumeration.nextElement().getInterfaceAddresses())
                if ( interfaceAddress.getAddress().isSiteLocalAddress())
                    System.out.println("IP: "+interfaceAddress.getAddress().getHostAddress());

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
            
            public void client(){
                try{
                    System.out.println("What is the IP of the Server: ");     
                    String host = sc.next();
                    Socket s=new Socket(host,6666);  
                    System.out.println("Enter the File Path");
                    File file = new File(sc.next());
                    FileInputStream fis = new FileInputStream(file);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    OutputStream os= s.getOutputStream();
                    //Store Contents in an Array
                    byte[] contents;
                    long fileLength = file.length();
                    long current = 0;
                    s.close();
                    ss.close();  
            }
        catch(Exception e){
                System.out.println(e);
            } 
    }
}

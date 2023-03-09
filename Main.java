package FTP_Java;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args )throws Exception{
        FTP ftp = new FTP();
        ftp.server();
    }
}

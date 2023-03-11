package FTP_Java;
import java.util.*;

public class Main {
    public static void main(String[] args )throws Exception{
        Scanner sc = new Scanner(System.in);
        FTP ftp = new FTP();
        System.out.println("1. Server, 2.Client");
        int choice;
        choice=sc.nextInt();
        if (choice==1){
                ftp.server();
        }
        if (choice==2){
                ftp.client();
        }
        sc.close();
    }
}

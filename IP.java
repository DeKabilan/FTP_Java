import java.net.*;
import java.util.*;

public class IP {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
                for ( InterfaceAddress interfaceAddress : networkInterfaceEnumeration.nextElement().getInterfaceAddresses())
                    if ( interfaceAddress.getAddress().isSiteLocalAddress())
                        System.out.println(interfaceAddress.getAddress().getHostAddress());
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
}

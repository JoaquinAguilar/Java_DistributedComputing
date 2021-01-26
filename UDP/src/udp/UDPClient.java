package udp;

import java.net.*;
import java.io.*;

public class UDPClient{
    public static void main(String args[]){
        String h="Hello";
        
        try {
            DatagramSocket aSocket = new DatagramSocket();
            byte [] m = h.getBytes();
            InetAddress aHost = InetAddress.getByName("192.168.43.134");
            int serverPort = 6789;
            DatagramPacket request = new DatagramPacket(m, h.length(), aHost, serverPort);
            aSocket.send(request);
            byte[] buffer = new byte[1000];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);
            System.out.println("Reply: " + new String(reply.getData()));
            aSocket.close();
        }catch (SocketException e){System.out.println("Socket: " + e.getMessage());
        }catch (IOException e){System.out.println("IO: " + e.getMessage());}
    }
}
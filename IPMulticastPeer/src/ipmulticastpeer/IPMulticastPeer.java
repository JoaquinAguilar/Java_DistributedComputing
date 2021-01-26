package ipmulticastpeer;

import java.net.*;
import java.io.*;

public class IPMulticastPeer{
public static void main(String args[]){
    String h = "Gatitos voladores";
        try{
            InetAddress group = InetAddress.getByName("228.5.6.7");
            MulticastSocket s = new MulticastSocket(6789);
            s.joinGroup(group);
            byte[] m = h.getBytes();
            DatagramPacket messageOut
                    = new DatagramPacket(m, m.length, group, 6789);
            s.send(messageOut);
// get messages from others in group
            byte[] buffer = new byte[1000];
            for (int i = 0; i < 3; i++) {
                DatagramPacket messageIn
                        = new DatagramPacket(buffer, buffer.length);
                s.receive(messageIn);
                System.out.println("Received:" + new String(messageIn.getData()));
            }
            s.leaveGroup(group);
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
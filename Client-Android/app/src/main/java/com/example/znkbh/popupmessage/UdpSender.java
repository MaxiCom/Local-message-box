package com.example.znkbh.popupmessage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSender {
    static DatagramSocket clientSocket;
    static DatagramPacket packet;
    static InetAddress HOST;
    static int PORT = 51515;

    public static void sendMessage(String message) {
        try {
            clientSocket = new DatagramSocket();
            clientSocket.setBroadcast(true);
            HOST = InetAddress.getByName("192.168.1.255");
            packet = new DatagramPacket(message.getBytes(), message.getBytes().length, HOST, PORT);
            
            clientSocket.send(packet);
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

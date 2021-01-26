/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyservidortcp;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Juan
 */
public class ClienteSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket s = new Socket("localhost", 6000);
        ConexionTCP c = new ConexionTCP(s);
        c.enviar("23 83");
        String r = c.recibir();
        System.out.println("Resultado " + r);
        c.close();
    }
    
}

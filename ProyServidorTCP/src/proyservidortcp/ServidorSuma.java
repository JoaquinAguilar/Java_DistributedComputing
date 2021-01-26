/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyservidortcp;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Juan
 */
public class ServidorSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(6000);
        ConexionTCP c = new ConexionTCP(ss.accept());
        String r = c.recibir();
        String [] datos = r.split(" ");
        int a = Integer.parseInt(datos[0]);
        int b = Integer.parseInt(datos[1]);
        int suma = a + b;
        String sSuma = "" + suma;
        c.enviar(sSuma);
        c.close();
    }
    
}

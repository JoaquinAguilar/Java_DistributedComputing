/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiontcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Propietario
 */
public class ConexionTCP {

   private Socket s;
   private PrintWriter salida;
   private BufferedReader entrada;

    public ConexionTCP(Socket s) throws IOException {
        this.s = s;
        salida = new PrintWriter(s.getOutputStream(), true);
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    public void enviar(String s) {
        salida.println(s);
    }

    public String recibir() throws IOException {
        return entrada.readLine();
    }

    public void close() throws IOException {
        entrada.close();
        salida.close();
        s.close();
    }
}

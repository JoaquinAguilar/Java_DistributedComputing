package conexiontcp;

import java.io.IOException;
import java.net.ServerSocket;

public class ServidorSuma {

    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(6000);
        ConexionTCP c = new ConexionTCP(ss.accept()); //recibe el puerto del socket
        String r = c.recibir();
        String[] datos = r.split(" ");
        int a = Integer.parseInt(datos[0]);
        int b = Integer.parseInt(datos[1]);
        int suma = a+b;
        String sSuma = ""+suma;
        c.enviar(sSuma);
        c.close();
        
    }
    
}

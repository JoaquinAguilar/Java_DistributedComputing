package conexiontcp;

import java.io.IOException;
import java.net.Socket;

public class ClienteSuma {

    public static void main(String[] args) throws IOException {
        
        Socket s=new Socket("localhost",6000);
        ConexionTCP ctcp = new ConexionTCP(s);
        ctcp.enviar("3 5");
        String r=ctcp.recibir();
        System.out.println("Resultado: "+r);
        ctcp.close();
    }
    
}

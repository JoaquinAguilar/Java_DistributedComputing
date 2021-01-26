package proyectostd;

public class ProyectoStd {

    public static void main(String[] args) {
    GraphicManager gm = new GraphicManager(320,320);
    
    for(int i=10;i<100;i+=10){
        gm.DibujaCirculo(0, 0, i);
        }
    }
    
}

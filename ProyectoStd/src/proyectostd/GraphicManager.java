package proyectostd;

public class GraphicManager {
    public GraphicManager(){
        StdDraw.setCanvasSize(640,480);
        StdDraw.setXscale(-320, 320);
        StdDraw.setYscale(-240, 240);
    }
    
    public GraphicManager(int ancho, int alto){
        StdDraw.setCanvasSize(ancho, alto);
        StdDraw.setXscale(-ancho/2, ancho/2);
        StdDraw.setYscale(-alto/2, alto/2);
    }
    public void DibujaCirculo(double x, double y, double r){
        StdDraw.circle(x, y, r);
    }
}

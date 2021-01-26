package pso;

import java.text.DecimalFormat;
import java.util.Random;

public class PSO {

    public static void main(String[] args) {
        int var = 2;
        int ind = 5;
        int gen = 100;
        double matriz[][] = new double[ind][var];
        Random rand = new Random();
        int r = rand.nextInt(ind);
        DecimalFormat form = new DecimalFormat("0.00");
        double fx[] = new double[ind];
        double gbest = Double.POSITIVE_INFINITY;
        double pbest[] = new double [3];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (y < matriz[x].length - 1) {
                    matriz[x][y] = rand.nextDouble() * 10;
                    System.out.print(form.format(matriz[x][y]) + "\t");
                } else {
                    matriz[x][y] = rand.nextDouble() * 10;
                    System.out.println(form.format(matriz[x][y]));
                }
            }
        } // <-
        
        for (int x = 0; x <= matriz[x].length-1; x++) {
            fx[x] = (Math.sqrt((Math.pow(matriz[0][x], 2)) + 
                    (Math.pow(1.2, 2))) / 2) + 
                    (Math.sqrt((Math.pow(matriz[x][1], 2)) + 
                    (Math.pow(2.5, 2))) / 4) + 
                    (4.3 - (matriz[0][x] + matriz[x][1])) / 6;
                if(fx[x] < gbest){
                gbest = fx[x];
                }
        }
        System.out.println();
        System.out.println("El mejor es: "+form.format(gbest));
        
        for (int i = 0; i < gen; i++) {
            
        }

    }

}

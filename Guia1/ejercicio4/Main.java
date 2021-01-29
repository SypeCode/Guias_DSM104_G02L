import java.util.Scanner;

class Main {
    private Scanner teclado;
    private int[] x;
    private int[] y;
    private int cantidad;

    public void cargar() {
        teclado=new Scanner(System.in);

        System.out.print("Ingrese la cantidad de coordenadas que desea digitar: ");
        cantidad=teclado.nextInt();

        x = new int[cantidad];
        y = new int[cantidad];

        for(int f=0;f<cantidad;f++) {

            System.out.print("Ingrese el valor de x de la coordenada numero " + (f+1) + " : ");
            x[f]=teclado.nextInt();
            System.out.print("Ingrese el valor de y de la coordenada numero " + (f+1) + " : ");
            y[f]=teclado.nextInt();
        }
    }

    public void cuadrante() {
      int cuad1=0, cuad2=0, cuad3=0, cuad4=0, eje=0;        
        for(int f=0;f<cantidad;f++) {
            if (x[f] > 0 && y[f] > 0) {
              cuad1++;
            } else if (x[f] < 0 && y[f] > 0) {
              cuad2++;
            } else if (x[f] < 0 && y[f] < 0) {
              cuad3++;
            } else if (x[f] > 0 && y[f] < 0) {
              cuad4++;
            } else {
              eje++;
            }
        }

        System.out.println("Cantidad de coordenadas en el primer cuadrante: " + cuad1 );
        System.out.println("Cantidad de coordenadas en el segundo cuadrante: " + cuad2 );
        System.out.println("Cantidad de coordenadas en el tercer cuadrante: " + cuad3 );
        System.out.println("Cantidad de coordenadas en el cuarto cuadrante: " + cuad4 );
        System.out.println("Cantidad de coordenadas en el sobre un eje: " + eje );
    }

    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.cuadrante();
    }
}
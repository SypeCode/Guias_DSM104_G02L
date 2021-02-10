import java.util.Scanner;

class Main {
    private Scanner teclado;
    private int[] num;
    private int cantidad;

    public void cargar() {
        teclado=new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros que desea digitar: ");
        cantidad=teclado.nextInt();

        num=new int[cantidad];

        for(int f=0;f<num.length;f++) {

            System.out.print("Ingrese el numero " + (f+1) + " : ");
            num[f]=teclado.nextInt();
        }
    }

    public void numParImpar() {
      int contPar=0, contImpar=0;        
        for(int f=0;f<num.length;f++) {
            if (num[f]%2 == 0) {
              contPar++;
            } else {
              contImpar++;
            }
        }
        System.out.println("Numeros pares: " + contPar);
        System.out.println("Numeros impares: " + contImpar);
    }

    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.numParImpar();
    }
}
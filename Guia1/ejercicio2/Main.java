import java.util.Scanner;

class Main {
    private Scanner teclado;
    private int[] notas;

    public void cargar() {
        teclado=new Scanner(System.in);

        notas=new int[10];

        for(int f=0;f<notas.length;f++) {

            System.out.print("Ingrese la nota numero " + (f+1) + " : ");
            notas[f]=teclado.nextInt();
        }
    }

    public void mayorA10() {
      int contMayor=0, contMenor=0;        
        for(int f=0;f<notas.length;f++) {
            if (notas[f]>=7) {
              contMayor++;
            } else {
              contMenor++;
            }
        }
        System.out.println("Alumnos con nota mayor o igual a 7: " + contMayor);
        System.out.println("Alumnos con nota menores a 7: " + contMenor);
    }

    public static void main(String[] ar) {
        Main pv=new Main();
        pv.cargar();
        pv.mayorA10();
    }
}
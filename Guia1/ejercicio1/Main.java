  import java.util.*;

  class Main {

    public static void main(String[] ar) {

      Scanner teclado = new Scanner(System.in);
      int num1, num2, module1, module2;

      System.out.print("Ingrese el primer numero: ");
      num1 = teclado.nextInt();

      System.out.print("Ingrese el segundo numero: ");
      num2 = teclado.nextInt();

      module1 = num1 % num2;
      module2 = num2 % num1;

      if(module1 == 0 && module2 == 0 ){
        System.out.println("Ambos numeros son divisibles entre si");
      } else {
        System.out.println("Los numeros no son divisibles entre si");
      }
    }
  }
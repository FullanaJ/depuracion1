package probas;

import java.util.Scanner;

public class Clasenueva {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int pos = 0, contPosiciones = 0,cont = 0;

        System.out.print("Introduce una cadena: ");
        String texto = teclado.nextLine();
        System.out.print("Introduce un caracter: ");
        char caracter = teclado.next().charAt(0);
        boolean salir=false;
        
        do {
            pos = texto.indexOf(caracter, pos);
            if (pos != -1) {
                contPosiciones++;
                pos++;
                //si la encuentra, la cuenta
            }else
                salir=true;
                //pasa a la siguiente posición
        } while (!salir);			  //termina cuando no la encuentre más

        System.out.print("El caracter aparece " + contPosiciones + " veces");
    }

}

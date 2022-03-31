/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menú_condicionales;

import java.util.Scanner;

/**
 *
 * @author mcami
 */
public class Menú_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*hola*/
        Scanner leer = new Scanner(System.in);
        int menu;
        System.out.println("Bienvenido al Menú.\n¿Qué desea hacer?\n1. Encontrar el cuadrante de una coordenada\n2. Conocer cuántos ceros, pares e impares tiene un número de cinco dígitos\n3. Operar un entero mayor a 100 dependiendo de su último dígito\n4. Salir del menú\n\nPor favor ingrese un número del 1 al 4 dependiendo de lo que desee hacer: ");
        menu = leer.nextInt();

        switch (menu) {
            case 1:
                float x,
                 y;
                System.out.println("Ingrese por favor la coordena en x: ");
                x = leer.nextFloat();
                System.out.println("ingrese por favor la coordenada en y: ");
                y = leer.nextFloat();

                if (x > 0 && y > 0) {
                    System.out.println("La coordenada se encuentra ubicada en el primer cuadrante");
                } else {
                    if (x < 0 && y > 0) {
                        System.out.println("La coordenada se encuentra ubicada en el segundo cuadrante");
                    } else {
                        if (x < 0 && y < 0) {
                            System.out.println("La coordenada se encuentra ubicada en el tercer cuadrante");
                        } else {
                            if (x < 0 && y > 0) {
                                System.out.println("La coordenada se encuentra ubicada en el cuarto cuadrante");
                            } else {
                                if (x == 0 && y == 0) {
                                    System.out.println("La coordenada se encuentra ubicada en el origen");
                                } else {
                                    if (x == 0) {
                                        System.out.println("La coordenada se encuentra ubicada en el eje y");
                                    } else {
                                        System.out.println("La coordenada se encuentra ubicada en el eje x");
                                    }
                                }
                            }
                        }

                    }
                }
                break;
            case 2:
                int numero,
                 n1,
                 n2,
                 n3,
                 n4,
                 n5,
                 impar=0,
                 par=0,
                 cero=0;
                System.out.println("Ingrese un número de 5 dígitos: ");
                numero = leer.nextInt();
                if (numero <= 99999 && numero >= 10000 | numero >= -99999 && numero <= -10000) {
                    n1 = numero / 10000;
                    n2 = (numero % 10000) / 1000;
                    n3 = (numero % 10000) % 1000 / 100;
                    n4 = ((numero % 10000) % 1000) % 100 / 10;
                    n5 = (((numero % 10000) % 1000) % 100) % 10;
                    if (n1 == 0) {
                        cero= cero+1;
                    }
                    else{
                        switch (n1 % 2) {
                            case 0:
                                par=par+1;
                                break;
                            default:
                                impar=impar+1;
                                break;
                        }
                    }
                    if (n2 == 0) {
                        cero= cero+1;
                    }
                    else{
                        switch (n2 % 2) {
                            case 0:
                                par=par+1;
                                break;
                            default:
                                impar=impar+1;
                                break;
                        }
                    }
                    if (n3 == 0) {
                        cero= cero+1;
                    }
                    else{
                        switch (n3 % 2) {
                            case 0:
                                par=par+1;
                                break;
                            default:
                                impar=impar+1;
                                break;
                        }
                    }
                    if (n4 == 0) {
                        cero= cero+1;
                    }
                    else{
                        switch (n4 % 2) {
                            case 0:
                                par=par+1;
                                break;
                            default:
                                impar=impar+1;
                                break;
                        }
                    }
                    if (n5 == 0) {
                        cero= cero+1;
                    }
                    else{
                        switch (n5 % 2) {
                            case 0:
                                par=par+1;
                                break;
                            default:
                                impar=impar+1;
                                break;
                        }
                    }
                    System.out.println("La cantidad de números pares es de "+ par + ", la cantidad de números impares es de " + impar + " y la cantidad de ceros es de "+ cero);
                    } else {
                        System.out.println("Escribe por favor un número de cinco dígitos");
                    }

                    break;                      
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Debe ingresar un número del 1 al 4, según las indicaciones del menú");
                break;
        }
    }

}

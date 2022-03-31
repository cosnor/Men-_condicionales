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
        System.out.println("------------MENÚ------------\nBienvenido al Menú.\n¿Qué desea hacer?\n1. Encontrar el cuadrante de una coordenada\n2. Conocer cuántos ceros, pares e impares tiene un número de cinco dígitos\n3. Operar un entero mayor a 100 dependiendo de su último dígito\n4. Salir del menú\n\nPor favor ingrese un número del 1 al 4 dependiendo de lo que desee hacer: ");
        menu = leer.nextInt();

        switch (menu) {
            case 1:
                float x,
                 y;
                System.out.println("Ingrese por favor la coordenada en x (un número real): ");
                x = leer.nextFloat();
                System.out.println("Ingrese por favor la coordenada en y (un número real): ");
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
                 impar = 0,
                 par = 0,
                 cero = 0;
                System.out.println("Ingrese un número de 5 dígitos: ");
                numero = leer.nextInt();
                if (numero <= 99999 && numero >= 10000 | numero >= -99999 && numero <= -10000) {
                    n1 = numero / 10000;
                    n2 = (numero % 10000) / 1000;
                    n3 = (numero % 10000) % 1000 / 100;
                    n4 = ((numero % 10000) % 1000) % 100 / 10;
                    n5 = (((numero % 10000) % 1000) % 100) % 10;
                    if (n1 == 0) {
                        cero = cero + 1;
                    } else {
                        switch (n1 % 2) {
                            case 0:
                                par = par + 1;
                                break;
                            default:
                                impar = impar + 1;
                                break;
                        }
                    }
                    if (n2 == 0) {
                        cero = cero + 1;
                    } else {
                        switch (n2 % 2) {
                            case 0:
                                par = par + 1;
                                break;
                            default:
                                impar = impar + 1;
                                break;
                        }
                    }
                    if (n3 == 0) {
                        cero = cero + 1;
                    } else {
                        switch (n3 % 2) {
                            case 0:
                                par = par + 1;
                                break;
                            default:
                                impar = impar + 1;
                                break;
                        }
                    }
                    if (n4 == 0) {
                        cero = cero + 1;
                    } else {
                        switch (n4 % 2) {
                            case 0:
                                par = par + 1;
                                break;
                            default:
                                impar = impar + 1;
                                break;
                        }
                    }
                    if (n5 == 0) {
                        cero = cero + 1;
                    } else {
                        switch (n5 % 2) {
                            case 0:
                                par = par + 1;
                                break;
                            default:
                                impar = impar + 1;
                                break;
                        }
                    }
                    System.out.println("La cantidad de números pares es de " + par + ", la cantidad de números impares es de " + impar + " y la cantidad de ceros es de " + cero);
                } else {
                    System.out.println("Escriba por favor un número de cinco dígitos");
                }

                break;
            case 3:
                int N;
                System.out.println("Ingrese un numero mayor que 100:");
                N = leer.nextInt();
                if (N > 100) {
                    switch (N % 10) {
                        case 4:
                        case 7:
                        case 9:
                            switch (N % 3) {
                                case 0:
                                    System.out.println("El número es divisible por 3");
                                    break;
                                default:
                                    System.out.println("El número no es divisible por 3");
                                    break;
                            }
                            break;
                        case 1:
                        case 5:
                            System.out.println("La decima parte del número es " + (N / 10));
                            break;
                        default:
                            System.out.println("La parte entera del número es " + N / 17 + " y el residuo es de " + N % 17);
                            break;
                    }
                }else{
                    System.out.println("Ingrese un numero mayor que 100");
                }
                break;
            case 4:
                System.out.println("Ha salido del menú. Hasta luego.");
                break;
            default:
                System.out.println("Debe ingresar un número del 1 al 4, según las indicaciones del menú");
                break;
        }
    }

}

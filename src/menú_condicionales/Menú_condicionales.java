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

        Scanner leer = new Scanner(System.in);
        int menu;
        System.out.println("Menú");
        menu = leer.nextInt();

        switch (menu) {
            case 1:
                float x,
                 y;
                System.out.println("x");
                x = leer.nextFloat();
                System.out.println("y");
                y = leer.nextFloat();

                if (x > 0 && y > 0) {
                    System.out.println("c1");
                } else {
                    if (x < 0 && y > 0) {
                        System.out.println("c2");
                    } else {
                        if (x < 0 && y < 0) {
                            System.out.println("c3");
                        } else {
                            if (x < 0 && y > 0) {
                                System.out.println("c4");
                            } else {
                                if (x == 0 && y == 0) {
                                    System.out.println("origen");
                                } else {
                                    if (x == 0) {
                                        System.out.println("eje y");
                                    } else {
                                        System.out.println("eje x");
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
                System.out.println("numero");
                numero = leer.nextInt();
                if (numero <= 99999 && numero >= 10000) {
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
                    System.out.println("par"+ par + "impar" + impar + "cero"+ cero);
                    } else {
                        System.out.println("Escribe un número de cinco dígitos positivo");
                    }

                    break;
                
        
    

case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Debe ingresar un número del 1 al 4");
                break;
        }
    }

}

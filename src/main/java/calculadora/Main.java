/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package calculadora;



import java.util.Scanner;



/**

 *

 * @author Usuario

 */

public class Main {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

        

        //AQUI SE EMPIEZA

        System.out.println("===================================");

        System.out.println("CALCULAR 2 NUMEROS ENTEROS");

        System.out.println("===================================");

        

        

        //Empiezan con la lógica

        

        //creacion del scanner

        Scanner input = new Scanner (System.in);

        

        //Creación variable para el primer numero

        int variable1 = 0;

        //creación variable2

        int variable2 = 0;

        //variable para el resultado

        int resultado =0;

        //variable para guardar la opcion del menu

        int opcion=0;

        

        while(opcion!=5){

            //Se imprime el menú y sus opciones

            System.out.println("MENU");

            System.out.println("Escoja 1,2,3,4 o 5 segun corresponda");

            System.out.println("1. Suma");

            System.out.println("2. Resta");

            System.out.println("3. Division");

            System.out.println("4. Multiplicacion");

            System.out.println("5. Salir");



            //guardo la respuesta del usuario

            opcion = input.nextInt();



            if (opcion == 1 || opcion == 2 || opcion ==3 || opcion ==4){

                //Se solicitan los valores de los numeros a operar

                System.out.println("Ingrese numero 1");

                variable1 = input.nextInt();

                System.out.println("Ingrese numero 2");

                variable2 = input.nextInt();

            }



            //creación switch

            switch (opcion){

                case 1:

                    System.out.println("esta es la opcion suma");

                    resultado = variable1 + variable2;

                    System.out.println("El resultado de la suma es: " + resultado);

                    break;

                case 2:

                    System.out.println("esta es la opción resta");

                    resultado = variable1 - variable2;

                    System.out.println("El resultado de la resta es: " + resultado);

                    break;

                case 3:

                    System.out.println("esta es la opción division");

                    resultado = variable1 / variable2;

                    System.out.println("El resultado de la division es: " + resultado);

                    break;

                case 4:

                    System.out.println("esta es la opción multiplicacion");

                    resultado = variable1 * variable2;

                    System.out.println("El resultado de la multiplicacion es: " + resultado);

                    break;

                case 5:

                    System.out.println("opción salir");

                    System.out.println("Gracias por utilizar la calculadora");

                    break;

                default:

                    System.out.println("opción por defecto");

                    System.out.println("Ingrese una opción valida");

                    break;

            }

        }

    }

    

}


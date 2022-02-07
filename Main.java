
package taller_numero_2_sofka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Representa la clase principal que le permite al usuario crear objetos de la clase Naves Espaciales o Naves espaciales Genéricas.
 * @author Marleny Fernández Sandoval
 */
public class Main {


    public static void main(String[] args) throws IOException {
        /**
         * Índice que le permite al usuario ingresar al bucle while, hasta que este decida salir.
         */
        String n= "0";
        /**
         * Índice que permite almacenar los objetos Naves espaciales y Naves espaciales genéricas
         * en sus arreglos respectivos.
         */
        int i = 0,g=0;
        /**
         * Comandos empleados para el ingreso de datos por teclado.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader vl = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader nnt = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader nat = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Arreglo que almacena las Naves espaciales creadas por el usuario.
         */
        Spaceships[] arrayNaves =new Spaceships[100];
        /**
         * Arreglo que almacena las Naves espaciales genéricas creadas por el usuario.
         */
        Generic_spacecraft_interface[] arrayGeneric = new Generic_spacecraft_interface[100];
        /**
         * Ciclo while que se encarga de consultar al usuario la creación de nuevas naves espaciales
         * hasta el n cambie su estado.
         */
        while("0".equals(n))
        {
            /**
             * Menú de inicio que le indica al usuario las posibles opciones para crear Naves espaciales 
             * o Naves espaciales genéricas.
             */
            System.out.println("--- Sea bienvenido a la creación de naves espaciales ---");
            System.out.println("Ingrese el tipo de nave espacial que desea crear: ");
            System.out.println("1.Vehículos Lanzadera");
            System.out.println("2.Naves espaciales no tripuladas");
            System.out.println("3.Naves espaciales tripuladas ");
            System.out.println("4.Naves espaciales genéricas");
            /**
             * Almacenamiento de la opción ingresada por el usuario.
             */
            String tipo = t.readLine();
            /**
             * Estructura Switch Case que permite la creación de las Naves espaciales.
             */
            switch (tipo) {
                case "1":
                    /**
                     * Menú de las naves espaciales de tipo Vehículo Lanzadera.
                     */
                    System.out.println("Digite las opciones para crear el tipo de nave espacial que desea");
                    System.out.println("1. Saturno V");
                    System.out.println("2. Energía");
                    /**
                     * Almacenamiento de la opción ingresada por el usuario.
                     */
                    String nvl = vl.readLine();
                    /**
                     * Creación de una nave espacial Saturno V.
                     */
                    if("1".equals(nvl))
                    {
                       SaturnoV nave1 = new SaturnoV(); 
                       System.out.println("Usted ha creado una nave Saturno V con las siguientes características:");
                       System.out.println("Velocidad: "+ nave1.speed + "Km/h");
                       System.out.println("Empuje: "+ nave1.thrust + " toneladas");
                       System.out.println("Combustible: "+nave1.fuelType);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                        */
                       arrayNaves[i]= nave1; 
                        
                    }
                    /**
                     * Creación de una nave espacial Energía.
                     */
                    else
                    {
                       Energy nave2 = new Energy();
                       System.out.println("Usted ha creado una nave Energía con las siguientes características:");
                       System.out.println("Velocidad: "+ nave2.speed + "Km/h");
                       System.out.println("Empuje: "+ nave2.thrust + " toneladas");
                       System.out.println("Combustible: "+nave2.fuelType);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                        */
                       arrayNaves[i]= nave2; 
                    }
                    /**
                     * Incremento del índice del arreglo para almacenar una nueva nave espacial.
                     */
                    i++;
                    break;
                case "2":
                    /**
                     * Menú de las naves espaciales de tipo Vehículos Naves espaciales no tripuladas.
                     */
                    System.out.println("Digite las opciones para crear el tipo de nave espacial que desea");
                    System.out.println("1. Mariner IV");
                    System.out.println("2. Pionero XI");
                    String nt = nnt.readLine();
                    /**
                     * Creación de una nave espacial Mariner IV.
                     */
                    if("1".equals(nt))
                    {
                       MarinerIV nave1 = new MarinerIV(); 
                       System.out.println("Usted ha creado una nave Mariner IV con las siguientes características:");
                       System.out.println("Velocidad: "+ nave1.speed + "Km/h");
                       System.out.println("Empuje: "+ nave1.thrust + " toneladas");
                       System.out.println("Combustible: "+nave1.fuelType);
                       System.out.println("Cuerpo celeste a estudiar: " + nave1.celestialBodiesToStudy);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                       */
                       arrayNaves[i]= nave1; 
                        
                    }
                    /**
                     * Creación de una nave espacial Pionero XI.
                     */
                    else
                    {
                       PioneroXI nave2 = new PioneroXI();
                       System.out.println("Usted ha creado una nave Pionero IX con las siguientes características:");
                       System.out.println("Velocidad: "+ nave2.speed + "Km/h");
                       System.out.println("Empuje: "+ nave2.thrust + " toneladas");
                       System.out.println("Combustible: "+nave2.fuelType);
                       System.out.println("Cuerpo celeste a estudiar: " + nave2.celestialBodiesToStudy);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                        */
                       arrayNaves[i]= nave2; 
                    }
                    /**
                     * Incremento del índice del arreglo para almacenar una nueva nave espacial.
                     */
                    i++;
                   
                    break;
                case "3":
                    /**
                     * Menú de las naves espaciales de tipo Vehículos Naves espaciales tripuladas.
                     */
                    System.out.println("Digite las opciones para crear el tipo de nave espacial que desea");
                    System.out.println("1. Apolo");
                    System.out.println("2. Gemini");
                    String nt1 = nat.readLine();
                    /**
                     * Creación de una nave espacial Apolo.
                     */
                    if("1".equals(nt1))
                    {
                       Apolo nave1 = new Apolo(); 
                       System.out.println("Usted ha creado una nave Mariner IV con las siguientes características:");
                       System.out.println("Velocidad: "+ nave1.speed + "Km/h");
                       System.out.println("Empuje: "+ nave1.thrust + " toneladas");
                       System.out.println("Combustible: "+nave1.fuelType);
                       System.out.println("Cantidad de pasajeros: " + nave1.crewSize);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                        */
                       arrayNaves[i]= nave1; 
                        
                    }
                    /**
                     * Creación de una nave espacial Gemini.
                     */
                    else
                    {
                       Gemini nave2 = new Gemini();
                       System.out.println("Usted ha creado una nave Pionero IX con las siguientes características:");
                       System.out.println("Velocidad: "+ nave2.speed + "Km/h");
                       System.out.println("Empuje: "+ nave2.thrust + " toneladas");
                       System.out.println("Combustible: "+nave2.fuelType);
                       System.out.println("Cantidad de pasajeros: " + nave2.crewSize);
                       /**
                        * Almacenamiento de la Nave creada en el arreglo de Naves espaciales creadas por el usuario.
                        */
                       arrayNaves[i]= nave2; 
                    }
                    /**
                     * Incremento del índice del arreglo para almacenar una nueva nave espacial.
                     */
                    i++;
                    
                    break;
                case "4":
                    /**
                     * Opciones para crear una nueva Nave espacial genérica.
                     */
                    System.out.println("Se crearà una nave espacial genérica");
                    /**
                     * Ingreso de características de la nueva nave espacial digitadas por teclado.
                     */
                    System.out.println("Digite las características de la nave");
                    System.out.println("Color: ");
                    String col = c.readLine();
                    System.out.println("Modelo: ");
                    String mod = m.readLine();
                    /**
                     * Creación de la nueva Nave espacial Genérica.
                     */
                    Generic_spacecraft_interface nave = new Generic_spacecraft_interface(col,mod);
                    /**
                     * Impresión de las características de la nueva nave espacial creada.
                     */
                    System.out.println("La nave creada es de modelo: "+ nave.model + " y color: "+ nave.color);
                    /**
                     * Almacenamiento de la nueva nave espacial en el arreglo Naves espaciales genéricas.
                     */
                    arrayGeneric[g]=nave;
                    /**
                     * Incremento del índice del arreglo de las nuevas Naves espaciales genéricas.
                     */
                    g++;
                    break;
                    
                default:
                    /**
                     * Mensaje de error en caso de no ingresar ninguna de las opciones válidas.
                     */
                    throw new AssertionError();
            }
            
            
            /**
             * Mensaje para el permitir al usuario seguir creando naves espaciales o terminar el programa.
             */
            System.out.println("Si desea continuar creando naves espaciales  ingrese 0, si no ingrese 1");
            /**
             * Toma de la ópcion dada por teclado para continuar.
             */
            String continuar = br.readLine();
            n= continuar;
            /**
             * Condicional que evalua si el usuario continuará y en caso opuesto mostrara un mensaje adicional.
             */
            if(n.equals("0"))
            {
                System.out.println("Usted continuarà");
            }
            else
            {
                System.out.println("Usted desea salir");
                System.out.println("Los modelos de las naves creadas con clasificación son: ");
                /**
                 * Ciclo for que permite mostrar los modelos de las Naves espaciales creadas.
                 */
                for (int j = 0; j < i; j++) {
                    
                    System.out.println(arrayNaves[j].model);
                    
                }
                 System.out.println("Los nombres de las naves creadas genéricas son: ");
                 /**
                  * Ciclo por que permite mostrar los modelos de las Naves espaciales genéricas creadas.
                  */
                for (int j = 0; j < g; j++) {
                    
                    System.out.println(arrayGeneric[j].model);
                    
                }
            }

        }
    }
    
}

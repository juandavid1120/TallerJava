package com.JuanDavid;


import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Main extends Validaciones {
    public static void main(String[] args) {
        int opcMenuPrincipal = 0;//OPCIONES PARA TODOS LOS MENUS
        while (opcMenuPrincipal < 19) //OP MENU PRINCIPAL
        {


            opcMenuPrincipal = leerEntero("****** M E N U   P R I N C I P A L ******\n"
                    + "1. MAYOR DE 2 NÚMEROS\n"
                    + "2. MAYOR DE 2 NÚMEROS(Consola)\n"
                    + "3. CALCULAR El AREA DE UN CÍRCULO\n"
                    + "4. CALCULAR EL IVA DE UN PRODUCTO \n"
                    + "5. PARES E IMPARES DE 1 AL 100\n"
                    + "6. PARES E IMPARES DE 1 AL 100(WITH FOR)\n"
                    + "7. INGRESA NÚMERO\n"
                    + "8. ¿ES DÍA LABORAL? \n"
                    + "9 REEMPLAZAR CADENA \n"
                    + "10 QUITAR ESPACIOS EN BLANCO"
                    + "11 TAMAÑO DE FRASE Y NRO A-E-I-O-U"
                    + "12. DIFERENCIA EN UNA CADENA Y OTRA"
                    + "13 PEDIR FECHA ACTUAL"
                    + "14 NROS HASTA EL 100"
                    + "15 MENÚ"
                    + "16 TAMAÑO DE FRASE Y NRO A-E-I-O-U"
                    + "17 TAMAÑO DE FRASE Y NRO A-E-I-O-U"
                    + "18 TAMAÑO DE FRASE Y NRO A-E-I-O-U"
                    + "19. SALIR \n");
            switch (opcMenuPrincipal)//OP MENU PRINCIPAL
            {
                case 1:
                    double nro1 = Validaciones.LeerNro("Ingrese un número");
                    double nro2 = Validaciones.LeerNro("Ingrese un número");
                    if (nro1 == nro2) {
                        JOptionPane.showMessageDialog(null, "los números son iguales ");

                    } else if (nro1 > nro2) {
                        JOptionPane.showMessageDialog(null, "El  número mayor es: " + nro1);

                    } else {
                        JOptionPane.showMessageDialog(null, "El número mayor es: " + nro2);
                    }
                    break;
                case 2:
                    double num1 = Validaciones.LeerNroConsola("Ingrese un número");
                    double num2 = Validaciones.LeerNroConsola("Ingrese un número");
                    if (num1 == num2) {
                        System.out.println("los números son iguales ");

                    } else if (num1 > num2) {
                        System.out.println("El  número mayor es: " + num1);

                    } else {
                        System.out.println("El número mayor es: " + num2);
                    }
                    break;
                case 3:
                    double radio = Validaciones.LeerNro("Ingrese un el radio"), area;
                    area = Math.PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "El  area aproximadamente del circulo es: " + Math.round(area));
                    break;
                case 4:
                    double precioProd = Validaciones.leerReal("Ingrese el precio del producto");
                    final double iva = 0.21;
                    precioProd = precioProd + (precioProd * iva);
                    JOptionPane.showMessageDialog(null, "El precio del producto con IVA es: " + precioProd);
                    break;
                case 5:
                    String nrosPares = "", nrosImpares = "";
                    int i = 1;
                    while (i <= 100) {

                        if (i % 2 == 0) {
                            nrosPares = nrosPares + String.valueOf(i) + "- ";
                        } else {
                            nrosImpares = nrosImpares + String.valueOf(i) + "- ";

                        }
                        i++;

                    }


                    JOptionPane.showMessageDialog(null, "NÚMEROS PARE DEL 1 AL 100\n" +
                            "NÚMEROS PARES: " + nrosPares + "\n" +
                            "NÚMEROS DE IMPARES " + nrosImpares);
                    break;
                case 6:
                    String numerosPares = "", numerosImpares = "";

                    for (int j = 0; j <= 100; j++) {
                        if (j % 2 == 0) {
                            numerosPares = numerosPares + String.valueOf(j) + "- ";
                        } else {
                            numerosImpares = numerosImpares + String.valueOf(j) + "- ";

                        }

                    }
                    JOptionPane.showMessageDialog(null, "NÚMEROS PARE DEL 1 AL 100\n" +
                            "NÚMEROS PARES: " + numerosPares + "\n" +
                            "NÚMEROS DE IMPARES " + numerosImpares);
                    break;
                case 7:
                    double numm1 = leerReal2("Ingrese un número");
                    JOptionPane.showMessageDialog(null, "NÚMERO INGRESADO FUE: " + numm1);


                    break;
                case 8:
                    String diaSemana = leerString("Ingrese el día de la semana");
                    int isLaborar = 0;
                    switch (diaSemana.toUpperCase()) {
                        case "LUNES":
                            isLaborar = 1;
                            break;
                        case "MARTES":
                            isLaborar = 1;
                            break;
                        case "MIERCOLES":
                            isLaborar = 1;
                            break;
                        case "JUEVES":
                            isLaborar = 1;
                            break;
                        case "VIERNES":
                            isLaborar = 1;
                            break;
                        case "SABADO":
                            isLaborar = 2;
                            break;
                        case "DOMINGO":
                            isLaborar = 2;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No ingreso un día de semana");
                            break;
                    }
                    if (isLaborar == 1) {

                        JOptionPane.showMessageDialog(null, "¡ Es día laboral !");
                    } else if (isLaborar == 2) {

                        JOptionPane.showMessageDialog(null, "¡ No es día laboral!");
                    }

                    break;
                case 9:
                    String tex1 = "La sonrisa sera la mejor arma contra la tristeza", text2 = "La actitud es la clave para dejar la atras la tristeza", text3;
                    text3 = tex1.replace("a", "e");
                    JOptionPane.showMessageDialog(null, "FRASE ORIGINAL '" + tex1 + "'\n" +
                            "FRASE CAMBIADA(SE CAMBIO A POR E) ' " + text3 + "'\n" +
                            "FRASES CONCATENADAS '" + text3 + "'\n " + text2);
                    break;
                case 10:
                    String tex2 = leerString("INGRESE LA FRASE QUE LE QUIERE QUITAR LOS ESPACIO EN BLANCO");
                    tex2 = tex2.replace(" ", "");
                    JOptionPane.showMessageDialog(null, "FRASE ORIGINAL '" + tex2);
                    break;
                case 11:
                    int contarA, contarE, contarI, contarO, contarU;
                    String frase = leerString("INGRESE UNA FRASE"), letraA;
                    letraA = "aeiou";
                    contarA = contarCaracteres(frase, letraA.charAt(0));
                    contarE = contarCaracteres(frase, letraA.charAt(1));
                    contarI = contarCaracteres(frase, letraA.charAt(2));
                    contarO = contarCaracteres(frase, letraA.charAt(3));
                    contarU = contarCaracteres(frase, letraA.charAt(4));

                    JOptionPane.showMessageDialog(null, "El NÚMERO DE CARACTERES DE LA FRASE ES: " + frase.length() + "\n" +
                            " NÚMERO DE LETRAS A SON: " + contarA + "\n" +
                            " NÚMERO DE LETRAS E SON: " + contarE + "\n" +
                            " NÚMERO DE LETRAS I SON: " + contarI + "\n" +
                            " NÚMERO DE LETRAS O SON: " + contarO + "\n" +
                            " NÚMERO DE LETRAS U SON: " + contarU + "\n");
                    break;
                case 12:
                    String Cadena1 = leerString("INGRESE LA FRASE");
                    String Cadena2 = leerString("INGRESE LA FRASE");

                    JOptionPane.showMessageDialog(null, StringUtils.difference(Cadena1, Cadena2));

                    break;
                case 13:
                    LocalDateTime ob1 = LocalDateTime.now();


                    break;
                case 14:
                    String nums1 = "";
                    int numero1 = Validaciones.leerEntero("INGRESE UN NUMERO"), sw = 0;
                    sw = numero1;
                    for (int a = numero1; a < 1000; a = a + 2) {
                        nums1 = nums1 + String.valueOf(a) + " - ";
                        sw += 1;
                        if (sw == 50) {
                            nums1 = nums1 + "\n";
                            sw = 1;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "LOS NRO SON: " + nums1);
                    break;
                case 15:
                    int op = 0;
                    do {


                        op = leerEntero("********* GESTION CINEMATOGRÁFICA ********\n" +
                                "1-NUEVO ACTOR\n" +
                                "2-BUSCAR ACTOR\n" +
                                "3-ELIMINAR ACTOR\n" +
                                "4-MODIFICAR ACTOR\n" +
                                "5-VER TODOS LOS ACTORES\n" +
                                "6- VER PELICULAS DE LOS ACTORES\n" +
                                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                                "8-SALIR");
                        switch (op) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                                break;
                        }
                    } while (op != 8);
                    break;
                case 16:
                        String nombre,sexo;
                        int edad;
                        double peso,altura;
                        nombre=leerString("INGRESE EL NOMBRE");
                        sexo=leerString("INGRESE EL SEXO");
                        edad=leerEntero("INGRESE LA EDAD");
                        peso=leerReal("INGRESE EL PESO EN KILOGRAMOS");
                        altura=leerReal("INGRESE LA ALTURA EN METROS");
                        Persona obj1=new Persona(nombre,edad,sexo,peso,altura);
                        Persona obj2=new Persona(nombre, edad, sexo);
                        Persona obj3=new Persona();

                     obj1.CalcularIMC();
                     




                    break;

                case 17:

                    break;
                case 18:

                    break;
            }//fin case DEL MENU PRINCIPAL
        }//fin mientras DEL MENU PRINCIPAL


    }

}

package com.JuanDavid;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Persona {
   private String Nombre;
   private int edad;
   private String sexo;
   private double peso;
   private String DNI;
   private double altura;

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        Nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso=peso;
        this.altura=altura;
    }
    public Persona() {
        Nombre="juanda";
        sexo="hombre";
        edad=22;
        peso=80;
        altura=1.80;

    }

    public Persona(String nombre, int edad, String sexo) {
        Nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 60;
        this.DNI = DNI;
        this.altura = 1.8;
    }
    public double CalcularIMC(){
        double IMC= peso/(Math.pow(altura,2));

        if (IMC < 20) {
            return -1;
        }else if(IMC>=20 && IMC <= 25){
            return 0;
        }else {
            return 1;

        }


    }
    public void CalcularDNI(){
        List<String> listaLetras = Arrays.asList("t", "r", "w", "a", "g", "m", "y", "f", "p", "d", "x", "b", "n", "j", "z", "s", "q", "v", "h", "l", "c", "k", "e");

        String random = ""; int nro=0;
        for (int i = 0; i < 8; i++) {

            int r = new Random().nextInt(8) + 1;
            random += String.valueOf(r);
        }
        nro=Integer.valueOf(random)%23;
        random=random+listaLetras.get(nro).toUpperCase();
        System.out.println(random);
       this.DNI=random;



    }
    public boolean ComprobarSexo(String sexo)
    {
        if (sexo.equalsIgnoreCase("hombre") ) {
            return true;
        }else if(sexo.equalsIgnoreCase("mujer")){
            return true;
        }
        return false;
    }  public boolean IsMAyorEdad()
    {
        if (edad >=18 ) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", DN1='" + DNI + '\'' +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDNI() {
        return DNI;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

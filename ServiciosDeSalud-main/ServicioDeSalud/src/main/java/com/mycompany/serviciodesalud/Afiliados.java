/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;
import java.io.*;
/**
 *
 * @author Cloud-PC
 */
public class Afiliados 
{
    String nombreAfiliado;
    int cedulaAfiliado;
    String sexoAfiliado;
    int edadAfiliado;
    int telefonoAfiliado;
    String correoAfiliado;
    String contrasenaAfiliado;
    public Afiliados()
    {
    }
    
    public void guardarDatos(String nombre,int Cedula,String Sexo,int Edad, int Telefono, String Correo,String contrasena) throws FileNotFoundException
    {
        try{
        String nombreAfiliado = nombre;
        int cedulaAfiliado=Cedula;
        String sexoAfiliado=Sexo;
        int edadAfiliado=Edad;
        int telefonoAfiliado=Telefono;
        String correoAfiliado=Correo;
        String contrasenaAfiliado=contrasena;
        String text = "Usuario: " + nombreAfiliado + " Cedula: "+cedulaAfiliado+" Sexo: "+sexoAfiliado+" Edad: "+edadAfiliado+" Telefono: "+telefonoAfiliado+" Correo: "+correoAfiliado+" Contraseña: "+contrasenaAfiliado;
        PrintWriter out = new PrintWriter("C:\\Users\\Cloud-PC\\Documents\\GitHub\\ServiciosDeSalud\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Afiliados.txt");
        out.println(text);
        out.close(); 
        System.out.println("Guardado");
        }catch (Exception e)
        {
           System.out.println(e.toString());
        }
   
    }
}

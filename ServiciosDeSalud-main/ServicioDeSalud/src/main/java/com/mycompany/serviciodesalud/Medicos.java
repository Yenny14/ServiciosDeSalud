/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Yenny
 */
public class Medicos 
{
    String nombreMedico;
    int cedulaMedico;
    String especialidadMedico;
    int consultorioMedico;
    int telefonoMedico;
    String correoMedico;
    String contrasenaMedico;
    public Medicos()
    {
    }
    
    public void guardarDatos(String nombre,int Cedula,String Especialidad,int Consultorio, int Telefono, String Correo,String contrasena) throws FileNotFoundException
    {
        try{
        String nombreMedico = nombre;
        int cedulaMedico=Cedula;
        String especialidadMedico=Especialidad;
        int consultorioMedico=Consultorio;
        int telefonoMedico=Telefono;
        String correoMedico=Correo;
        String contrasenaMedico=contrasena;
            String especialidasdMedico = null;
        String text = "Usuario: " + nombreMedico + " Cedula: "+cedulaMedico+" Especialidad: "+especialidasdMedico+" Consultorio: "+consultorioMedico+" Telefono: "+telefonoMedico+" Correo: "+correoMedico+" Contraseña: "+contrasenaMedico;
        PrintWriter out = new PrintWriter("C:\\Users\\Cloud-PC\\Documents\\GitHub\\ServiciosDeSalud\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Medicos.txt");
        out.println(text);
        out.close(); 
        System.out.println("Guardado");
        }catch (Exception e)
        {
           System.out.println(e.toString());
        }
   
    }
}

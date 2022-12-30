/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Yenny
 */
public class Medicos 
{
    String nombreMedico;
    int cedulaMedico;
    String servicioMedico;
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
    public void eliminarDatos(String Cedula)
    {
        try{
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Medico.txt";
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();        
      
        String line;
        String eliminar=Cedula;
        while((line=br.readLine())!= null)
        {
            if(line.contains(eliminar))
            {
                continue;
            }
            sb.append(line);
            sb.append("/n");
        }  
        br.close();
        fr.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sb.toString());
        bw.close();
        fr.close();
        fw.close();
        
        JOptionPane.showMessageDialog(null, "Se ha borrado al afiliado");
        }catch (Exception e)
        {
           System.out.println(e.toString());
        }
}

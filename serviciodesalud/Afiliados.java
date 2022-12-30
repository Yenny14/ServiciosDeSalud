/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    String telefonoAfiliado;
    String correoAfiliado;
    String contrasenaAfiliado;
    public Afiliados()
    {
    }
    
    public void guardarDatos(String nombre,int Cedula,String Sexo,int Edad, String Telefono, String Correo,String contrasena) throws FileNotFoundException
     {
        try{
        String nombreAfiliado = nombre;
        int cedulaAfiliado=Cedula;
        String sexoAfiliado=Sexo;
        int edadAfiliado=Edad;
        String telefonoAfiliado=Telefono;
        String correoAfiliado=Correo;
        String contrasenaAfiliado=contrasena;
        
        String text = "Usuario: " + nombreAfiliado + " Cedula: "+cedulaAfiliado+" Sexo: "+sexoAfiliado+" Edad: "+edadAfiliado+" Telefono: "+telefonoAfiliado+" Correo: "+correoAfiliado+" Contraseña: "+contrasenaAfiliado;
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Afiliados.txt";
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        
        String line="";
        while((line=br.readLine())!= null)
        {
            sb.append(line);
            sb.append("\n");
        }
        sb.append(text);
        br.close();
        String full = sb.toString();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(full);
        bw.close();
        
        System.out.println("Guardado");
        }catch (Exception e)
        {
           System.out.println(e.toString());
        }
   
    }
    public void eliminarDatos(String Cedula)
    {
        try{
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Afiliados.txt";
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
    
    public String encontrarDato(String Cedula)
    {
        String encontrado="";
        String cedula=Cedula;
        try{
        String filename="C:\\Users\\Yenny\\Desktop\\MIS TRABAJOS\\com.mycompany_ServicioDeSalud_jar_1.0-SNAPSHOT\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Afiliados";
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer(); 
        String line;
        while((line=br.readLine())!= null)
        {
            if(line.contains(cedula))
            {
                encontrado=line;
                continue;
            }
            sb.append(line);
        }
        br.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sb.toString());
        bw.close();
        fr.close();
        fw.close();
        }catch (Exception e)
        {
           System.out.println(e.toString());
        }

        return encontrado;
    }
}

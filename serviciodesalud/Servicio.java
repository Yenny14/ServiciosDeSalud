/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Servicio 
{
    String nombreServicio;
    
    {
    }
    public void Servicio()
    {
    }
        public void guardarDatos(String nombre)
    {
        try{
        String nombreServicio = nombre;
        
        
        String text = "Servicio: " + nombreServicio;
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Servicios.txt";
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
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Servicio.txt";
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

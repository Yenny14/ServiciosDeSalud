/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodesalud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Yenny
 */
public class Cita 
{
    int numeroCita;
    String afiliadoCta;
    String medicoCita;
    String consultorioCita;
    Servicio servicioCita;
    String fechaCita;
    int horaCita;
    
    public Cita()
    {
    }
    public void guardarDatos(int numero,String afiliado,String medico,String consultorio,String servicio,String fecha,int hora) throws FileNotFoundException
    {
     try{
        int numeroCita = numero;
        String afiliadoCita= afiliado;
        String medicoCita = medico;
        String consultorioCita = consultorio;
        String servicioCita = servicio;
        String fechaCita= fecha;
        int horaCita = hora;
       
        String text = "numero: " + numeroCita + " Afiliado: "+afiliadoCita+" medico: "+medicoCita+" Consultorio: "+consultorioCita+" Servicvio: "+servicioCita+" Fecha: "+fechaCita+" Hora: "+horaCita;
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Cita.txt";
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

public void eliminarDatos(int numero)
    {
        try{
        String filename="C:\\Users\\Yenny\\Desktop\\MIS TRABAJOS\\com.mycompany_ServicioDeSalud_jar_1.0-SNAPSHOT\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Cita;
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();        
      
        String line;
        int eliminar=numero;
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
        String filename="C:\\Users\\Yenny\\Documents\\Miniproyecto-3-main\\ServicioDeSalud\\src\\main\\java\\com\\mycompany\\serviciodesalud\\Afiliados.txt";
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

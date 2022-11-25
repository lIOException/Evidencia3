package evidencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
    ArrayList<String> usuarios; 
        
    public void crearTxt(String nombre,String users) {
        File f;
        FileWriter escritorArchivo;
        try {
            f = new File(nombre);
            escritorArchivo = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escritorArchivo);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(users);
            salida.close();
            bw.close();
        } catch (IOException e) {
            
        }
    }
    
    public void concatenarDoctor(String user){
        String temp = this.leer("src/evidencia/db/doctores");
        temp += user;
        this.crearTxt("src/evidencia/db/doctores",temp);
    }
    public void concatenarPaciente(String user){
        String temp = this.leer("src/evidencia/db/pacientes");
        temp += user;
        this.crearTxt("src/evidencia/db/pacientes",temp);
    }
    public void concatenarCita(String cita){
        String temp = this.leer("src/evidencia/db/Cita");
        temp += cita;
        this.crearTxt("src/evidencia/db/Cita",temp);
    }
    
    public String leer(String nombre) {

        try {

            File f;
            FileReader lectorArchivo;
            f = new File(nombre);
            lectorArchivo = new FileReader(f);
            BufferedReader br = new BufferedReader(lectorArchivo);

            usuarios = new ArrayList(); 
            String l = "";
            String aux = "";
            while (true){
                aux = br.readLine();
                if (aux != null) {
                    l += aux + "\n";
                    usuarios.add(aux);
                } else {
                    break;
                }
            }
            br.close();
            lectorArchivo.close();
            return l;
        } catch (IOException e) {
        }
        return null;
    }
}
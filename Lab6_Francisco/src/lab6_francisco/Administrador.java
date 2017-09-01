
package lab6_francisco;

import java.io.*;
import java.util.ArrayList;


public class Administrador {
    ArrayList<Persona>p;
    private File archivo=null;

    public Administrador() {
    }

    public Administrador(ArrayList<Persona> p) {
        this.p = p;
    }

    public ArrayList<Persona> getP() {
        return p;
    }

    public void setP(ArrayList<Persona> p) {
        this.p = p;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void CrearCarpeta(String Nombre){
        //crea Carpeta
        FileWriter fw = null;
        BufferedWriter bw =null;
        File Carpeta = new File("./"+Nombre);
        Carpeta.mkdir();
        File enviados = new File("./"+Nombre+"/enviados.txt");
        
    }
}

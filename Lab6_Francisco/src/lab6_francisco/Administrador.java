
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
    
    public void CrearCarpeta(String Nombre) throws IOException{
        //crea Carpeta
        FileWriter fw = null;
        BufferedWriter bw =null;
        File Carpeta = new File("./usuarios"+Nombre);
        Carpeta.mkdir();
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Leido"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"No Leidos"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Borrador"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Spam"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Eliminados"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Enviado"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
        //
        fw = new FileWriter("./usuarios"+Nombre+"/"+"Importante"+".txt");
        bw = new BufferedWriter(fw);
        bw.write("");
        bw.flush();
    }
}

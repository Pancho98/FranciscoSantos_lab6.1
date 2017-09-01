
package lab6_francisco;


public class Buzon {
    private String receptor;
    private String emisor;
    private String mensaje;

    public Buzon() {
    }

    public Buzon(String receptor, String emisor, String mensaje) {
        this.receptor = receptor;
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Buzon(String emisor) {
        this.emisor = emisor;
    }

    @Override
    public String toString() {
        return "Buzon{" + "emisor=" + emisor + '}';
    }
    
    
}

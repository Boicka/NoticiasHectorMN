package Modelo;

public class Externo {
    int iduser;
    String nombre;
    String apepaterno;
    String apematerno;
    String direccion;
    String pass;
    String fechaderegistro;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaderegistro() {
        return fechaderegistro;
    }

    public void setFechaderegistro(String fechaderegistro) {
        this.fechaderegistro = fechaderegistro;
    }

    @Override
    public String toString() {
        return "Externo{" + "iduser=" + iduser + ", nombre=" + nombre + ", apepaterno=" + apepaterno + ", apematerno=" + apematerno + ", direccion=" + direccion + ", pass=" + pass + ", fechaderegistro=" + fechaderegistro + '}';
    }

    

    
}

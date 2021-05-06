/* DATALIS OFFERS TABLE */

import java.util.ArrayList;
import java.util.Date;

public class Offers {
    
    /* VARIABLES */
    private int idOffer;
    private int idAdmin;
    private String descripcion;
    private String especialidad;
    private String info;
    private Date fechaPublicacion;
    private Date fechaExpiracion;
    private ArrayList<Offers> listaOfertas;

    /* CONSTRUCTOR*/
    public Offers(int idOffer, int idAdmin, String descripcion, String especialidad, String info, Date fechaPublicacion, Date fechaExpiracion) {
        this.idOffer = idOffer;
        this.idAdmin = idAdmin;
        this.descripcion = descripcion;
        this.especialidad = especialidad;
        this.info = info;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaExpiracion = fechaExpiracion;
    }

    /* MÉTODOS */
    public void addOferta(Offers o){
        if(!listaOfertas.contains(o)){
            listaOfertas.add(o);
        } else {
            System.err.println("Esta oferta ya existe.");
        }
    }
    
    /* GETTERS Y SETTERS */
    public int getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(int idOffer) {
        this.idOffer = idOffer;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public ArrayList<Offers> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Offers> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }
    
    /* TOSTRING*/

    @Override
    public String toString() {
        return "-------------------------" + "Nº de Oferta: " + idOffer + "\nDescripción: " + descripcion + "\nEspecialidad: " + especialidad + "\nInfo: " + info + "\nFecha de publicación=: " + fechaPublicacion + "\nFecha de expiración: " + fechaExpiracion + "-------------------------";
    }
}


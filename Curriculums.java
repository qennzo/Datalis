/* DATALIS CURRICULUMS TABLE */

import java.util.Date;

public class Curriculums {
    
    /* VARIABLES */
    private int idUser;
    private int idOffer;
    private String link;
    private Date registerDate;

    /* CONSTRUCTOR */
    public Curriculums(int idUser, int idOffer, String link, Date registerDate) {
        this.idUser = idUser;
        this.idOffer = idOffer;
        this.link = link;
        this.registerDate = registerDate;
    }

    /* GETTERS Y SETTERS */
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdOffer() {
        return idOffer;
    }

    public void setIdOffer(int idOffer) {
        this.idOffer = idOffer;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}

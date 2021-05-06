/* DATALIS ADMIN TABLE */

public class Admin {
    
    /* VARIABLES */
    private int idAdmin;
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private int tlf;
    private String password;

    /* CONSTRUCTOR */
    public Admin(int idAdmin, String dni, String nombre, String apellidos, String email, int tlf, String password) {
        this.idAdmin = idAdmin;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.tlf = tlf;
        this.password = password;
    }

    /* GETTERS Y SETTERS */
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

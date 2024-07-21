package Clases;

public class Usuario {
    private String usuario;
    private String nombre;
    private String apellido;
    private String cargo;
    private String sexo;
    private String contrasena;

    public Usuario(String usuario, String nombre, String apellido, String cargo, String sexo, String contrasena) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.sexo = sexo;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}

package gui;

public class Usuario {
    private String nombreUsuario;
    private String contrase�a;

    // Constructor
    public Usuario(String nombreUsuario, String contrase�a) {
        this.nombreUsuario = nombreUsuario;
        this.contrase�a = contrase�a;
    }

    // Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrase�a() {
        return contrase�a;
    }
}

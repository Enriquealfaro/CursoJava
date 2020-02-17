package domain;

public class Usuario {
    private int id_persona;
    private String usuario;
    private String password;

    public Usuario(){

    }

    public Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id_persona=" + id_persona +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

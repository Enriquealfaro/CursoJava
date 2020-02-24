
package dominio;


public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;

    public Cliente() {
    }

    //Para eliminar cilentes
    public Cliente(int idcliente) {
        this.idCliente = idcliente;
    }

    
    //Para agregar clientes
    public Cliente(String nombre, String apellido, String email, String telefono, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    //para actualizar clietnes
    public Cliente(int idcliente, String nombre, String apellido, String email, String telefono, double saldo) {
        this.idCliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }
    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" 
                + idCliente + ", nombre=" 
                + nombre + ", apellido=" 
                + apellido + ", email=" 
                + email + ", telefono=" 
                + telefono + ", saldo=" 
                + saldo + '}';
    }
    
    
    
}

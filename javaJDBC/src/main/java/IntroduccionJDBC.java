import java.sql.*;

public class IntroduccionJDBC {

    public static void main(String[] args){
        //Paso 1. Creamos nuestra cadena de conexion a mysql
        String url = "JDBC:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";

        //Paso 2. Creamos el objeto conexion a la base de datos
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "1.2.3.4.5.6.7.8.9");
            //Paso 3. Creamos n objeto statement
            Statement instruccion = conexion.createStatement();
            //Paso 4. Creamos el query
            String sql = "Select id_persona, nombre, apellido, email, telefono from persona";
            //Paso 5. Ejecucion del query
            ResultSet resultado = instruccion.executeQuery(sql);
            //Paso 6. Precesamos el resultado
            while(resultado.next()){
                System.out.println("Id persona:" + resultado.getInt(1));
                System.out.println("Id persona:" + resultado.getString(2));
                System.out.println("Id persona:" + resultado.getString(3));
                System.out.println("Id persona:" + resultado.getString(4));
                System.out.println("Id persona:" + resultado.getString(5));
                System.out.println("");


            }
            //Cerramos cada objeto que hemos utilizado
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package  com.gandalsmart;

import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.persist.Adapter;
import org.gjt.mm.mysql.MysqlDataSource;

public class Adaptateur {
    public static void main() {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_name";
        String username = "root";
        String password = "123";

        // L'adaptateur utilisera la table nommée "casbin_rule". 
        // Utilisez le pilote, l'url, le nom d'utilisateur et le mot de passe pour initialiser un adaptateur JDBC. 
          
 JAdapter a = new JAdapter(driver, url, username, password);
        
        // Nous recommandons d'utiliser DataSource pour initialiser un adaptateur JDBC. 
        // Implémenteur de l'interface DataSource, telle que hikari, c3p0, durid, etc. 

       MysqlDataSource dataSource = new MysqlDataSource();
        String url1 = dataSource.getURL(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

           a = JAdapter(dataSource);

        Enforcer e =  new  Enforcer ( "App_model.conf " , (Adapter) a);

        // Vérifiez l'autorisation.

         e.Enforcer("mamadou", "data1", "read");


        // Sauvegardons la politique dans la base de données.

         e.savePolicy();

        // Ferme la connexion. 
       a.close();
    }

    private static JAdapter JAdapter(MysqlDataSource dataSource)
    {

    }
}
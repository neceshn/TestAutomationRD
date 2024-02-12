package ODEV12;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementException;

import java.util.List;
import java.util.Map;
public class MySQLJdbiExample {


    public static void main(String[] args) {
        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11683450";
        String userName = "sql11683450";
        String password = "zJJDHznSQU";

        Jdbi jdbi = Jdbi.create(url, userName, password);

        createTable(jdbi);

        addUser(jdbi, "Ece", "Sahin", 123456);
        addUser(jdbi, "Nazli", "Sahin", 345678);
        addUser(jdbi, "Nazli Ece", "Sahin Gurbuz", 425145);

        getUsers(jdbi);
        updateUser(jdbi);
        deleteUsers(jdbi);
    }


    public static void createTable(Jdbi jdbi) {
        try (Handle handle = jdbi.open()) {
            handle.execute("CREATE TABLE IF NOT EXISTS ece_gurbuz (id SERIAL PRIMARY KEY, name VARCHAR(100), surname VARCHAR(100), password VARCHAR(25))");
        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

    public static void addUser(Jdbi jdbi, String name, String surname, int password) {
        try (Handle handle = jdbi.open()) {
            handle.execute("INSERT INTO ece_gurbuz (name,surname,password) VALUES (?, ?,?)", name, surname, password);
        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

    public static void getUsers(Jdbi jdbi) {
        try (Handle handle = jdbi.open()) {
            List<Map<String, Object>> result = handle.createQuery("SELECT * FROM ece_gurbuz WHERE id = :id")
                    .bind("id", 3)
                    .mapToMap()
                    .list();

            for (Map<String, Object> row : result) {
                for (Map.Entry<String, Object> entry : row.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                System.out.println("--------------------");
            }
        } catch (StatementException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(Jdbi jdbi){
        try (Handle handle = jdbi.open()) {
            List<Map<String, Object>> updateQuery = handle.createUpdate("UPDATE ece_gurbuz SET password = :password WHERE id = :id")
                    .bind("id", 4)
                    .bind("password", "125789")
                    .executeAndReturnGeneratedKeys()
                    .mapToMap()
                    .list();

            for (Map<String, Object> row : updateQuery) {
                for (Map.Entry<String, Object> entry : row.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                System.out.println("--------------------");
            }        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteUsers(Jdbi jdbi){
        try(Handle handle= jdbi.open()){
          int deletedRows = handle.createUpdate("DELETE FROM ece_gurbuz WHERE id= :id ")
                  .bind("id",3).execute();

          int autoIncrementQuery = handle.createUpdate("ALTER TABLE ece_gurbuz AUTO_INCREMENT = 0").execute();

            System.out.println("Silinen Kayıt Sayısı: " + deletedRows);
            System.out.println("Otomatik Başlangıç Sayısı O yapıldı.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package solid.DIP;

public class Bad {

    class MySQLDatabase {
        public void connect(){
            System.out.println("Conectando a MySQL...");
        }
    }
    
    class DataManager {
        private MySQLDatabase database;
        
        public DataManager (){
            this.database = new MySQLDatabase();
        }
        public void connect(){
            database.connect();
        }
    }
    
}

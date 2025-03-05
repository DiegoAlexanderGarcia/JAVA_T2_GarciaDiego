
package solid.DIP;

public class Good {

    interface Database {
        void connect();
    }
    
    class PosgreSQLDatabase implements Database{
        public void connect(){
            System.out.println("Conectando a PosgreSQL...");
        }
    }   
    
    class DataManager {
        private Database database = new PosgreSQLDatabase();
        
        public DataManager (Database database){
            this.database = database;
        }
        public void connect(){
            database.connect();
        }
    }
}

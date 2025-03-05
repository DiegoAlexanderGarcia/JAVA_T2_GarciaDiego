
package solid.ISP;

public class Bad {

    interface Worker{
        void work();
        void eat();
    }
    
    class Robot implements Worker {
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat (){
            throw new UnsupportedOperationException("Un robot no com!");
        }
    } 
    
}

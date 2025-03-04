
package solid.OCP;

public class Bad {
    class Rectangle {
        public double width;
        public double hight;
    }        
    
    class AreaCalcular {
        public double calculateRectangulo(Rectangle rectangle){
            return rectangle.width * rectangle.hight;
        }
    }
    
    public static void main(String[] args) {
       
    }
    
}


package solid.LSP;


public class BAD {

    public static void main(String[] args) {
        class Bird {
            public void fly(){
                System.out.println("volando....");
            }
        }
        class Penguin extends Bird {
            @Override
            public void fly(){
                throw new UnsupportedOperationException("¡Los pinguinos no puedes volar!");
            }
        }
    }
    
    
}

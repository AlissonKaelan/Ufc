
package ufc;

/**
 *
 * @author alisson
 */
public class main {

    
    public static void main(String[] args) {
        Lutador Lutadores[] = new Lutador[6];
        
        
        Lutadores[0] = new Lutador("Alisson", "Brasil", 20, 1.78f, 78.9f, 30, 2, 1);
        Lutadores[1] = new Lutador("John", "EUA", 25, 1.85f, 85.0f, 20, 5, 3);
        Lutadores[2] = new Lutador("Kenta", "Japão", 28, 1.75f, 70.0f, 15, 2, 1);
        Lutadores[3] = new Lutador("Carlos", "Argentina", 30, 1.80f, 82.5f, 25, 10, 5);
        Lutadores[4] = new Lutador("Mike", "Canadá", 27, 1.90f, 90.0f, 18, 4, 2);
        Lutadores[5] = new Lutador("Carol", "Africa", 22, 1.65f, 60.0f, 10, 1, 0);
        
        Luta Ufc01 = new Luta();
        Ufc01.marcaLuta(Lutadores[0], Lutadores[3]);
        Ufc01.lutar();
        Lutadores[0].status();
        Lutadores[3].status();
        
    }
    
}

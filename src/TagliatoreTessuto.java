//Questa classe rappresnta la fase di taglio
//Implementa runnable cosi puo essre gestita dal THread
public class TagliatoreTessuto implements Runnable {

   @Override
    public void run() {
       try {
           //Simulazione taglio
           System.out.println("TagliatoreTessuto: inizio a tagliare il tessuto.");
           //Simula il tempo
           Thread.sleep(800);
           //Fine taglio
           System.out.println("TagliatoreTessuto: finisco di tagliare.");

       } catch ( InterruptedException e) {
           //Possibile interruzione
           System.err.println("TagliatoreTessuto: interroto mentre tagliavo");
           Thread.currentThread().interrupt();
       }
    }
}

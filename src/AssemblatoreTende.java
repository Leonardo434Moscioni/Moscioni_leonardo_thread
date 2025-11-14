//Fase di assemblaggio e montaggio
//Anche questa implementa runnable

public class AssemblatoreTende implements Runnable{

    @Override
    public void run() {
        try {
            //Simulazione assemblaggio
            System.out.println("AssemblatoreTende: inizio assemblaggio e montaggio");
            //simula durata
            Thread.sleep(600);

            //fine assemblaggio
            System.out.println("AssemblatoreTende: fine assemblaggio e montaggio");

        } catch ( InterruptedException e) {
            //Gestione interruzione
            System.out.println("AssemblatoreTende: interrotto durante l assemblaggio");
            Thread.currentThread().interrupt();
        }
    }
}

//ProcessManager è il progetto padre che si occupa di avviare

public class ProcessManager {
    public static void main(String[] args) {

        System.out.println("ProcessManager: avvio processo produttivo (tende da sole).");
        TagliatoreTessuto tagliatore = new TagliatoreTessuto();
        AssemblatoreTende assemblatore = new AssemblatoreTende();

        Thread t1 = new Thread(tagliatore, "TagliatoreTessuto-Thread");
        Thread t2 = new Thread(assemblatore, "AssemblatoreTende-Thread");

        //Avvio Thread
        t1.start();
        t2.start();

        try {
            System.out.println("ProcessManager: attendo completamento dei Thread figli");
            t1.join(); //aspetta il tagliatore
            t2.join(); //aspetta l assemblatore
        } catch (InterruptedException e){
            System.err.println("ProcessManager: interrupted while waiting Threads");
            Thread.currentThread().interrupt();
        }
            System.out.println("ProcessManager: tende da sole pronte.");
    }
}

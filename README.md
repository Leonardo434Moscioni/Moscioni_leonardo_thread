
##  **1. Obiettivo del progetto**

L'obiettivo è rappresentare una piccola catena di produzione automatizzata composta da un processo principale (**ProcessManager**) che coordina due fasi produttive eseguite in parallelo tramite thread:

1.  **Taglio del tessuto** -->eseguito dal thread TagliatoreTessuto
    
2.  **Assemblaggio e montaggio** -->eseguito dal thread AssemblatoreTende
    

Il processo padre attende la conclusione di entrambe le fasi prima di dichiarare prodotto finito.

## **2.Obiettivi didattici**
Il progetto ha lo scopo di mostrare l'utilizzo di concetti fondamentali in java:
1)-   Creazione di thread tramite Runnable
2)Esecuzione parallela tramite start()
3)Sincronizzazione tramite join()
4)Simulazione di tempi reali tramite sleep()
5)Coordinamento tra processo padre e processi figli

TendeDaSole_Thread/
README.md
 --UML_Project.pdf
 --javadoc.zip
 src/
--ProcessManager.java
 --TagliatoreTessuto.java
 --AssemblatoreTende.java
javadoc_html/
  -- index.html
  # **4. Descrizione delle classi**

### ✔ **ProcessManager**

-   Avvia i due thread di produzione
    
-   Usa join() per attendere la loro conclusione
    
-   Determina la fine del processo industriale
    

###  **TagliatoreTessuto**

-   Simula il taglio del tessuto
    
-   Utilizza Thread.sleep(800) per simulare il tempo di lavorazione
    
-   Stampa messaggi di inizio e fine lavoro
    

###  **AssemblatoreTende**

-   Simula l’assemblaggio della struttura
    
-   Utilizza Thread.sleep(600)
    
-   Stampa messaggi di inizio e fine lavoro
   
    
----------

#  **5. Documentazione inclusa**

###  **UML_Project.pdf**

Contiene il diagramma UML con:

-   classe padre ProcessManager
    
-   thread TagliatoreTessuto
    
-   thread AssemblatoreTende
    



----------

#  **6. Requisiti**

-   Java JDK 8 
    
-   IntelliJ
    
-   Sistema operativo Windows
    

----------

#  **7. Autore**

LEONARDO MOSCIONI 5CINF
----------


class MiHilo extends Thread {

    public MiHilo(String threadName) {
        super(threadName);
    }



    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + " está ejecutando.");
            try {
                if (this.getName().equals("Hilo2") ){
                    throw new RuntimeException("El hilo 2 se ha parado");
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El hilo fue interrrumpido");
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
public class Hilo {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Hilo1");
        MiHilo hilo2 = new MiHilo("Hilo2");
        MiHilo hilo3 = new MiHilo("Hilo3");
        hilo1.setName("Hilo 1");
        hilo2.setName("Hilo 2");
        hilo3.setName("Hilo 3");

        hilo1.setPriority(Thread.MIN_PRIORITY);
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();

        throw new RuntimeException();
    }

}

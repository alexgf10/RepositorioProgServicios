

public class DownloadThread extends Thread {
    private String nombreArchivo;
    private long timeMs;
    int contador = 0;

    public DownloadThread(String nombreArchivo, long timeMs) {
        this.nombreArchivo = nombreArchivo;
        this.timeMs = timeMs;
    }


    public void run() {
        try {
            System.out.println("Iniciando descarga: " + nombreArchivo + " Tiempo: " +timeMs);
            sleep(this.timeMs);
            System.out.println("Descarga finalizada: " + nombreArchivo);

        } catch (Exception e){
            System.out.println("Excepcion" + e.getMessage());

        }
    }

}



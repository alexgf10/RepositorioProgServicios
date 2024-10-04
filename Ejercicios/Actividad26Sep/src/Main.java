import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DownloadThread descarga1 = new DownloadThread("archivo1.mp4",5000);
        DownloadThread descarga2 = new DownloadThread("archivo2.jpg",3000);
        DownloadThread descarga3 = new DownloadThread("archivo3.zip",6000);
        DownloadThread descarga4 = new DownloadThread("archivo4.rar",7000);
        DownloadThread descarga5 = new DownloadThread("archivo5.exe",8000);

        ArrayList<DownloadThread> downloadThreads = new ArrayList<>();

        downloadThreads.add(descarga1);
        downloadThreads.add(descarga2);
        downloadThreads.add(descarga3);
        downloadThreads.add(descarga4);
        downloadThreads.add(descarga5);


        for (int i = 0; i < downloadThreads.size(); i++) {
            downloadThreads.get(i).start();
        }

        for (int i = 0; i < downloadThreads.size(); i++) {
            try {
                downloadThreads.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Las descargas se han completado.");
    }

}
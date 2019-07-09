package progetto_po;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;
        import java.util.ArrayList;

public class scanner {
    public static void scannerizza(String FileName){
        File file = new File(FileName);
        try {
            Scanner inputStream = new Scanner(file);
            inputStream.next(); // ignore the first line
            datetime[] misurazione = new datetime[][44990];
            int i = 0;
            while(inputStream.hasNext()){
                String data = inputStream.next(); // gets a whole line
                String[] SeparaData = data.split(" ");
                String[] Separatempo = SeparaData[1].split(",");
                misurazione[i] = new datetime(Separatempo[0], SeparaData[0], Separatempo[1], Separatempo[2]);
                i++;
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

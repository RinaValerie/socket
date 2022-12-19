import java.io.File;
import java.util.Scanner;

public class AccesFichier {
    Server s;

    public static void main(String[] args) {
        try {
            File fichier = new File("message.txt");

            //create the scanner objet
            Scanner readFile = new Scanner(fichier);

            while (readFile.hasNextLine()) {

                String data = readFile.nextLine();
                //System.out.println(data+ this.s.message);

                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
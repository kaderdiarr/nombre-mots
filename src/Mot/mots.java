package Mot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class mots {
	public static void main(String[] args) {
        
		File file = new File("path/Nombre_De_Mot/src/Mots.txt");
        int totalWordCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+");
                totalWordCount += words.length;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + e.getMessage());
        }

        System.out.println("Nombre total de mots : " + totalWordCount);
    }
}

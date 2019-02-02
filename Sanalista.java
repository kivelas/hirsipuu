
// Saila Kivela

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Sanalista {
    
    private ArrayList<String> lista = new ArrayList <>();
    
    public Sanalista(String tiedosto){ 
        try (Scanner lukija = new Scanner(new File(tiedosto))){
            while (lukija.hasNextLine()){
                lista.add(lukija.nextLine());
            }
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
    }
    
    public ArrayList <String> annaSanat(){
        return lista;
    }
}

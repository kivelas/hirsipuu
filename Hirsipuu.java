
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 6.
// Hirsipuu-peli


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hirsipuu {
    private int arvaukset;
    private String arvattava;
    private ArrayList<Character> arvatut = new ArrayList<>();
    
    public Hirsipuu(List<String> lista, int arvaukset){
        this.arvaukset = arvaukset;
        Random arpa = new Random();
        this.arvattava = lista.get(arpa.nextInt(lista.size()));
    }
    
    public boolean arvaa (Character merkki){
        arvatut.add(merkki);
        if (this.arvattava.contains(Character.toString(merkki))){
            return true;
        } else {
            this.arvaukset--;
        }  
        return false;
    }
    
    public ArrayList<Character> arvaukset(){
        return arvatut;
    }
    
    public int arvauksiaOnJaljella(){
        return this.arvaukset;
    }
    
    public String sana(){
        return this.arvattava;
    }
    
    public boolean onLoppu(char [] tayte){
        
        if(arvattava.equals(String.valueOf(tayte))){
            return true;
        }
        return false;
    }
}

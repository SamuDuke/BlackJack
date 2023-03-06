package misClases;

import java.util.*;

/**
 *
 * @author Samuel
 */
public class Crupier {
    private HashSet<Cartas> baraja;
    private int numAleatorio;

    public Crupier() {
        baraja = new HashSet();
        rellenarCorazones();
        rellenarDiamantes();
        rellenarPicas();
        rellenarTreboles();
    }    
    
    public void rellenarCorazones(){
        for (int i = 1; i < 14; i++) {
            Cartas cartaC = new Cartas("corazones", i);
            baraja.add(cartaC);
        }
    }
    public void rellenarDiamantes(){
        for (int i = 1; i < 14; i++) {
            Cartas cartaD = new Cartas("diamantes", i);
            baraja.add(cartaD);
        }
    }
    public void rellenarPicas(){
        for (int i = 1; i < 14; i++) {
            Cartas cartaP = new Cartas("picas", i);
            baraja.add(cartaP);
        }
    }
    public void rellenarTreboles(){
        for (int i = 1; i < 14; i++) {
            Cartas cartaT = new Cartas("treboles", i);
            baraja.add(cartaT);
        }
    }
    
    public Cartas darCarta(){
        int num, cont=0, total=0;
        
        num = generaRandom()-1;
        for (Cartas c:baraja) {
            if(cont == num){
                return c;
            }
            cont++;
        }
        return null;
    }
    public int generaRandom() {
        int num = baraja.size();
        
        return (int) (Math.floor(Math.random() * num + 1));
    }
    public void eliminarCarta(Cartas c){
        baraja.remove(c);
    }

    @Override
    public String toString() {
        return "Crupier{" + "baraja=" + baraja + '}';
    }
    
    
}

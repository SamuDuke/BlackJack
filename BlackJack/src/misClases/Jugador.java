package misClases;

import java.util.*;

/**
 *
 * @author Samuel
 */
public class Jugador {
    private ArrayList cartas;

    public Jugador() {
        cartas = new ArrayList();
    }
    
    public void asignarCarta(Cartas c){
        cartas.add(c);
    }
    
    public int calculaPuntuacion(){
        int total=0;
        
        for (Iterator iterator = cartas.iterator(); iterator.hasNext();) {
            Cartas next = (Cartas)iterator.next();
            total += puntuacionCarta(next);
        }
        if(valorAs() && total > 21)
            total -= 10;
        return total;
    }
    
    public int puntuacionCarta(Cartas c){
        int puntuacion=0;
        int valor = c.getNumero();
        
        if(valor > 1 && valor < 10)
            puntuacion = valor;
        else if(valor>=10)
            puntuacion = 10;
        else if(valor == 1)
            puntuacion = 11;
        
        return puntuacion;
    }
    
    public boolean valorAs(){
        for (Iterator iterator = cartas.iterator(); iterator.hasNext();) {
            Cartas next = (Cartas)iterator.next();
            if(next.getNumero()==1)
                return true;
        }
        return false;
    }
}

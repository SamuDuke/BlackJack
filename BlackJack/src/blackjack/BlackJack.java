package blackjack;

import javax.swing.JOptionPane;
import misClases.Cartas;
import misClases.Crupier;
import misClases.Jugador;

/**
 *
 * @author Samuel
 */
public class BlackJack {
    public static void main(String[] args) {
        Crupier c = new Crupier();
        Jugador j1 = new Jugador();
        int seguir = 0,total=0;
        Cartas carta;
        
        while(seguir==0){
            carta = c.darCarta();
            System.out.println(carta);
            j1.asignarCarta(carta);
            c.eliminarCarta(carta);
            total = j1.calculaPuntuacion();
            if(total == 21){
                JOptionPane.showMessageDialog(null, "Tu puntuación es: "+total+". Ganaste!","¡A ganar a ganar pollo para cenar!",JOptionPane.WARNING_MESSAGE);
                break;
            }
            if(total > 21){
                JOptionPane.showMessageDialog(null, "Tu puntuación es: "+total+". Te has pasado de 21!","¡Perdiste!",JOptionPane.ERROR_MESSAGE);
                break;
            }
            else
                seguir = JOptionPane.showConfirmDialog(null, "Tu puntuación es: "+total+"¿Desea seguir?");
        }
        System.out.println("Tu puntuación ha sido: "+total);
    }
    
}

/* MAIN */
package Uno;
import Uno.UnoPlayer;
/**
 *
 * @author E0015359
 */
public class Execute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UnoPlayer P1 = new UnoPlayer("01", "TK");
        UnoPlayer P2 = new UnoPlayer("02", "VEERA");
        UnoPlayer P3 = new UnoPlayer("03", "YIN");
        UnoPlayer P4 = new UnoPlayer("04", "RYAN");
        UnoPlayer P5 = new UnoPlayer("05", "MYO");
        Game game = new Game("GAME1");
        game.CreateNewGame();//create a new deck
        
        //add players
        game.addplayer(P1);
        game.addplayer(P2);
        game.addplayer(P3);
        game.addplayer(P4);
        game.addplayer(P5);
        
        game.StartGame();//discard a card and send start cards for players
        game.showGameInformation();
    }

        
    }


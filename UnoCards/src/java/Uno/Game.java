/*CONTROLLER */
package Uno;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author E0015359
 */
public class Game {

    private String gameID;
    private final ArrayList<UnoPlayer> playerList;
    private String status;
    private final UnoDeck deck;
    private String discardFile;
    private final ArrayList<UnoCard> DiscardPile;
    private final Integer maxCards = 7;
    
    public Game(String gameID) {
        super();
        this.gameID = gameID;
        deck = new UnoDeck();
        playerList = new ArrayList<>();
        DiscardPile = new ArrayList<>();
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public UnoDeck getdeck() {
        return deck;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiscardFile() {
        return discardFile;
    }

    public void setDiscardFile(String discardFile) {
        this.discardFile = discardFile;
    }

    public void addplayer(UnoPlayer player) {
        playerList.add(player);
    }

    public void CreateNewGame() {
        getdeck().CreateNewDeck();
    }

    public void StartGame() {
        discardACard(getdeck().TakeAcard());
        for (int j = 0; j < maxCards; j++) {
            for (int i = 0; i < playerList.size(); i++) {
                playerList.get(i).addCardtoHand(deck);
            }
        }
    }

    public UnoCard discardACard(UnoCard c) {
        UnoCard card = c;
        DiscardPile.add(card);
        return card;
    }

    public void showDiscardPile() {
        System.out.println("Discard :");
        Iterator<UnoCard> c = DiscardPile.iterator();
        while (c.hasNext()) {
            System.out.println(c.next());
        }
    }

    public void showPlayerList() {
        Iterator<UnoPlayer> p = playerList.iterator();
        while (p.hasNext()) {
            p.next().show();
        }
    }

    public void showGameInformation() {
        System.out.println("Game ID: " + gameID);
        showDiscardPile();
        System.out.println("Cards on deck " + deck.getNumber());
        System.out.println();
        showPlayerList();
    }

    public void TakeAcardFromDeck(UnoDeck deck) {
        UnoCard x = new UnoCard("a", "b", 1, "c");

    }
}

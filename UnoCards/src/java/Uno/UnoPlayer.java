/* MODEL */
package Uno;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author E0015359
 */
public class UnoPlayer {    //Ref: member
    private String ID;
    private String Name;
    private final ArrayList<UnoCard> CardsinHand;

    

    public UnoPlayer(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
        CardsinHand=new ArrayList<>();
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        ID = id;
    }

    public void addCardtoHand(UnoDeck c) {
        CardsinHand.add(c.TakeAcard());
    }

    public void GetCardsinHand() {
        Iterator<UnoCard> i = CardsinHand.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

    @Override
    public String toString() {
        return ("Player Id: " + ID + ", Name: " + Name);
    }

    public void show() {
        System.out.println(this);
        System.out.println("Cards in hand:");
        GetCardsinHand();
        System.out.println();
    }

    public void removeCardfromHand(UnoCard card) {
        CardsinHand.remove(card);
    }
}

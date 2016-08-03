/* MODEL */
package Uno;

/**
 *
 * @author E0015359
 */
public class UnoCard {         //Ref: ClubManager
    private String cardColor;
    private String cardType;
    private int cardScore;
    private String cardImage;

    public UnoCard(String cardColor, String cardType, int cardScore, String cardImage) {
        this.cardColor = cardColor;
        this.cardType = cardType;
        this.cardScore = cardScore;
        this.cardImage = cardImage;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardScore() {
        return cardScore;
    }

    public void setCardScore(int cardScore) {
        this.cardScore = cardScore;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    @Override
    public String toString() {
        return "UnoCard{" + "cardColor=" + cardColor + ", cardType=" + cardType + ", cardScore=" + cardScore + ", cardImage=" + cardImage + '}';
    }

}

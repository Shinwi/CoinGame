package model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import org.tinylog.Logger;

public class Coin {

    private final CoinType type;

    private final ObjectProperty<Position> position = new SimpleObjectProperty<>();

    /**
     * @param type type of the coin
     * @param position position of the coin on the board
     * */
    public Coin(CoinType type, Position position){
        this.type = type;
        this.position.set(position);
    }

    /**
     * @return type of the coin
     * */
    public CoinType getType(){
        return type;
    }

    /**
     * @return position of the coin
     * */
    public Position getPosition(){
        return position.get();
    }

    /**
     * Receives a direction as a parameter and moves the coin to it.
     *
     * @param direction the direction the coin should move in
     * */
    public void transferTo(Direction direction){
        Position newPosition = position.get().moveTo(direction);
        position.set(newPosition);
    }

    public String toString(){
        return type.toString()+ position.get().toString();
    }

    public static void main(String[] args) {
        Coin coin = new Coin(CoinType.RED, new Position(1,1));
        Logger.debug(coin);
        coin.transferTo(CoinMoves.RIGHT);
        Logger.debug(coin);
    }

}

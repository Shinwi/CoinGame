package model;

import java.util.HashSet;
import java.util.StringJoiner;

public class GameBoardModel {

    public static int BOARD_SIZE = 4;

    private final Coin[] coins;

    /**
     * Creates a {@code GameBoardModel} object that represents
     * the initial state of the board with the coins placed in the middle.
     * */
    public GameBoardModel(){
        this(   new Coin(CoinType.RED, new Position(1,1)),
                new Coin(CoinType.RED, new Position(1,2)),
                new Coin(CoinType.RED, new Position(2,1)),
                new Coin(CoinType.RED, new Position(2,2))   );
    }

    public GameBoardModel(Coin...coins){
        checkCoins(coins);
        this.coins = coins.clone();
    }
    private void checkCoins(Coin[] coins){
        var seen = new HashSet<Position>();
        for(var coin: coins){
            if( !isOnBoard(coin.getPosition()) || seen.contains(coin.getPosition())){
                throw new IllegalArgumentException();
            }
            seen.add(coin.getPosition());
        }
    }

    public static boolean isOnBoard(Position position){
        return (position.row()>=0 && position.row()<BOARD_SIZE ) &&
                (position.row()>=0 && position.row()<BOARD_SIZE);
    }


    public String toString(){
        StringJoiner joiner = new StringJoiner(",","[","]");
        for(var coin: coins){
            joiner.add(coin.toString());
        }
        return joiner.toString();
    }


    public static void main(String[] args) {
        GameBoardModel gameModel = new GameBoardModel();
        System.out.println(gameModel);
    }
}


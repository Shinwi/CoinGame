package model;

public enum CoinMoves implements Direction{

    // a coin can move either Horizontally or Vertically
    RIGHT(0, 1),
    LEFT(0, -1),
    UP(-1,0),
    DOWN(1, 0);



    private final int rowChange;
    private final int colChange;

    CoinMoves(int rowChange, int colChange){
        this.rowChange = rowChange;
        this.colChange = colChange;
    }

    @Override
    public int getRowChange(){
        return rowChange;
    }

    @Override
    public int getColChange() {
        return colChange;
    }

    public static CoinMoves of(int rowChange, int colChange){
        for(var direction: values()){
            if(direction.getRowChange()==rowChange && direction.getColChange()==colChange){
                return direction;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        System.out.println(of(0, 1)); //RIGHT
        System.out.println(of(0, -1)); //LEFT
        System.out.println(of(1, 0));  //DOWN
        System.out.println(of(0, 2));   //IllegalArgExcep
    }

}

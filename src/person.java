



public class person {
    private Space space;
    private int playOrder;  //don't need

    public person(Space space, int playOrder) {
        this.space = space;
        this.playOrder = playOrder;   // don't need
    }

    public Space getPiece(){

        return this.space;
    }
}
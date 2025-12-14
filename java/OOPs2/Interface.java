public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();
    }
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen moves in all directions");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right...");
    }
}


class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal, (only one step)...");
    }
}

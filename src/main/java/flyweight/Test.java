package flyweight;
//Sluzy do zaoszczędzenia pamięci
public class Test {


    public static void main(String[] args) {

        ChessPiece blackPiece = new BlackPiece("Czarny Pionek",7,2);
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa", 8,2);
        ChessPiece whitePiece = new WhitePiece("Biały Pionek",10,6);
        ChessPiece whiteQueen = new WhiteQueen("Biała Krolowa",2,12);

        System.out.println(blackPiece.getColor()==blackQueen.getColor());

        System.out.println(blackPiece.getColor()==whitePiece.getColor());

    }
}

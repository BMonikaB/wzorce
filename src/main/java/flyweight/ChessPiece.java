package flyweight;

public abstract class ChessPiece {


    private String name;
    private int numberPosition;
    private int letterPosition;
    private Color color;

    public Color getColor() {
        return color;
    }

    public ChessPiece(String name, int numberPosition, int letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }



    }


}


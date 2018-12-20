package flyweight;

public class Color {

    private String r;
    private String g;
    private String b;

    public Color(String r, String g, String b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getR() {
        return r;
    }

    public String getG() {
        return g;
    }

    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Color{" + "r='" + r + '\'' + ", g='" + g + '\'' + ", b='" + b + '\'' + '}';
    }
}

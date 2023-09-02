public class Rhombus extends Shape {

    private String name = this.getClass().getName();
    private int borderWidth = 1;
    private String borderColor = "black";
    private double x;
    private double y;
    private double d1;
    private double d2;

    public Rhombus(double x, double y, double d1, double d2) {
        this.x = x;
        this.y = y;
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public int getBorderWidth() {
        return borderWidth;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return d1 * d2 / 2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

}

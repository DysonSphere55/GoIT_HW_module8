public class Square extends Shape {

    private String name = this.getClass().getName();
    private int borderWidth = 1;
    private String borderColor = "black";
    private double x;
    private double y;
    private double side;

    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
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
        return side * 2;
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

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

}

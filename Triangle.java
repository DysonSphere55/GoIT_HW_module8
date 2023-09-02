public class Triangle extends Shape {

    private String name = this.getClass().getName();
    private int borderWidth = 1;
    private String borderColor = "black";
    private double x;
    private double y;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double x, double y, double sideA, double sideB, double sideC) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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
        return 0.5 * (sideA + sideB + sideC);
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

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

}

public class Text implements Drawable {

    private double x;
    private double y;
    private String fontName = "OpenSans";
    private int fontSize = 14;
    private boolean fontBold = false;
    private String textContent;

    public Text(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isFontBold() {
        return fontBold;
    }

    public void setFontBold(boolean fontBold) {
        this.fontBold = fontBold;
    }

    public void insertText(String text) {
            this.textContent = text;
    }
    public void printText() {
        System.out.print(textContent+"\n");
    }

}

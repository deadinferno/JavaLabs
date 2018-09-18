package javalabs.com;

public abstract class ColoredFigure implements Figure{
    String color;

    ColoredFigure(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}

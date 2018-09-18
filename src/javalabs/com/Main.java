package javalabs.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] colors = { "red", "blue", "green"};
        Curcle curcle = new Curcle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        ColoredFigure[] figures = new ColoredFigure() { curcle, square, triangle };

        for (int i = 0; i < 3; i++) {
            ColoredFigure figure = new Curcle();
            figure.setColor(colors[i]);
            System.out.println("Фигура: " + figure.getType() + " | " + "Цвет: " + figure.getColor() + '\n');
        }
    }
}

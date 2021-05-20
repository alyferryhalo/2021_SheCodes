import java.applet.Applet; // доступ к Applet
import java.awt.*; // все, кто живёт в пакете awt

// наследование способностей у Applet
public class Drawing extends Applet {
	// Graphics представляет собой холст, на котором будем рисовать
	public void paint(Graphics canvas){
		canvas.setColor(Color.RED);
		canvas.drawRect(50, 50, 250, 100);
		canvas.setColor(Color.BLUE);
		canvas.fillRect(75, 75, 250, 100);
	}
}

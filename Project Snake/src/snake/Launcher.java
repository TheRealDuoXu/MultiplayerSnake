package snake;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
public class Launcher extends Frame{
static Dimension boardDimension = new Dimension(500,500);
static Snake game = new Snake();
static Launcher launcherFrame = new Launcher();
Launcher (){
	addWindowListener(new WindowAdapter() { // anonimous class
		public void windowClosing(ItemEvent ie) {
			System.exit(0);
		}
	});
	TextField tf = new TextField();
}

public static void main(String args[]) {
	
	game.setSize(boardDimension);
	game.setVisible(true);
	game.setResizable(false); // do not resize window for now
}
}

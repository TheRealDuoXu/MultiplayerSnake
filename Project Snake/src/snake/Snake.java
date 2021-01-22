package snake;
import java.awt.*;
import java.awt.event.*;
public class Snake extends Frame implements KeyListener, Runnable{

	/**
	 * Snake paints the frame, the snake, the board, everything
	 * we will use two windows so we can later on play it online
	 */
	private static final long serialVersionUID = 1L;
	Snake(){
		addWindowListener(new WindowAdapter() {
			public void windowClosing(ItemEvent ie) {
				System.exit(0);
			}
		});
	}
	// Keys listeners
	@Override
	public void keyPressed(KeyEvent ke) {
	}
	@Override
	public void keyReleased(KeyEvent ke) {
		
	}
	@Override
	public void keyTyped(KeyEvent ke) {
		
	}

	@Override
	public void run() {
		
	}

}

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image img;
	public void paint(Graphics g){
		try{
			img=ImageIO.read(new File("2.jpg"));
		}catch(IOException e){
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 250, 200, null);
	}

}

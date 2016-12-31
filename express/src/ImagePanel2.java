import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class ImagePanel2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	Image img;
	public void paint(Graphics g){
		try{
			img=ImageIO.read(new File("1.jpg"));
		}catch(IOException e){
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, 1024, 1024, null);
	}

}

import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args) {
		String fileName = args[0];
		int scalingWidth = Integer.parseInt(args[1]);
		int scalingHeight = Integer.parseInt(args[2]);
		// Reads the input image and creates an empty output image
		Color[][] imageOrignial = Runigram.read(fileName);	
		Color[][] imageScaled = Runigram.scaled(imageOrignial, scalingWidth, scalingHeight);									
		// Creates a canvas for the first image and displays it, pauses, and creates a canvas for the scaled image and displays it.
		Runigram.setCanvas(imageOrignial);
		Runigram.display(imageOrignial);
		StdDraw.pause(3000);
		Runigram.setCanvas(imageScaled);
		Runigram.display(imageScaled);						
	}
}

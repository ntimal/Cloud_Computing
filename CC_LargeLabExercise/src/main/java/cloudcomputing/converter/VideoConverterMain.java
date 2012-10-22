package main.java.cloudcomputing.converter;

/**
 * @author Roshan
 * @author Nidhi
 *
 */
public class VideoConverterMain {
    
	public static final String INPUT_PATH = "C:\\Users\\Roshan\\Downloads\\testI.wmv";
    public static final String OUTPUT_PATH = "C:\\Users\\Roshan\\Downloads\\testO.mov";
	
    public static void main(String[] args) {
		VideoConverter.convertVideo(INPUT_PATH, OUTPUT_PATH);

	}

}


/**
 * 
 */
package main.java.cloudcomputing.converter;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.ToolFactory;

/**
 * @author Roshan
 * @author Nidhi
 *
 */
public class VideoConverter {

	/**
	 * Converts video located in iPath to a video that will be written in oPath.
	 * 
	 * @param iPath path of input file.
	 * @param oPath path of output file.
	 */
	public static void convertVideo(String iPath,String oPath){
		 
		 IMediaReader reader = ToolFactory.makeReader(iPath);
		 reader.addListener(ToolFactory.makeWriter(oPath, reader));
		 while (reader.readPacket() == null);
	}

}

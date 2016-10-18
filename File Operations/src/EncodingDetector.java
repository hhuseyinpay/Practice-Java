import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


//icu4j-58rc.jar have to import to the project
import com.ibm.icu.text.CharsetDetector;
import com.ibm.icu.text.CharsetMatch;

public class EncodingDetector {
	
	
	public String getEncoding(String path) throws Exception {

		String encoding;
		try {
			byte[] bytes = new byte[1024];
			InputStream inputStream = new FileInputStream(new File(path));
			inputStream.read(bytes);
			CharsetDetector charsetDetector = new CharsetDetector();
			charsetDetector.setText(bytes);
			CharsetMatch charsetMatch = charsetDetector.detect();
			encoding = charsetMatch.getName();
			inputStream.close();
		} catch (Exception e) {
			System.out.println("Error: FileOperation > getEncoding()");
			throw e;
		}
		return encoding;
	}

}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ******************************************** READ
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String line;
		try {
			fis = new FileInputStream("**PATH**");
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);

			while ((line = br.readLine()) != null) {
				// operations..
				System.out.println(line);
			}
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

		// ******************************************** WRITE

		List<String> records = new ArrayList<String>();
		FastWriter fw = new FastWriter();
		final double MEG = (Math.pow(1024, 2));

		try {
			fw.writeBuffered(records, 4 * (int) MEG, "FILE NAME");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// ******************************************** Encoding Detect
		
		EncodingDetector ed = new EncodingDetector();
		String coding;
		try {
			coding = ed.getEncoding("**PATH**");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}

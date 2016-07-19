import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MinifyFile {

	public MinifyFile(String aFile) throws IOException {
		
		String home = System.getProperty("user.home");
		String path = home + "/Desktop/";
		File origFile = new File(path + aFile);
		
			BufferedReader br = new BufferedReader(new FileReader(origFile));
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			while ((line = br.readLine()) != null) {
				sb.append(line);	
			}
			
			br.close();
			
			String allLines = sb.toString();
			String[] noWhiteSpace = allLines.split("\\s+");
						
			FileWriter fw = new FileWriter(new File(path + "/miniFile.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < noWhiteSpace.length; i++) {
				bw.write(noWhiteSpace[i]);
			}
			bw.close();
		}

}

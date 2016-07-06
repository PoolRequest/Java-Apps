import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class FileRemover {

	public FileRemover() {
		Scanner input = new Scanner(System.in);
		String decision;
		String path = System.getProperty("user.home");
		File downloads = new File(path + "/Downloads");
		File[] dirFiles = downloads.listFiles();
		String fileName;
		int cutoff = 30;

		System.out.println("The following files in your Downloads folder are over " + cutoff +  " days old: ");

		for(int i = 0; i < dirFiles.length; i++) {
			fileName = dirFiles[i].getName();
			long diff = new Date().getTime() - dirFiles[i].lastModified();
			
			if(diff > cutoff * 24 * 60 * 60 * 1000) 
					System.out.println(fileName);
			
		System.out.println("Do you wish to delete these files?[y/n]");
		decision = input.next();
		if(decision.equals("n"))
			System.exit(0);

		System.out.println("Are you sure? These changes are irreversible[y/n]");
		decision = input.next();

		if(decision.equals("y")) {
			for(i = 0; i < dirFiles.length; i++) {
				
				if(diff > cutoff * 24 * 60 * 60 * 1000) 
						dirFiles[i].delete();
				}
			}
		}
		input.close();
	}
}


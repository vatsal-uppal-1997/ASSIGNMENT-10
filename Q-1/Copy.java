import java.io.*;
import java.util.*;
public class Copy {
	
	private static File f = new File("xyz.txt");
	static {
		
		try {
			if(!f.exists())
				f.createNewFile();
			System.out.println("Path to xyz : "+f.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String []args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("abc.txt")));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
		int i;
		while ( (i = bis.read()) != -1 ) {
			bos.write(i);
		}
		bos.close();
		bis = new BufferedInputStream(new FileInputStream(f));
		while ( (i=bis.read()) != -1 ) {
			System.out.print((char)i);
		}
	}
	
}
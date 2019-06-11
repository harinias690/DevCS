package hhh;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) {
		String p = System.getProperty("user.dir")+"/myfile.txt";
		try(FileOutputStream fos = new FileOutputStream(p);
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(p))){
			String str="This is a newly created file and content is written using output stream";
			byte[] b =str.getBytes();
			fos.write(b);
			File f = new File(p);
			long size = f.length();
			Path path = Paths.get(f.getAbsolutePath());
			System.out.format("Absolute path of the file: %s%nName of the file: %s%n",f.getAbsolutePath(),path.getFileName());
			System.out.println("length of the file: "+size);
			byte[] br = new byte[(int)size];
			int n = bis.read(br);
			System.out.println("Number of bytes read: "+n);
			System.out.format("Characters read: %n%s",new String(br));
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}

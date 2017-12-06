import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Scjp10 {
	public static void main(String[] args) throws IOException {
		File f  = new File("abc.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		File f2 = new File("durga");
		System.out.println(f2.exists());
		f2.mkdirs();
		System.out.println(f2.exists());
		File f3 = new File("durga","kunal.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f3.exists());
		System.out.println(f3.isFile());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());

		String ar[] = f2.list();
		for(String filenme: ar){
			System.out.println(filenme);
		}
		try {
			FileWriter fw = new FileWriter("abc.txt");
			char a1 = 'A';
			fw.write(a1);
			char a2[] = {'a','b','c','d'};
			fw.write(a2);
			String str = "kunal kishor";
			fw.write(str);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader("abc.txt");
			System.out.println(fr.read());
			char []ch2 = new char[(int)(f.length())];
			fr.read(ch2);
			for(char c: ch2){
				System.out.println(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr1 = new FileReader(f);
			int i = fr1.read();
			while(i!= -1){
				System.out.println((char)i);
				i = fr1.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter(new File("abc.txt"))));
		FileReader fr4 = new FileReader("durga/kunal.txt");
		BufferedReader br = new BufferedReader(fr4);
		String line = br.readLine();
		while(line!=null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
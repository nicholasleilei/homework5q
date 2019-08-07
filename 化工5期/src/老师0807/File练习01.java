package ¿œ ¶0807;

import java.io.File;
import java.io.IOException;

public class File¡∑œ∞01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File f = new File("d://aa//bb//ee");
      f.mkdirs();
      f = new File("d://aa//cc");
      f.mkdirs();
      f = new File("d://aa//bb//ee//hh.txt");
      f.createNewFile();
      f = new File("d://aa//bb//ee//ii.jpg");
      f.createNewFile();
      
      
	}

}

package ��ʦ0808;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ���л� {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://aa.aa"));
        Emp e = new Emp(1,"����","n",3000.0);
        
        oos.writeObject(e);
        oos.close();
	}

}

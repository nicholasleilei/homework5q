package ��ʦ0808;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class �����л� {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://aa.aa"));
        Emp  e = (Emp)ois.readObject();
        System.out.println(e);
        ois.close();
	}

}

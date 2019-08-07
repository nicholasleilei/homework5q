package 老师0807;

import java.io.File;
import java.io.IOException;

public class File类 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          File f = new File("d://dd//ee");
          System.out.println(f.isDirectory());
          //f.mkdir();
          //f.mkdirs();//创建文件夹
//          f.createNewFile();//创建文件
//          System.out.println(f.exists());
//          System.out.println(f.canRead());
//          System.out.println(f.canWrite());
//          System.out.println(f.isFile());
//          System.out.println(f.isDirectory());
//          System.out.println(f.getName());
//          System.out.println(f.length());
//          //System.out.println(f.delete());
//          System.out.println(f.lastModified());
//          String[] strs = f.list();//所有文件名数组
//          for(String s:strs) {
//        	  System.out.println(s);
//          }
//          
//          File[] files = f.listFiles();
//          for(File ff:files) {
//        	  System.out.println(ff.getName()+" " +ff.length());
//          }
//        File[] file=  File.listRoots();
//        for(File ff:file) {
//        	System.out.println(ff.getName());
//        }
          f.renameTo(new File("d://aa.ppt"));//jianqie
          
	}

}

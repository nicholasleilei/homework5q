package 刘怡东0718;

import java.util.Scanner;

public class 图片的扩展名 {
public static void main(String[] args) {
	String[] a= {"BMP","GIF","JPG","PNG"};
	Scanner s=new Scanner(System.in);
	System.out.println("请输入图片的拓展名（大写）");
	String b=s.next();
	/*for(int j=0;j<a.length;j++) {
		if(a[j]!=b&&j==a.length-1){
			System.out.println("请输入正确的拓展名");
			break;
	}else {
		if(a[j]==b) {
			System.out.println("可以上传");}
		}}*/
	for(String l:a) {if(l.contentEquals(b)) {System.out.println("1");break;}
	else{continue;}}
}
}

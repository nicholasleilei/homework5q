package ������0717;

public class ����Ժ {
int sum=0;
public void money(����Ժ����[] a) {
	for(����Ժ���� j:a) {
		if(j.age>=65) {
			System.out.println(j.name+"������ס");
		 if(j.sex=="��") {sum+=1000;}else sum+=800;
		}else System.out.println(j.name+"��������ס");
	}
	System.out.println("�ܼ�"+sum+"Ԫ");
}
}

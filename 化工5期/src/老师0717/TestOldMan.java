package ��ʦ0717;

public class TestOldMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OldMan o1 = new OldMan("����",70,"��");
        OldMan o2 = new OldMan("����",60,"Ů");
        OldMan o3 = new OldMan("����",68,"��");
        OldMan o4 = new OldMan("����",75,"Ů");
        OldMan[] oms = {o1,o2,o3,o4};
        
         Family f = new Family();
         System.out.println("���ɷѣ�"+f.comein(oms));
       
	}

}

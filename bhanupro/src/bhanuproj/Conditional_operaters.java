package bhanuproj;

public class Conditional_operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=400;
        int b=800;
        int c=600;
     int result=(a<b)?((b>c)?a:b):((b>a)?c:a);
       int aa=((b>c)?a:b);
       int bb=((b>a)?c:a);
       System.out.println(aa);
       System.out.println(bb);
       System.out.println(result);
       
       
       //conditional operators
       int n=300;
       int m=600;
       int j=250;
    int result1=(n<m)?((m>j)?n:m):((j<m)?m:n);
        int nn=((m>j)?n:m);
        int mm=((j<m)?m:n);
        System.out.println(nn);
        System.out.println(mm);
        System.out.println(result1);
	}

}

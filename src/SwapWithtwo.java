
public class SwapWithtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum = 200; int snum = 300; int tnum=300;
		System.out.println("Berfore Swapping : ");
		System.out.println("fmun :"+fnum +"\t"+"snum : "+snum +"\t"+"tnum :"+tnum);
		
		int temp=0;
		temp=fnum;
		fnum=snum;
		snum= tnum;
		tnum=temp;
		System.out.println("After Swapping : ");
		System.out.println("fmun :"+fnum +"\t"+"snum : "+snum +"\t"+"tnum :"+tnum);
		
		

	}

}

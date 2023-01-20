
public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum = 200; int snum = 300; int tnum= 400;
		System.out.println("Berfore Swapping : ");
		System.out.println("fmun :"+fnum +"\t"+"snum : "+snum +"\t"+"tnum :"+tnum);
		
		fnum = fnum+snum+tnum;
		tnum=fnum-snum-tnum;
		snum=fnum-snum-tnum;
		fnum=fnum-snum-tnum;
		System.out.println("After Swapping : ");
		System.out.println("fmun :"+fnum +"\t"+"snum : "+snum +"\t"+"tnum :"+tnum);
		
	}

}

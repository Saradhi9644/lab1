package COM;

public class PowerOfTwoMain {
	public static void main(String[] args) {
		  System.out.println("267 is power of two : "+powerOfTwoGeneral(32));
		  System.out.println("879 is power of two : "+powerOfTwoGeneral(13));
		 }
		public static boolean powerOfTwoGeneral(int n)
		 {
		  while(n%2==0)
		  {
		   n=n/2;
		  }
		  if(n==1)
		  {
		   return true;
		  }
		  else
		  {
		   return false;
		  }
		 }

}

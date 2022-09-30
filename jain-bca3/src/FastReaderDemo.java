import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastReaderDemo {

	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st==null || !st.hasMoreElements())
				{
					try {
						st = new StringTokenizer(br.readLine());
					}
					catch(IOException e) {
						e.printStackTrace();
					}
				}
				
				return st.nextToken();
			}
		
		int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		long nextLong()
		{
			return Long.parseLong(next());
		}
		
		double nextDouble()
		{
			return Double.parseDouble(next());
		}
		
		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			return str;
		}
		
		}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		/*int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println(sum);
		
		long la = sc.nextLong();
		long lb = sc.nextLong();
		long lsum = la + lb;
		System.out.println(lsum); */
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double sum = a + b;
		System.out.println(sum);
			
	}

}

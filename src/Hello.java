
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 check ( 1 , 1 , 1 );
	}

	/***
	 * 检查一个三角形是否为等边，等腰或者斜角三角形
	 * @param a
	 * @param b
	 * @param c
	 * @return The type of the triangle
	 */
	public static int check ( int a , int b , int c ){
		int maxn = Math.max(Math.max(a,b), c);
		int x[]={a,b,c};
		int pow_sum = 0;
		int min_sum = 0;
		boolean flag = false;
		for ( int i = 0 ; i < x.length ; i++ )
		{
			if( x[i] != maxn || flag ){
				pow_sum += Math.pow(x[i], 2);
				min_sum += x[i];
			}
			if( x[i] == maxn ) flag = true;
		}
		//TODO 如果不能满足两边之和大于第三边，是非法三角形
		if( min_sum <= maxn ) return -1;
		//TODO 如果等边，返回1
		if ( a == b && b == c  ) return 1;
		//TODO 如果等腰，返回2
		if( a== b || b == c || a == c ) return 2;
		//TODO 如果斜角三角形，返回3
		if( Math.pow(maxn, 2) == pow_sum ) return 3;
		//TODO 如果是直角三角形，返回0
		return 0;
	}
}


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 check ( 1 , 1 , 1 );
	}

	/***
	 * ���һ���������Ƿ�Ϊ�ȱߣ���������б��������
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
		//TODO ���������������֮�ʹ��ڵ����ߣ��ǷǷ�������
		if( min_sum <= maxn ) return -1;
		//TODO ����ȱߣ�����1
		if ( a == b && b == c  ) return 1;
		//TODO �������������2
		if( a== b || b == c || a == c ) return 2;
		//TODO ���б�������Σ�����3
		if( Math.pow(maxn, 2) == pow_sum ) return 3;
		//TODO �����ֱ�������Σ�����0
		return 0;
	}
}

package code.code_Maven1;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.analysis.function.Subtract;

public class lang3Use {

    //向数据类型数组中添加元素
	public static int Add(String[] arr,String s)
    {	
    	String[] addArray = ArrayUtils.add(arr, s);
    	return addArray.length;
    }
	
	//向数据类型数组中添加元素
	public static int AddAll(String[] arr,String s1,String s2)
	{	
	    String[] addArray = ArrayUtils.addAll(arr, s1, s2);
	    return addArray.length;
	}
	
	//克隆一个数组
	public static int Clone(String[] arr1,String[] arr2)
	{	
		arr1 = ArrayUtils.clone(arr2);
//		for(int i=0;i<arr1.length;i++)
//			System.out.println(arr1[i]);
		return arr1.length;
	}
	
	//检查一个数据在数组中是否存在
	public static boolean Contains(String[] arr,String s)
    {	
    	boolean con = ArrayUtils.contains(arr, s);
    	return con;
    }

	//往数组中插入元素
	public static String[] Insert(int t,String[] arr,String s)
    {	//String[] Array2 = new String[] {"cc","dd"};
		String[] Array3 = ArrayUtils.insert(t,arr,s);
		return Array3;
    }
	
	//求数组长度
	public static int GetLength(String[] arr)
	{
		int len = ArrayUtils.getLength(arr);
//		System.out.println(len);
		return len;
	}
	
	public static double complex(String[] arr1,String[] arr2)
	{
		int len1 = GetLength(arr1);
		int len2 = GetLength(arr2);
		if(len1 < len2)
		{	arr1 = Insert(1,arr1,"ins");
			for(int i=0;i<arr1.length;i++)
				System.out.println(arr1[i]);
		}
		len1 = GetLength(arr1);
		if(len1 < 4)
			len1 = AddAll(arr1,"ad1","ad2");
		else
			len1 = Add(arr1,"ad1");
		Subtract sub = new Subtract();
		return sub.value(len1, len2);
	}
	
//	public static void main(String[] args) {
	//1
//		String[] Array1 = new String[] {"aaa","bbb","ccc"};
//		String[] Array2 = new String[] {"qqq","www","eee","rrr","ttt"};
//		complex(Array1,Array2);
//	}
}

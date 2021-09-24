import java.util.*;

public class p40 {
	public static void main(String[] args) {
		int end_result = 1;
		int total_len = 0;
		int i = 1;
		int mod = 10;
		while (total_len < 1000000)
		{
			int temp_size = size_of_num(i);
			if((total_len + temp_size) / mod >= 1)
			{
				int place = total_len + temp_size - mod;
				mod *= 10;
				end_result *= find_num_with_place(i,place);
			}
			total_len += temp_size;
			i++;
		}
		System.out.println(end_result);
	}
	
	static int size_of_num(long num)
	{
		long t_num = num;
		int counter = 0;
		while(t_num >= 1)
		{
			t_num/=10;
			counter++;
		}
		return counter;
	}
	
	static int find_num_with_place(int i,int place)
	{
		int res = i;
		while(place > 0)
		{
			res /= 10;
			place--;
		}
		res = res % 10;
		return res;
	}
}
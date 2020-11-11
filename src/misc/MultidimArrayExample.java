package misc;
public class MultidimArrayExample {
	public static void main(String[] args) {
		int[][][] myNumbers = {
				{
					{
						1,2,3
					},
					{
						4,5
					}
				},
				{
					{ 6,7,8},
					{9,0}
				}
		};
		for(int[][] numss : myNumbers) {
			System.out.println(numss);
			for(int[] nums : numss) {
				System.out.println(nums);
				for(int num : nums) {
					System.out.println(num);
				}
			}
		}
	}
}

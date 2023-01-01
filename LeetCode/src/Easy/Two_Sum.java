package Easy;

public class Two_Sum {
	
	public static  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (i != j || nums.length < 3&&nums[i] == nums[j]) {
					if (nums[i] + nums[j] == target) {
						int re[] = { i, j };
						return re;
					}
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int []a= {2,5,5,11};
		int []b= twoSum(a,9);
		
		System.out.println(b[0]+" "+b[1]);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

}

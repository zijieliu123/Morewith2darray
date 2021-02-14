package snippet;

public class more2darray {
	
	public void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	public void arraycreate(int n) {
		
		
		int[][]arr2 = new int[n][n];
		int count = 1;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = count;
				count++;
			}
		}
		
		display(arr2);
		
	}
	
	public void max(int[][] numbers) {
		
		double max = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > max) {
					max = numbers[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}
	
	public void sum(int[][]pro) {
		
		int sum = 0;
		
		for (int i = 0; i < pro.length; i++) {
			for (int j = 0; j < pro[i].length; j++) {
				sum += pro[i][j];
			}
		}
		
	}
	
	
}


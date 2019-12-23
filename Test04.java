class Test04 {
	public static void main(String[] args) {
		int[][] a = new int[4][6];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
					a[i][j] = i + j;
					System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
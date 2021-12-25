public class Mainhead {
	public static void main(String[] args) {
		
		File file = new File( pathname: "Number.csv");
		
		String[] headers = {"Value1", "Value2", "Value3"};
		
		int[][] data = {
			{10, 20, 30},
			{7, 16, 27},
			{23, 34, 41},
		};
		
		AppData appData = new AppData(headers, data);
		
		appData.save(file);
	}
}
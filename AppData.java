/**
* Java Core. Lesson 5
*@autor Sergey Sergeev
*@version 20.12.2021
*/

public class AppData {
	privat String[] headers;
	privat int[][] data;
	
	public AppData(String[] headers, int[][] data) {
		this.headers = headers;
		this.data = data;
	}
	
	public void save(File file) {
		
		try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(file))) {
			bufferedOutputStream.write( str:headers[0] + ";" + headers[1] + ";" + headers[2] + "\n");
			
			for (int i = 0; i < data.length; i++) {				
			    bufferedOutputStream.write( str:data[i][0] + ";" + data[i][1] + ";" + data[i][2] + "\n");
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
}
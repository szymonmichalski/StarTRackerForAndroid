package loadDB;
	import static org.junit.Assert.*;
	import java.io.FileNotFoundException;
	import org.junit.Test;
	
	public class CreateHashTableFromTXTTest1 {

		@Test
		public void test() {
			try {
				
					CreateHashTableFromTXT.main();
					System.out.println("77 "+CreateHashTableFromTXT.STARS_TABLE.get(77));
					System.out.println("76 "+CreateHashTableFromTXT.STARS_TABLE.get(76));		
					System.out.println("star number 1 "+CreateHashTableFromTXT.STARS_TABLE.get(1));	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	}




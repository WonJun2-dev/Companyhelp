import java.io.File;
import java.util.ArrayList;

public class ContractCheck {

	static ArrayList<String> Flist2 = new ArrayList<>();
	
	public static void main(String[] args) { 
		String DirPath = "Z:\\������\\2021����\\2021�� �������� ������ �ܺΰ�� �� ����\\�ܺ� �����Ȳ"; 
		FileDetect(DirPath); 
	}
	
	public static void FileDetect( String DirPath ){
		File path = new File( DirPath ); 
		File[] FList = path.listFiles(); 
		
		
		for( int i = 0; i < FList.length; i++ ){
			if( FList[i].isDirectory() )
				{ 
					Flist2.add(DirPath.concat(FList[i].getName()));
					System.out.println( Flist2.get(i) ); // ������ FullPath ��� 
				}
			else break;
		}
	}
}


//https://sgpassion.tistory.com/331
		
		


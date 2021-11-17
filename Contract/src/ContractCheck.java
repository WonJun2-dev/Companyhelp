import java.io.File;
import java.util.ArrayList;

public class ContractCheck {

	static ArrayList<String> Flist2 = new ArrayList<>();
	
	public static void main(String[] args) { 
		String DirPath = "Z:\\전원준\\2021정산\\2021년 강원본부 부정기 외부계약 및 정산\\외부 계약현황"; 
		FileDetect(DirPath); 
	}
	
	public static void FileDetect( String DirPath ){
		File path = new File( DirPath ); 
		File[] FList = path.listFiles(); 
		
		
		for( int i = 0; i < FList.length; i++ ){
			if( FList[i].isDirectory() )
				{ 
					Flist2.add(DirPath.concat(FList[i].getName()));
					System.out.println( Flist2.get(i) ); // 파일의 FullPath 출력 
				}
			else break;
		}
	}
}


//https://sgpassion.tistory.com/331
		
		


package test3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {
		
		BookListTest test5 = new BookListTest();
		
		// ArrayList로 Book 클래스를 자료형으로 하는 list 객체 생성
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);
		
		test5.saveFile(list);
	
		List<Book> booksList = test5.loadFile();
		
		test5.printList(booksList);

	}// 메인 메소드
	
	// list에 Book 객체를 담는다
	// list.add( 인덱스 번호 , new 자료형( 내용 ) );
	public void storeList(List<Book> list) {
		list.add(0, new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(1, new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(2, new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 0.1));	
	}

	public void saveFile(ArrayList<Book> list) {
		// 입출력스트림 objStream 수업 내용 참조 하세요.
		
		// ObjectOutputStream 를 사용하여 book.dat 파일에 list 저장
		// try with resource 를 사용하여 따로 close 처리없이 예외처리
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			
			// list의 배열크기 만큼 list.get()으로 뽑아온 객체를 저장한다.
			for(int i = 0 ;i<list.size() ; i++) {
				oos.writeObject(list.get(i));
			}
			
			oos.flush();
			System.out.println("객체 저장 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Book> loadFile() {
		
		// list 객체를 초기화 해준다.
		List<Book> list = null;
		
		// ObjectInputStream 를 이용하여 book.dat 파일을 읽어와서 list에 담는다.
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			list = new ArrayList<Book>(); 			
			
			// (Book) 으로 다운 캐스팅 하여 저장
			while(true) {
				list.add((Book)ois.readObject()); // readObject 직렬화 하기 전 객체로 저장하는 메소드
																			// 직렬화 전 객체로 다운 캐스팅을 해줘야 함 = (Book)
			}
			
		} catch (EOFException e) { // EOFException 에러 파일의 끝에 도달 했을 경우 출력하는 에러
														// 더이상 읽어올 데이털가 없을때 나온다. 따라서 데이터가 없을 경우 다 읽어 왔다는 메시지를 출력하게 한다.
			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// list에 담아서 돌려준다
		return list;
	}
	
	private void printList(List<Book> List) {

		// for - each 반복문으로 출력
		for(Book b : List) {
		//	System.out.println(b.toString());
			System.out.printf("할인된 가격 : %d원 \n", (int)(b.getPrice()*(1 - b.getDiscountRate())));
		}
	}

}

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
	public void storeList(List<Book> list) {
		list.add(0, new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(1, new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(2, new Book("객체지향 JAVA8", "금영옥", 30000, "북스홈", 0.1));	
	}

	public void saveFile(ArrayList<Book> list) {
	
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
		List<Book> list =null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			list = new ArrayList<Book>(); 			
			
			while(true) {
				list.add((Book)ois.readObject());
			}
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	private void printList(List<Book> List) {
		 // 리스트에 저장된 객체 정보를 출력한다.
		for(Book b : List) {
			System.out.println(b.toString());
		}
	}

}

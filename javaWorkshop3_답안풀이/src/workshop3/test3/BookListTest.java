package workshop3.test3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class BookListTest {

	public static void main(String[] args) {
		BookListTest test3 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		// Book 객체를 3개 생성하여 리스트에 넣는다.
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
		
		test3.storeList(list);
		// books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다.
		
		test3.saveFile(list);
		 // books.dat 파일로부터 객체들을 읽어서 리스트에 담는다.
		
		List<Book> booksList = test3.loadFile();
		 // 리스트에 저장된 객체 정보를 출력한다.
		
		test3.printList(booksList);
		// 할인된 가격은 booksList 에 기록된 객체 정보를 사용하여
		// getter 로 계산 출력한다.
		// – for each 문을 이용 할 것

	}

	private void storeList(ArrayList<Book> list) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("books.dat"))) {
			// 1. 객체를 하나씩 저장할 때...
			// for(int i = 0 ; i < list.size(); i++) {
			//	out.writeObject(list.get(i));
			// }
			
			// 2. 리스트 째로 저장할 때
			out.writeObject(list);
			
			System.out.println("파일 저장 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void saveFile(ArrayList<Book> list) {
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("books.dat"))) {
			list.removeAll(list);
			
			// 1. 객체 하나씩 가져올 때
			// while(true) {
			// 	list.add((Book)oin.readObject());
			// }
			
			// 2. 객체를 통으로 가져올 때
			list = (ArrayList<Book>)oin.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 save 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private List<Book> loadFile() {
		List<Book> list = new ArrayList<Book>();
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("books.dat"))) {
			list.removeAll(list);
			
			// 1. 객체 하나씩 가져올 때
			// while(true) {
			// 	list.add((Book)oin.readObject());
			// }
			
			// 2. 객체를 통으로 가져올 때
			list = (ArrayList<Book>)oin.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽어오기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	private void printList(List<Book> booksList) {
		// 1. 일반 for문
		/*
		for(int i = 0; i < booksList.size(); i++) {
			System.out.println(booksList.get(i));
			System.out.printf("할인된 가격 : %d원 \n", (int)(booksList.get(i).getPrice()*(1 - booksList.get(i).getDiscountRate())));
		}
		*/
		
		// 2. for-each문
		for(Book bk : booksList) {
			System.out.println(bk);
			System.out.printf("할인된 가격 : %d원 \n", (int)(bk.getPrice()*(1 - bk.getDiscountRate())));
		}
		
		// 3. stream API
		/*
		booksList.forEach(i -> {
			System.out.println(i);
			System.out.printf("할인된 가격 : %d원 \n", (int)(i.getPrice()*(1 - i.getDiscountRate())));
		});
		*/
	}
}

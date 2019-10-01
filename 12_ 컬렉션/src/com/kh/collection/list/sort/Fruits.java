package com.kh.collection.list.sort;

public class Fruits {
		
	private String name;
		private int price;
		
		public Fruits() {
			super();
		}

		@Override
		public String toString() {
			return "Fruits [name=" + name + ", price=" + price + "]";
		}

		public String getName() {
			return name;
		}

		public Fruits(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
}

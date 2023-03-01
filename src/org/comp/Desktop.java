package org.comp;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("Desktop Size is 23 inch");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}

}

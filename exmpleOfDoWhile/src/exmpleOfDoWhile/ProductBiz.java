package exmpleOfDoWhile;

import javax.swing.JOptionPane;

public class ProductBiz {

	public static void main(String[] args) {
		int[] counts = new int[3];
		double total = 0;
		ProductDemo[] products = new ProductDemo[3];
		for (int i = 0; i < counts.length; i++) {
			if(products[i] == null)
				products[i] = new ProductDemo();
			
			String name = JOptionPane.showInputDialog("Pls enter the product name:");
			products[i].setName(name);
			String strPrice = JOptionPane.showInputDialog("Pls enter the price:");
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("Plse enter the quantity");
			counts [i] = Integer.parseInt(strCount);
			total += products[i].getPrice()*counts[i];
		}
		System.out.println("Total Sum");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + "\t\t" + products[i].getPrice());
		}
		System.out.println(total);
	}
}

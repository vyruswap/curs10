package curs10;

import java.io.IOException;
import java.util.Scanner;

public class TestPropertiesLegume {

	public static void main(String[] args) throws IOException {

		PropertiesLegume propLegume = new PropertiesLegume();
		StockLegume stock = new StockLegume();

		Scanner scan = new Scanner(System.in);
		boolean stockLegume = true;
		while (stockLegume) {
			System.out.println("Ce leguma ai vrea sa cumperi?");
			String leguma = scan.next();
			if (stockLegume == stock.verifyStock(leguma)) {
				propLegume.readProperties(leguma);
				break;
			} else {
				System.out.println("Nu vindem aceasta leguma!");
			}

		}
	}
}
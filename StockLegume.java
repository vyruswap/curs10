package curs10;

public class StockLegume {

	String[] legume = { "cartof", "morcov", "varza", "ardei" };
	boolean found = false;

	public boolean verifyStock(String searchedValue) {
		for (String leg : legume) {
			if (leg.contentEquals(searchedValue) || leg.equalsIgnoreCase(searchedValue)) {
				found = true;
				break;
			}
		}
		return found;

	}

}
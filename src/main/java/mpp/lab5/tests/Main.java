package mpp.lab5.tests;

import mpp.lab5.tests.windows.AddressWindow;
import mpp.lab5.tests.windows.CustomerProfileWindow;

public class Main {

	public static void main(String[] args) {
		AddressWindow addWin = new AddressWindow();
		addWin.setVisible(true);
		CustomerProfileWindow custWin = new CustomerProfileWindow();
		custWin.setVisible(true);

	}

}

package com.sevenrmartsupermarket.base;
import org.testng.annotations.DataProvider;

public class DataProviders {
	
ExcelReader excelReader = new ExcelReader();

	@DataProvider (name = "New User Creation")
	public Object [][] DataProviderDeliveryboyUserCreation() {
	return new Object[][] {
		{ "Deliveryboyuser01", "deliveryboy@gmail.com", "1234567890", "XYZ address", "DeliveryUser","Delivey8123" },
		{"Deliveryboyuser02","deliveryboyusers@gmail.com", "8974267181", "ABC address", "Delivery23","Delivery@1"}};
}
	
	@DataProvider (name = "New DeliveryBoy User Creation Data"')
			public Object[][] DataProviderDeliveryboyCreationData() {
			excelReader. setExcelfile("Deliveryboy",
			"Deliveryboy data");
			Object data[][] = excelReader-getMultidimentionalData(3, 6);
			return data;
	}
package testNG.basics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tek.sqa.framework.utilities.ExcelReader;

public class DataProviderWithExcelSheet {

	@Test(dataProvider = "informationData")
	public void test(String nameValue, String emailValue, String cityValue, String stateValue, Object zipCodeValue) {
		System.out.println(nameValue + " Name From Excel");
		System.out.println(emailValue + " email From Excel");
		System.out.println(cityValue + " City From Excel");
		System.out.println(stateValue + " state From Excel");
		String zip = String.valueOf(zipCodeValue);
		System.out.println(zip.substring(0, zip.length()-2) + " Zipcode From Excel");

	}

	@DataProvider(name = "informationData")
	public Object[][] getData() throws IOException {
		// Path to Excel File
		String excelFilePath = ".\\src\\test\\resources\\testData\\userInformation.xlsx";
		List<Map<String, Object>> data = ExcelReader
				.readSheetWithFirstRowAsHeader(ExcelReader.getExcelSheet(excelFilePath, 0));
		Object[][] object = new Object[data.size()][data.get(0).size()];
		for (int i = 0; i < object.length; i++) {
			object[i][0] = data.get(i).get("name");
			object[i][1] = data.get(i).get("email");
			object[i][2] = data.get(i).get("city");
			object[i][3] = data.get(i).get("state");
			object[i][4] = data.get(i).get("zipcode");
		}
		return object;

	}

}

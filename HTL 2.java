package belalakht;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class selenium {
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver");
		driver.get("https://mcsuite.nic.in/htlmcd/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("name-login")).sendKeys("8227985830");


		WebElement loginButton = driver.findElement(By.className("btn-success"));

		// Perform an action, such as clicking the button
		loginButton.click();
		driver.get("https://mcsuite.nic.in/htlmcd/web/citizen/info");

		  
		WebElement applyButton = driver.findElement(By.className("sidebar-link"));


		applyButton.click();
		driver.get("https://mcsuite.nic.in/htlmcd/web/citizen/htl/applyNew?requesttype=NEW");




		//Find the dropdown element by its ID, class, or XPath


		WebElement firstDropdown = driver.findElement(By.id("select2-tradeClassificationGuid-container"));
		//Click on the first dropdown to open it
		firstDropdown.click();

		//Locate the specific option within the first dropdown by its text and click on it
		//WebElement option1 = driver.findElement(By.xpath("//li[contains(text()='Entertainment and Recreational']")); // Replace 'Option 1' with your desired option text
		//option1.click();



		WebElement optionElement = driver.findElement(By.xpath("//li[contains(text(),'Hawking articles through')]"));
		optionElement.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		WebElement optionElement5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()='Ice Cream Trolly']")));

		//Perform actions on the second dropdown option, if found
		if (optionElement5 != null) {
			optionElement5.click();
		System.out.println("Clicked on the second dropdown option: Option A");
		} else {
		System.out.println("Second dropdown option not found.");
		}

			
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));




		try {
		    // Wait briefly to ensure page and elements are loaded
		    Thread.sleep(2000);

		    // Open the dropdown menu
		    WebElement dropdown = driver.findElement(By.id("select2-specialPermit-container"));
		    dropdown.click();

		    // Wait for the "No" option to become visible and clickable
		    WebElement noOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//li[contains(text(), 'No')]")
		    ));

		    // Attempt to click on the "No" option
		    try {
		        noOption.click();
		        System.out.println("Successfully selected the 'No' option.");
		    } catch (Exception e) {
		        // JavaScript fallback in case regular click fails
		        System.out.println("Direct click failed. Attempting JavaScript click.");
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();", noOption);
		    }

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		} finally {
			

		WebElement dropdownElement = driver.findElement(By.id("licenseRequiredPeriod"));

		//Create a Select object for the dropdown element
		Select dropdown = new Select(dropdownElement);

		//Select an option by its value
		dropdown.selectByValue("2"); 








		WebElement inputElement = driver.findElement(By.id("firstName"));

		//Send keys to the input element to enter text
		inputElement.sendKeys("AMIT");

		WebElement inputElement1 = driver.findElement(By.id("lastName"));

		//Send keys to the input element to enter text
		inputElement1.sendKeys("Prajapati");



		WebElement inputElement2 = driver.findElement(By.id("fatherName"));

		//Send keys to the input element to enter text
		inputElement2.sendKeys("Jackson Prajapati");



		WebElement inputElement3 = driver.findElement(By.id("emailId"));

		//Send keys to the input element to enter text
		inputElement3.sendKeys("Rupa.Prajapati@gmail.com");





		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Dropdown12=driver.findElement(By.id("select2-gender-container"));
		Dropdown12.click();
		WebElement optionElement4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-gender-container']//following::li[contains(text(), 'FEMALE')]")));
		optionElement4.click();









		WebElement inputElement4 = driver.findElement(By.id("mobileNo"));

		//Send keys to the input element to enter text
		inputElement4.sendKeys("8227096830");




		WebElement uploadElement = driver.findElement(By.id("applicatPhotographMulti"));

		//Provide the file path to the file input element
		uploadElement.sendKeys("C:\\Users\\Dell\\Pictures\\Screenshots\\HTL 2\\may\\send.png");




		WebElement inputElement5= driver.findElement(By.id("designation"));

		//Send keys to the input element to enter text
		inputElement5.sendKeys("tester");





		WebElement inputElement6= driver.findElement(By.id("voterAadhaar"));

		//Send keys to the input element to enter text
		inputElement6.sendKeys("tester");







		WebElement inputElement7= driver.findElement(By.id("applHno"));

		//Send keys to the input element to enter text
		inputElement7.sendKeys("H.no1234");


		WebElement uploadElement1 = driver.findElement(By.id("eCartPhotographMulti"));

		//Provide the file path to the file input element
		uploadElement1.sendKeys("C:\\Users\\Dell\\Pictures\\Screenshots\\HTL 2\\may\\send.png");


		//WebElement dropdownOption1 = driver.findElement(By.id("select2-gender-container"));

		//Select dropdown1 = new Select(dropdownOption1);

		//Select an option by its value
		//dropdown1.selectByValue("Male");

		//Click on the dropdown option to select it
		//dropdownOption1.click();


		WebElement inputElement8= driver.findElement(By.id("applLocality"));

		//Send keys to the input element to enter text
		inputElement8.sendKeys("Street 1234");




		WebElement element = driver.findElement(By.id("select2-applState-container"));
		//Click on the first dropdown to open it
		element.click();




		WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-applState-container']//following::li[contains(text(), 'DELHI')]")));

		//Click on the option
		optionElement1.click();




		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		WebElement dropdown3 = driver.findElement(By.id("select2-applDistrict-container"));
		dropdown3.click();

		WebElement optionElement6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-applDistrict-container']//following::li[contains(text(),'EAST')]")));
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		optionElement6.click();





		WebDriverWait wait99 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate the date input field
		WebElement dateField = driver.findElement(By.xpath("//input[@id='dateOfBirth']"));

		// **Option 1**: Directly Inputting Date Using `sendKeys`
		try {
		    dateField.sendKeys("15/12/2024"); // Enter date in the format required
		} catch (Exception e) {
		    System.out.println("Direct input with sendKeys failed. Trying alternative methods.");
		}

		// **Option 2**: Clicking on Date Picker Calendar UI and Selecting Date
		try {
		    // Click the date field to open the calendar
		    dateField.click();
		    
		    // Wait for the date picker to be visible (you may need to adjust the XPath based on your calendar's structure)
		    WebElement dateToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@data-date='2024-12-15']"))); // Adjust date based on the format used by the picker
		    
		    // Click on the specific date
		    dateToSelect.click();
		} catch (Exception e) {
		    System.out.println("Calendar interaction failed. Trying JavaScript as a fallback.");
		}

		// **Option 3**: Using JavaScript to Set the Date (Fallback)
		try {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("document.getElementById('dateOfBirth').value='15/12/2024';"); // Set date directly
		} catch (Exception e) {
		    System.out.println("JavaScript date setting failed.");
		}

		// Verify that the date was set correctly
		String enteredDate = dateField.getAttribute("value");
		System.out.println("Entered Date: " + enteredDate);


		//Click on the option


		WebElement dropdown2 = driver.findElement(By.id("select2-applColonyGuid-container"));
		dropdown2.click();
		//input[@placeholder='username']
		//Find the option you want to select
		WebElement option2 = driver.findElement(By.xpath("//li[text()='14, RAJPUR ROAD OPP. MCD FLATS, CIVIL LINES,DELHI 54 (REG. NO. 2-LOP)']"));


		option2.click();





		// Explicit wait setup
		WebDriverWait wait101 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate the year input field using the ID
		WebElement yearField = driver.findElement(By.xpath("//input[@id='yearOfEstablishmentForTradeId']"));

		// **Option 1**: Enter the year directly using `sendKeys`
		try {
		    yearField.sendKeys("2024");  // Enter the year you want to set
		} catch (Exception e) {
		    System.out.println("Direct input with sendKeys failed. Trying JavaScript.");
		}

		// **Option 2**: Using JavaScript to Set the Value if `sendKeys` Doesn't Work
		try {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("document.getElementById('yearOfEstablishmentForTradeId').value='2024';");  // Set year directly
		} catch (Exception e) {
		    System.out.println("JavaScript date setting failed.");
		}

		// Verify that the year was set correctly
		String enteredYear = yearField.getAttribute("value");
		System.out.println("Entered Year: " + enteredYear);



		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement inputElement9= driver.findElement(By.id("applPincode"));

		//Send keys to the input element to enter text
		inputElement9.sendKeys("110044");


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		WebElement dropdown4 = driver.findElement(By.id("select2-sourceOfWaterGuidForTrade-container"));
		dropdown4.click();
		WebElement optionElement51 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Delhi Jal Board (DJB)')]")));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

		optionElement51.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		WebElement dropdown5 = driver.findElement(By.id("select2-methodOfDisposingGuidForTrade-container"));
		dropdown5.click();
		WebElement optionElement52 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'NOT APPLICABLE')]")));
		//WebDriverWait wait52 = new WebDriverWait(driver, Duration.ofSeconds(10));
		optionElement52.click();

		WebElement dropdown6= driver.findElement(By.id("select2-methodOfServingGuidForTrade-container"));
		dropdown6.click();
		WebElement optionElement53 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'NOT APPLICABLE')]")));
		//WebDriverWait wait52 = new WebDriverWait(driver, Duration.ofSeconds(10));
		optionElement53.click();



		WebElement inputElementt= driver.findElement(By.id("tradeUnitShopId"));

		//Send keys to the input element to enter text
		inputElementt.sendKeys("hira sweet");



		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement inputElement11= driver.findElement(By.id("tradePanNumberId"));

		//Send keys to the input element to enter text
		inputElement11.sendKeys("ABCDW1234M");








		WebElement inputElement12= driver.findElement(By.id("tradeGstNumberId"));

		//Send keys to the input element to enter text
		inputElement12.sendKeys("22AAAAA0000A1Z5");


		WebElement inputElement13= driver.findElement(By.id("drivingLicenseNo"));

		//Send keys to the input element to enter text
		inputElement13.sendKeys("DL4862849fg");



		WebElement inputElement14= driver.findElement(By.id("vehicalRegNo"));

		//Send keys to the input element to enter text
		inputElement14.sendKeys("DL4862849f");



		WebElement inputElement15= driver.findElement(By.id("noOfCart"));

		//Send keys to the input element to enter text
		inputElement15.sendKeys("2");






		WebElement inputElement16= driver.findElement(By.id("ecartLength"));

		//Send keys to the input element to enter text
		inputElement16.sendKeys("2");






		WebElement inputElement17= driver.findElement(By.id("ecartWidth"));

		//Send keys to the input element to enter text
		inputElement17.sendKeys("2");




		WebElement inputElement18= driver.findElement(By.id("ecartHeight"));

		//Send keys to the input element to enter text
		inputElement18.sendKeys("2");


		WebElement inputElement19= driver.findElement(By.id("parkingSite"));

		//Send keys to the input element to enter text
		inputElement19.sendKeys("fddf");	
			



		try {
		    // Click on the dropdown to open it
		    WebElement dropdown7 = driver.findElement(By.id("select2-isHandlerEwsCategory-container"));
		    dropdown7.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement54 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-isHandlerEwsCategory-container']//following::li[contains(text(),'NO')]")));

		    // Click on the option
		    optionElement54.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
			
		try {
		    // Click on the dropdown to open it
		    WebElement dropdown8 = driver.findElement(By.id("select2-isMemberDieToCovid-container"));
		    dropdown8.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-isMemberDieToCovid-container']//following::li[contains(text(),'NO')]")));

		    // Click on the option
		    optionElement55.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}
				
			
			
		try {
		    // Click on the dropdown to open it
		    WebElement dropdown8 = driver.findElement(By.id("select2-isTakenNoc-container"));
		    dropdown8.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-isTakenNoc-container']//following::li[contains(text(),'NO')]")));

		    // Click on the option
		    optionElement55.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}	
			
			


		try {
		// Click on the dropdown to open it
		WebElement dropdown8 = driver.findElement(By.id("select2-isFoodHandlerMedChecked-container"));
		dropdown8.click();

		// Add a brief wait to ensure the options are displayed
		Thread.sleep(2000);

		// Use explicit wait to find the option with text "yes"
		WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-isFoodHandlerMedChecked-container']//following::li[contains(text(),'NO')]")));

		// Click on the option
		optionElement55.click();

		} catch (Exception e) {
		System.out.println("An error occurred: " + e.getMessage());
		}	
			
		WebElement inputElement60= driver.findElement(By.id("footTypeDescription"));

		//Send keys to the input element to enter text
		inputElement60.sendKeys("testy food make");	
			
			
		try {
		    // Click on the dropdown to open it
		    WebElement dropdown8 = driver.findElement(By.id("select2-isFoodProtctedFromDustAndFlies-container"));
		    dropdown8.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-isFoodProtctedFromDustAndFlies-container']//following::li[contains(text(),'NO')]")));

		    // Click on the option
		    optionElement55.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}	
			

		try {
		    // Click on the dropdown to open it
		    WebElement dropdown8 = driver.findElement(By.id("select2-servingMethod-container"));
		    dropdown8.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-servingMethod-container']//following::li[contains(text(),'BIODEGRABLE DISPOSABLE')]")));

		    // Click on the option
		    optionElement55.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}	
			
			

		try {
		    // Click on the dropdown to open it
		    WebElement dropdown8 = driver.findElement(By.id("select2-disposingWaste-container"));
		    dropdown8.click();

		    // Add a brief wait to ensure the options are displayed
		    Thread.sleep(2000);

		    // Use explicit wait to find the option with text "yes"
		    WebElement optionElement55 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select2-disposingWaste-container']//following::li[contains(text(),'DUSTBIN (PLACED AT CART)')]")));

		    // Click on the option
		    optionElement55.click();

		} catch (Exception e) {
		    System.out.println("An error occurred: " + e.getMessage());
		}	
			

			WebElement  Element66=driver.findElement(By.xpath("//input[@id='streetName']"));
			Element66.sendKeys("belal is great");
			
			
			WebElement Element67=driver.findElement(By.xpath("//input[@id='locality']"));
			Element67.sendKeys("gggg1234");
			
			
			try {
			    // Click on the dropdown to open it
			    WebElement dropdown8 = driver.findElement(By.id("select2-areaTypeGuid-container"));
			    dropdown8.click();

			    // Use explicit wait to find and click the option with text "INDUSTRIAL"
			    WebElement optionElement55 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(
			        ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class, 'select2-results__options')]//li[contains(text(), 'INDUSTRIAL')]"))
			    );

			    optionElement55.click();

			} catch (Exception e) {
			    System.out.println("An error occurred: " + e.getMessage());
			    
			    
			}
			    
			    

			    
			    try {
			    	Thread.sleep(1000);

				    WebElement dropdown66 = driver.findElement(By.id("select2-districtGuid-container"));
				    dropdown66.click();

				    WebElement optionElement44 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='select2-districtGuid-container']//following::li[contains(text(),'EAST')]")));
				    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				    optionElement44.click();
			    } catch (Exception i) {
				    System.out.println("An error occurred: " + i.getMessage());
				    

			    }
		WebElement Element77=driver.findElement(By.id("pincode"));
		Element77.sendKeys("110044");



		WebElement dropdown78 = driver.findElement(By.id("select2-colonyGuid-container"));
		dropdown78.click();
		//input[@placeholder='username']
		//Find the option you want to select
		WebElement option78 = driver.findElement(By.xpath("//li[text()='14, RAJPUR ROAD OPP. MCD FLATS, CIVIL LINES,DELHI 54 (REG. NO. 2-LOP)']"));


		option78.click();
		    



		WebElement uploadElement11 = driver.findElement(By.id("docupload_1"));

		//Provide the file path to the file input element
		uploadElement11.sendKeys("D:\\New folder (4)\\ashk.pdf");
		  


		WebElement uploadElement12 = driver.findElement(By.id("docupload_2"));

		//Provide the file path to the file input element
		uploadElement12.sendKeys("D:\\New folder (4)\\ashk.pdf");


		WebElement radiobuttom1=driver.findElement(By.id("check"));
		radiobuttom1.click();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		driver.get("https://mcsuite.nic.in/htlmcd/web/citizen/htl/htlPaymentBean?dI=59844ab5-ff95-4bbc-b41e-bf46830d5624&uhg=true");
			}
			} 
			
		}


package org.adactinpage;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step0 extends Base0
{
	Pojo0 l;
	List<String> asList;
	@Given("Adactinloginpage")
	public void adactinloginpage() 
	{
		launchBrowser("https://adactinhotelapp.com/");
	}

	@When("user entered username and password user click login button navigate search hotel page")
	public void user_entered_username_and_password_user_click_login_button_navigate_search_hotel_page(DataTable dataTable) 
	{
		l = new Pojo0();
	    asList = dataTable.asList();
		String uname = asList.get(0);
		String upass = asList.get(1);
		
		toSendKeys(l.getUserid(), uname);
		toSendKeys(l.getPass(), upass);
		toClick(l.getBtnlogin());
		
	   
	}

	@When("user choose Hotellocation,HotelName,RoomType,NumberOfRooms,CheckInDate,CheckOutDate,Adult,Children")
	public void user_choose_Hotellocation_HotelName_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_Adult_Children(DataTable dataTable) 
	{
		 asList = dataTable.asList();
		 String loc = asList.get(0);
		 String name = asList.get(1);
		 String roomtype = asList.get(2);
		 String noroom = asList.get(3);
		 String checkin = asList.get(4);
		 String checkout = asList.get(5);
		 String adult = asList.get(6);
		 String child = asList.get(7);
		 
		 toSelectByVlaue(l.getLocation(), loc);
		 toSelectByVlaue(l.getHotelname(), name);
		 toSelectByVlaue(l.getRoom(), roomtype);
		 toSelectByVlaue(l.getNoofrooms(), noroom);
		 l.getCheckin().clear();
		 toSendKeys(l.getCheckin(), checkin);
		 l.getCheckout().clear();
		 toSendKeys(l.getCheckout(), checkout);
		 toSelectByVlaue(l.getAdult(), adult);
		 toSelectByVlaue(l.getChild(), child);
	}

	@When("user click search button user go to next page")
	public void user_click_search_button_user_go_to_next_page() 
	{
		toClick(l.getBtnsearch());
	}

	@When("user choose hotel and click continue button go to payment page")
	public void user_choose_hotel_and_click_continue_button_go_to_payment_page() 
	{
		toClick(l.getBtnradio());
		toClick(l.getBtncontinue());
	}

	@When("user enter FirstName,LastName,Address,CreditCardNum,CreditCardType,ExpiryMonth,ExpiryYear,CvvNum")
	public void user_enter_FirstName_LastName_Address_CreditCardNum_CreditCardType_ExpiryMonth_ExpiryYear_CvvNum(DataTable dataTable) 
	{
		asList = dataTable.asList();
		 String fname = asList.get(0);
		 String lname = asList.get(1);
		 String address = asList.get(2);
		 String ccnum = asList.get(3);
		 String cctype = asList.get(4);
		 String expmonth = asList.get(5);
		 String expyear = asList.get(6);
		 String cvv = asList.get(7);
		 
		 toSendKeys(l.getFirstname(), fname);
	     toSendKeys(l.getLastname(), lname);
	     toSendKeys(l.getAddress(), address);
		 toSendKeys(l.getCardno(), ccnum);
		 toSendKeys(l.getCardtype(), cctype);
		 toSendKeys(l.getCardexpmn(), expmonth);
		 toSendKeys(l.getCardexpyr(), expyear);
		 toSendKeys(l.getCvv(), cvv);
	}
    @When("user click book now button and user get booking details")
	public void user_click_book_now_button_and_user_get_booking_details() throws InterruptedException
    {
    	toClick(l.getBtnbook());
        Thread.sleep(5000);
    	
    	
    }

	@Then("user have valid credenttials page")
	public void user_have_valid_credenttials_page() throws InterruptedException 
	{
	    
	    if(driver.getCurrentUrl().contains("https://adactinhotelapp.com/BookingConfirm.php"))
    	{
    		System.out.println("Success....");
    	}
	    else
	    {
	    	System.out.println("Not Success....");
	    }
	    
	}



}

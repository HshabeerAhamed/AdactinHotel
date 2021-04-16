$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/New.feature");
formatter.feature({
  "name": "To validate Login Function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Adactinloginpage",
  "keyword": "Given "
});
formatter.match({
  "location": "Step0.adactinloginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered username and password user click login button navigate search hotel page",
  "rows": [
    {
      "cells": [
        "Hshabeer",
        "654321"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step0.user_entered_username_and_password_user_click_login_button_navigate_search_hotel_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose Hotellocation,HotelName,RoomType,NumberOfRooms,CheckInDate,CheckOutDate,Adult,Children",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "2",
        "30/04/2021",
        "30/04/2021",
        "2",
        "2"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Step0.user_choose_Hotellocation_HotelName_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_Adult_Children(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button user go to next page",
  "keyword": "And "
});
formatter.match({
  "location": "Step0.user_click_search_button_user_go_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose hotel and click continue button go to payment page",
  "keyword": "And "
});
formatter.match({
  "location": "Step0.user_choose_hotel_and_click_continue_button_go_to_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter FirstName,LastName,Address,CreditCardNum,CreditCardType,ExpiryMonth,ExpiryYear,CvvNum",
  "rows": [
    {
      "cells": [
        "shabeer",
        "ahamed",
        "MedavakkamChennai600100",
        "987654321987654321",
        "Visa",
        "November",
        "2021",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Step0.user_enter_FirstName_LastName_Address_CreditCardNum_CreditCardType_ExpiryMonth_ExpiryYear_CvvNum(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book now button and user get booking details",
  "keyword": "And "
});
formatter.match({
  "location": "Step0.user_click_book_now_button_and_user_get_booking_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have valid credenttials page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step0.user_have_valid_credenttials_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
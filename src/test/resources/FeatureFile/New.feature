Feature: To validate Login Function

Scenario: Validate Login Functionality
  
   Given  Adactinloginpage
   When   user entered username and password user click login button navigate search hotel page
          |Hshabeer|654321|
   And    user choose Hotellocation,HotelName,RoomType,NumberOfRooms,CheckInDate,CheckOutDate,Adult,Children
                      |Sydney       |Hotel Creek|Standard|2         |30/04/2021 |30/04/2021  |2     |2      |
   And    user click search button user go to next page
   And    user choose hotel and click continue button go to payment page
   And    user enter FirstName,LastName,Address,CreditCardNum,CreditCardType,ExpiryMonth,ExpiryYear,CvvNum
                    |shabeer  |ahamed  |MedavakkamChennai600100|987654321987654321|Visa  |November |2021     |456   |
   And    user click book now button and user get booking details
   Then   user have valid credenttials page
   
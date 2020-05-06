Feature:MyntraCouponsEndToEnd

Background:
Given Open browser And enter url 
Then Enter email and password from path
Then click on login
Scenario: MyntraCouponsEndToEnd
Then Select essentials
Then Select applians
Then Select a product
Then Add to bag
Then Select size
Then Open bag click on apply coupons
Then Enter coupon code And Click on apply
Then Click on place order
Then User select address
Then User select payment method
Then close the browser
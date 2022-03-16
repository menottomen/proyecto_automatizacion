require "selenium-webdriver"

# TEST: Sign up for blog
driver = Selenium::WebDriver.for :firefox
driver.navigate.to "https://selenium-blog.herokuapp.com/signup"

username_field= driver.find_element(id: "user_username")
username_field.send_keys("userotto")

email_field= driver.find_element(id: "user_email")
email_field.send_keys("emailotto@test.com")

password_field= driver.find_element(id: "user_password")
password_field.send_keys("password1234")

submit_button= driver.find_element(id: "submit")
submit_button.click


driver.quit
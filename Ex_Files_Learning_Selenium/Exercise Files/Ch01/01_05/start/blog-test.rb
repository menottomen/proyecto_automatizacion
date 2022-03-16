require "selenium-webdriver"
require "rspec"

# TEST: sign up for blog
describe "Blog application" do
	describe "singup to the blob application" do
		it "cinfirm that a user can successfully singup" do
			driver = Selenium::WebDriver.for :firefox
			# Go to signup form
			driver.navigate.to "https://selenium-blog.herokuapp.com/signup"

			# Fill out and submit form
			username_field= driver.find_element(id: "user_username")
			username_field.send_keys("userotto")

			email_field= driver.find_element(id: "user_email")
			email_field.send_keys("emailotto@test.com")

			password_field= driver.find_element(id: "user_password")
			password_field.send_keys("password1234")

			submit_button= driver.find_element(id: "submit")
			submit_button.click

			# Confirm user is signed up successfully
			banner=driver.find_element(id: "flash_success")
			banner_text=banner.text
			expect(banner_text).to eq("Welcome to the alpha blog userotto")

			driver.quit
		end
	end
end 
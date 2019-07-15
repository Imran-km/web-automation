from selenium import webdriver


driver = webdriver.Chrome("C:/Users/38223/Downloads/Softwares/chromedriver/chromedriver.exe")
driver.get('https://www.facebook.com/')
print("Opened facebook")

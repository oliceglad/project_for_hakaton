from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from bs4 import BeautifulSoup
import lxml

address = input()
url = f"https://www.google.com/maps/search/{address}"

driver = webdriver.Chrome()

try:
    driver.get(url = url)
    soup = BeautifulSoup(driver.page_source, 'lxml')

    metatags = soup.findAll('meta')
    metatags = list(metatags)
    meta_coor = str(metatags[9])
    meta_coor = meta_coor.replace('?center=', ' ', 1)
    meta_coor = meta_coor.replace('&amp;', " ", 1)
    meta_coor = meta_coor.replace("%2C", " ", 1)
    meta_coor = meta_coor.split()
    coor_list = [meta_coor[i] for i in range(2,4)]
    print(coor_list)
except Exception as ex:
    print(ex)
finally:
    driver.close()
    driver.quit()

from selenium import webdriver
from selenium.webdriver.common.by import By
import time
from bs4 import BeautifulSoup
import lxml

# url = "https://passport.yandex.ru/auth?origin=realty_moscow&retpath=https%3A%2F%2Fsso.passport.yandex.ru%2Fpush%3Fretpath%3Dhttps%253A%252F%252Frealty.ya.ru%252Fmoskva%252Fkupit%252Fkvartira%252Fdvuhkomnatnaya%252F%26uuid%3D05c3f67f-1d9f-4e5a-9f73-e1f59c44438d"
# url = "https://www.russianrealty.ru/%D0%9F%D1%80%D0%BE%D0%B4%D0%B0%D0%B6%D0%B0-%D0%BA%D0%B2%D0%B0%D1%80%D1%82%D0%B8%D1%80-%D0%B2-%D0%BD%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D1%80%D0%BE%D0%B9%D0%BA%D0%B5/?c=1&r=82&a=100&p=100&n=1&ns=100,300&bt=40"
f = open(r"tempParsFile.txt", 'r')
url = f.read()

driver = webdriver.Chrome()

try:
    driver.get(url=url)
    time.sleep(5)

    soup = BeautifulSoup(driver.page_source, 'lxml')

    all_price = soup.findAll('div', class_='price')
    all_price = list(all_price)
    price_list = []
    for item in all_price:
        item = str(item)
        price_list.append(item[33:42])

    print(price_list)

    textsquaresplit = soup.findAll('div', class_='inner-top')
    textsquaresplit = list(textsquaresplit)
    textsquare_list = []
    kitchensquare_list = []
    for item in textsquaresplit:
        item = str(item)
        item = item.split()
        textsquare_list.append(item[5].split('/')[0])
        kitchensquare_list.append(item[5].split('/')[2])

    print(textsquare_list)
    print(kitchensquare_list)

    metrosplit = soup.findAll('div', class_='path')
    metrosplit = list(metrosplit)
    metro_list = []
    for item in metrosplit:
        item = str(item)
        item = item.split()
        metro_list.append(item[4][6:])

    print(metro_list)

    stagessplit1 = soup.findAll('li', 'stage')
    stagessplit1 = list(stagessplit1)
    stage_list = []
    for item in stagessplit1:
        item = str(item)
        stage_list.append(item[25:27])

    print(stage_list)


except Exception as ex:
    print(ex)
finally:
    driver.close()
    driver.quit()

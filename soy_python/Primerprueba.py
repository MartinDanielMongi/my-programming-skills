import requests
from chalice import Chalice

app = Chalice(app_name="helloword")


params = {"symbol": "BTC"}
header = {
    "X-CMC_PRO_API_KEY": "349631cc-b3ad-48d5-8909-2f9a29d389a9",
    "Accept": "application/json",
}

body = {}

URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest"
response = requests.get(url=URL, params=params, headers=header)
response = response.json()
print(response["data"]["BTC"]["quote"]["USD"]["price"])
# pip install pylint  (pylint .)
# pip intall black  (black .)
# pip install chalice ()

from chalice import Chalice
import requests

app = Chalice(app_name="api")


@app.route("/")
def index():
    params = {"symbol": "BTC"}
    header = {
        "X-CMC_PRO_API_KEY": "349631cc-b3ad-48d5-8909-2f9a29d389a9",
        "Accept": "application/json",
    }

    body = {}

    URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest"
    response = requests.get(url=URL, params=params, headers=header)
    response = response.json()
    return response["data"]["BTC"]["quote"]["USD"]["price"]



# pip install pylint  (pylint .)
# pip intall black  (black .)
# pip install chalice ()
# pip install aws

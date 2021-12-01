from coinex.coinex import CoinEx
from somewhere_else import access_id, secret

coinex = CoinEx(access_id, secret)

# public API
def get_market_list()
    return coinex.market_list()

# private API
def get_balance_info()
coinex.balance_info()

def get_balance_coin_withdraw(coin_name, wallet_id, amount)
coinex.balance_coin_withdraw(coin_name, wallet_id, amount)

def get_order_limit(coin_name, type, amount, price)
coinex.order_limit(coin_name, type, amount, price)

def get_order_market(coin_name, type, amount)
coinex.order_market(coin_name, type, amount)

def get_order_mining_difficulty()
coinex.order_mining_difficulty()
import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    df1=customers.merge(orders,how='left', left_on='id',right_on='customerId')
    df1['Customers']=df1[df1['customerId'].isnull()][['name']]
    return df1[df1['Customers'].isnull()==False][['Customers']]

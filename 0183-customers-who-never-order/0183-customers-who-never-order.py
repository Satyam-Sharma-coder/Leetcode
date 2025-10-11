import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    df1=customers.merge(orders,how='left', left_on='id',right_on='customerId')
    df2=df1[df1['customerId'].isnull()]
    return df2[['name']].rename(columns={'name': 'Customers'})

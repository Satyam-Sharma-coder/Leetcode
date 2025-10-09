import pandas as pd
import numpy as np

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    return world[(world['area']>=3000000) | (world['population']>=25000000)][['name','population','area']]
    
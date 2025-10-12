import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    return views[views['author_id']==views['viewer_id']][['viewer_id']].drop_duplicates().rename(columns={'viewer_id':'id'}).sort_values('id')
    
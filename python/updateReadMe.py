import pandas as pd


def merge(row):
    return f'({row["LQ Qno."]})[{row["Solution"]}]'


data = pd.read_excel("LC.xlsx")
data["link"] = data.apply(merge, axis=1)
data = data.values.tolist()
for item in data:
    print(item)

import pandas as pd


def merge(row):
    return f'({row["LQ Qno."]})[{row["Solution"]}]'


data = pd.read_excel("LC.xlsx")
data["Solution"] = data["Solution"].fillna("")
data["Notes"] = data["Notes"].fillna("")
data["link"] = data.apply(merge, axis=1)
print(data.head)
data.to_csv("LCQ.csv")
data = data.values.tolist()
for item in data[:5]:
    print(item)

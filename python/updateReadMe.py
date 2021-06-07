#!/usr/bin/env python
# coding: utf-8

import pandas as pd


def merge(row):
    return f'[Solution]({row["Solution"]})'


def simply(txt):
    txtc = str(txt)
    try:
        txt = txt[len("src/test/java/"):]
        return txt[txt.index("/") + 1:]
    except:
        return txtc


def qmerge(row):
    return f'[{row["LC Qno."]}]({row["Q Link"]})'


def convert_to_readme_txt(row):
    ls = [row[-1], row[2], row[3], row[5], row[-2]]
    return f"{' | '.join(map(str, ls))}"


def get_table():
    return '\n'.join(map(convert_to_readme_txt, data))


data = pd.read_excel("LC.xlsx")
data["Solution"] = data["Solution"].fillna("")
data["Notes"] = data["Notes"].fillna("")
data["link"] = data.apply(merge, axis=1)
data["QLink"] = data.apply(qmerge, axis=1)
data = data.values.tolist()
with open("../README.md", "w") as f:
    string = f'# LeetCodePractice\n\n[![CI Tests](https://github.com/akksshah/LeetCodePractice/actions/workflows' \
             f'/maven.yml/badge.svg)](https://github.com/akksshah/LeetCodePractice/actions/workflows/maven.yml)\n\n## ' \
             f'Table of Contents\n\nLC QNo. | name | Tag | Notes | Solution\n---- | --- | ----  | ---- | ----\n' \
             f'{get_table()} '
    f.writelines(string)

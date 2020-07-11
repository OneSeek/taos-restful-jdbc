package com.taosdata.restfuljdbc.bean;

import java.util.List;

public class Result {
    String status; //status: 告知操作结果是成功还是失败
    List<String> head; //head: 表的定义，如果不返回结果集，仅有一列“affected_rows”
    List<List<String>> data; //data: 具体返回的数据，一排一排的呈现,如果不返回结果集，仅[[affected_rows]]
    String rows; //rows: 表明总共多少行数据
}

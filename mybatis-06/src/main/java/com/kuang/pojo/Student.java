package com.kuang.pojo;

import lombok.Data;

/**
 * @author caoweiquan
 * @date 2021/3/12
 */
@Data
public class Student {
    private int id;
    private String name;
    //多个学生可以是同一个老师，即多对一
    private Teacher teacher;
}

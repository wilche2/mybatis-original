package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author caoweiquan
 * @date 2021/03/08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
// @Alias("uuuu") // 别名
public class User {

    private int id;
    private String name;
    private String pwd;

}

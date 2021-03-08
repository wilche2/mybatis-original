package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author caoweiquan
 * @date 2021/03/08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
// @Alias("uuuu") // 别名
public class User {

    private int id;
    private String name;

    /**
     * 1. password 与数据字段 pwd 不一致，可修改userMapper.xml中的修改sql的，起个别名即可（不推荐）
     * 2. 使用结果 resultMap 集映射（推荐）
     */
    private String password;

}

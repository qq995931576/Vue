package com.achang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/******
 @author 阿昌
 @create 2021-02-17 17:18
 *******
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)//打开链式调用
public class User {
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private String phoneNumber;
}

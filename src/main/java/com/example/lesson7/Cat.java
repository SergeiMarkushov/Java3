package com.example.lesson7;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cat {
    public String name;
    private Integer age;



    private String info(String str, String str2) {
        return str +str2;
    }
    public String info(String str, Integer integer) {
        return str + integer;
    }

}

package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto {

    private String korName;

    @Pattern(regexp = "^[a-zA-Z0-9]+(\\s[a-zA-Z0-9]+)*$",
            message = "워드 사이에 한 칸의 공백(스페이스)만 포함될 수 있습니다.")
    private String engName;

    @Range(min = 100, max = 50000, message = "가격은 1 이상 100 이하의 값이어야 합니다.")
    private Integer price;
}

package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {

    @NotBlank(message = "필수 항목입니다") // null x 공백 x
    //@NotNull(message = "공백") // ""가능, 아예 키값부터 입력을 안할떄 에러
    private String korName;

    @NotBlank(message = "필수 항목입니다")
    @Pattern(regexp = "^[a-zA-Z0-9]+(\\s[a-zA-Z0-9]+)*$",
            message = "워드 사이에 한 칸의 공백(스페이스)만 포함될 수 있습니다.")
    private String engName;

    @Min(value = 100, message = "100 이상 숫자만 허용합니다.")
    @Max(value = 50000, message = " 50000 이하 숫자만 허용합니다.")
    private int price;
}

package com.example.demo.domian;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;

public class Member {

    @NotBlank(message = "name은 필수 값입니다.")
    private String name;

    @NotBlank(message = "email은 필수 값입니다.")
    private String email;

    @Min(value = 18, message = "18살 이상만 입장 가능합니다.")
    private int age;

    @NotNull(message = "금액은 필수 값 입니다.")
    @Min(value = 10000, message = "10000원 이상 소지해야합니다.")
    private Integer money;

    public Member() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Integer getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}

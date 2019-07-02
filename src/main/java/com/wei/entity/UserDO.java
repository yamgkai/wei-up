package com.wei.entity;

/**
 * @author 11613
 */
public class UserDO extends BaseDO {

    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Long getThisId() {
        return this.id;
    }

    public UserDO() {
        System.err.println("userDO 无参构造方法");
    }

    public UserDO(Long id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        System.err.println("---");
    }

    {
        System.err.println("userDO 代码块");
    }

    static {
        System.err.println("userDO 静态代码块");
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
package com.wei.entity;

public class BaseDO {

    private String id;

    private String name;

    {
        id="test";
        System.err.println("baseDO 代码块");

    }

    static {
        System.err.println("baseDO 静态代码块");
    }

    public static void test(){
        System.err.println("baseDO 静态方法 ");
    }

    public BaseDO() {
        System.err.println("baseDO 无参构造方法"+id);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class Ch{

    }
}

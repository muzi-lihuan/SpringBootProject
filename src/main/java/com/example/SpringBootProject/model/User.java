package com.example.SpringBootProject.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ApiModel 和 @ApiModelProperty 注解来对我们 API 中所涉及到的对象做描述。
 *  @ApiModel 注解以及@ApiModelProperty 注解来自动补充实体以及其属性的描述和备注。
 * @author ganchaoyang
 * @date 2019/3/1013:55
 */
@ApiModel("用户实体")
public class User {

    /**
     * 用户Id
     */
    @ApiModelProperty("用户id")
    private int id;

    /**
     * 用户名
     */
    @ApiModelProperty("用户姓名")
    private String name;


    /**
     * 用户地址
     */
    @ApiModelProperty("用户地址")
    private String address;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
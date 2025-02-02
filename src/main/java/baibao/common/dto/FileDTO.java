/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.common.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 文件的传输对象.
 * @author Kahle
 */
public class FileDTO implements Serializable {
    /**
     * 文件名称
     */
    @NotBlank(message = "文件名称不能为空！")
    private String name;
    /**
     * 文件地址
     */
    @NotBlank(message = "文件地址不能为空！")
    private String addr;
    /**
     * 文件备注
     */
    private String remark;

    public FileDTO(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public FileDTO() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddr() {

        return addr;
    }

    public void setAddr(String addr) {

        this.addr = addr;
    }

    public String getRemark() {

        return remark;
    }

    public void setRemark(String remark) {

        this.remark = remark;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

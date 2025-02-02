/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.common.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 启用/禁用的传输对象.
 * @author Kahle
 */
public class EnableDTO implements Serializable {
    /**
     * 数据记录ID
     */
    @NotNull(message = "数据记录ID不能为空！")
    private Long    recordId;
    /**
     * 启用/禁用状态值：0 未启用，1 启用
     */
    @NotNull(message = "启用/禁用状态值不能为空！")
    private Integer enabled;

    public EnableDTO(Long recordId, Integer enabled) {
        this.recordId = recordId;
        this.enabled = enabled;
    }

    public EnableDTO() {

    }

    public Long getRecordId() {

        return recordId;
    }

    public void setRecordId(Long recordId) {

        this.recordId = recordId;
    }

    public Integer getEnabled() {

        return enabled;
    }

    public void setEnabled(Integer enabled) {

        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "EnableDTO{" +
                "recordId=" + recordId +
                ", enabled=" + enabled +
                '}';
    }
}

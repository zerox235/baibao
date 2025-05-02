/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.common.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 拖拽排序的传输对象.
 * @author Kahle
 */
public class DragSortDTO implements Serializable {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空！")
    private Long id;
    /**
     * 排序
     */
    private Long sort;

    public DragSortDTO(Long id, Long sort) {
        this.sort = sort;
        this.id = id;
    }

    public DragSortDTO() {

    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getSort() {

        return sort;
    }

    public void setSort(Long sort) {

        this.sort = sort;
    }
}

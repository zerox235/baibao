/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.common.dto.base;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * 基础的查询对象.
 * @author Kahle
 */
public abstract class BaseQuery implements Serializable {
    /**
     * 是否分页
     */
    @JsonIgnore
    private boolean paged = true;
    /**
     * 滚动 ID
     */
    private String  scrollId;
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 每页条数
     */
    private Integer pageSize;

    public boolean isPaged() {

        return paged;
    }

    public void setPaged(boolean paged) {

        this.paged = paged;
    }

    public String getScrollId() {

        return scrollId;
    }

    public void setScrollId(String scrollId) {

        this.scrollId = scrollId;
    }

    public Integer getPageNum() {

        return pageNum;
    }

    public void setPageNum(Integer pageNum) {

        this.pageNum = pageNum;
    }

    public Integer getPageSize() {

        return pageSize;
    }

    public void setPageSize(Integer pageSize) {

        this.pageSize = pageSize;
    }

}

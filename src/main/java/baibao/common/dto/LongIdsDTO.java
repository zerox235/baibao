/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.common.dto;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

/**
 * ID集合的传输对象.
 * @author Kahle
 */
public class LongIdsDTO implements Serializable {
    /**
     * ID集合
     */
    @NotEmpty(message = "ID集合不能为空！")
    private List<Long> ids;

    public LongIdsDTO(List<Long> ids) {

        this.ids = ids;
    }

    public LongIdsDTO() {

    }

    public List<Long> getIds() {

        return ids;
    }

    public void setIds(List<Long> ids) {

        this.ids = ids;
    }

    @Override
    public String toString() {
        return "LongIdsDTO{" +
                "ids=" + ids +
                '}';
    }
}

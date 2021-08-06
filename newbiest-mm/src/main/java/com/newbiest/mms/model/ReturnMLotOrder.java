package com.newbiest.mms.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 退料单
 * 仓库退料到供应商
 */
@Entity
@DiscriminatorValue(Document.CATEGORY_RETURN_MLOT)
public class ReturnMLotOrder extends Document {

    public static final String GENERATOR_RETURN_MLOT_ORDER_RULE = "CreateReturnMLotOrder";

    /**
     * 默认的备货规则
     */
    public static final String DEFAULT_RETURN_MLOT_RESERVED_RULE = "DefaultReturnMLotReservedRule";

    @Override
    public String getCategory(){
        return Document.CATEGORY_RETURN_MLOT;
    }
}

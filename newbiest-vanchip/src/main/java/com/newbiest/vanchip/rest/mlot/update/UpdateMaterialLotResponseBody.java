package com.newbiest.vanchip.rest.mlot.update;

import com.newbiest.base.msg.ResponseBody;
import com.newbiest.mms.model.MaterialLot;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class UpdateMaterialLotResponseBody extends ResponseBody {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物料批次")
    private List<MaterialLot> materialLotList;
}

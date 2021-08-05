package com.newbiest.vanchip.rest.pack;

import com.newbiest.base.msg.RequestBody;
import com.newbiest.mms.dto.MaterialLotAction;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class PackMaterialLotRequestBody extends RequestBody {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "操作类型")
	private String actionType;

	@ApiModelProperty(value = "物料批次操作")
	private List<MaterialLotAction> materialLotActions;

	@ApiModelProperty(value = "包装规则")
	private String packageType;

	@ApiModelProperty(value = "批次号")
	private String materialLotId;

	@ApiModelProperty(value = "是否验证打印次数")
	private Boolean validationPrintFlag;
}

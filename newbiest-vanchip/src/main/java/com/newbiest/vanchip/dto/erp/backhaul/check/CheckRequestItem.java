package com.newbiest.vanchip.dto.erp.backhaul.check;

import com.newbiest.mms.model.MaterialLot;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CheckRequestItem implements Serializable {

    /**
     * 仓库类型
     * 1为非限制，
     * 2为质量检验，
     * 4为已冻结，
     */
    public static final String BSTAR_1 = "1";
    public static final String BSTAR_2 = "2";
    public static final String BSTAR_4 = "4";

    /**
     * 项目
     */
    private String ZEILI;

    /**
     * 物料代码
     */
    private String MATNR;

    /**
     * 物料描述
     */
    private String MAKTX;

    /**
     * 仓库代码
     */
    private String LGORT;

    /**
     * 库存类型
     */
    private String BSTAR = BSTAR_1;


    /**
     * 基本计量单位
     */
    private String ERFME;

    /**
     * 数量
     */
    private BigDecimal ERFMG;

    /**
     * 二次计数
     */
    private String ZCOUNT;

    /**
     * reel
     */
    private String Z_BATCH_REEL;

    /**
     * 测试批次
     */
    private String Z_BATCH_TBATCH;

    /**
     * BOX NO
     */
    private String Z_BATCH_BOXNO;

    /**
     * WMS 系统生成批次
     */
    private String Z_BATCH_WMSBATCH;

    private String FIELD1;
    private String FIELD2;
    private String FIELD3;
    private String FIELD4;

    public CheckRequestItem copyMaterialLotToCheckRequestItem(CheckRequestItem requestItem, MaterialLot materialLot){
        requestItem.setMATNR(materialLot.getMaterialName());
        requestItem.setMAKTX(materialLot.getMaterialDesc());
        requestItem.setLGORT(materialLot.getLastWarehouseId());
        requestItem.setERFME(materialLot.getStoreUom());
        requestItem.setERFMG(materialLot.getCurrentQty());
        requestItem.setZ_BATCH_WMSBATCH(materialLot.getMaterialLotId());
        //ZCOUNT 二次计数
        //批次栏位。
        return requestItem;
    }
}

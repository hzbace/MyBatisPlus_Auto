package com.qfedu.SGoods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.qfedu.pojo;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SGoods extends pojo {

    private static final long serialVersionUID = 1L;

    @TableId(value = "g_id", type = IdType.AUTO)
    private Integer gId;

    private String gName;

    private String gContent;

    private String gUwant;

    private Integer gFlag;

    private Integer gUid;


}

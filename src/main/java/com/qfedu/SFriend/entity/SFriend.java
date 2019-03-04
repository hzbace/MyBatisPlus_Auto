package com.qfedu.SFriend.entity;

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
public class SFriend extends pojo {

    private static final long serialVersionUID = 1L;

    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    private Integer fUid;

    private Integer fFuid;

    private Integer fFlag;


}

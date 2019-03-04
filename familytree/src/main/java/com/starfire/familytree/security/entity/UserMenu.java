package com.starfire.familytree.security.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author luzh
 * @since 2019-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("security_user_menu")
public class UserMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime createTime;

    private String creater;

    private LocalDateTime updateTime;

    private String updater;

    private Boolean valid;

    private Boolean own;

    private Long menuId;

    private Long userId;


}
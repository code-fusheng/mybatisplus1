package xyz.fusheng.mybatisplus1.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import xyz.fusheng.mybatisplus1.enums.StateEnums;

import java.util.Date;

/**
 * @FileName: User
 * @Author: code-fusheng
 * @Date: 2020/5/29 15:15
 * @version: 1.0
 * Description: 用户实体类
 */

@Data
@TableName(value = "user")
public class User {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户名
     */
    @TableField(value = "name")
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 分数
     */
    @TableField(exist = false, select = false)
    private String gender;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * 乐观锁
     */
    @Version
    private Integer version;
    /**
     * 状态码
     */
    private StateEnums status;
    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer deleted;

}

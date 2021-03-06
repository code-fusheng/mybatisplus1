/**
 * @FileName: StateEnums
 * @Author: code-fusheng
 * @Date: 2020/4/15 14:00
 * Description: 状态码枚举
 */
package xyz.fusheng.mybatisplus1.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum StateEnums {

    /**
     * 逻辑删除状态
     */
    DELETED(1, "已删除"),
    NOT_DELETED(0, "未删除"),

    /**
     * 启用状态
     */
    ENABLED(1, "启用"),
    NOT_ENABLE(0, "未启用"),

    /**
     * 性别状态
     */
    SEX_MAN(1, "男"),
    SEX_WOMAN(2, "女"),
    SEX_PRIVACY(0,"私密"),

    ;
    /**
     * code 状态码
     * msg 状态信息
     */
    @EnumValue
    private Integer code;
    private String msg;

    StateEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

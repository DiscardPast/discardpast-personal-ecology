package com.discardpast.louwailou.base.enums;

/**
 * 定义错误码
 *
 * @author yinbh
 * @since 2019/9/24 17:16
 */
public enum ErrorCodeEnum {

    /**
     * 成功
     */
    SUCCESS(0, "成功"),
    /**
     * 失败
     */
    FAIL(1, "失败"),

    /**
     * 操作异常
     */
    ERROR(9999, "操作异常"),

    /**
     * 用户不存在
     */
    NO_MEMBER(1000, "用户不存在"),
    /**
     * 用户未登录
     */
    NO_LOGIN(1001, "用户未登录"),
    /**
     * 用户被冻结
     */
    MEMBER_FROZEN(1003, "账号已冻结"),

    /**
     * 用户账号被禁用和拉黑
     */
    MEMBER_DISABLED(1004, "账号已被禁用"),

    /**
     * 手机号码不合法
     */
    ILLEGAL_MOBILE_NUMBER(1050, "手机号不合法"),

    /**
     * 短信模板调用key不能为空
     */
    EMPTY_SMS_TEMPLATE_KEY(1060, "短信模板调用key不能为空"),
    /**
     * 短信模板调用key不合法
     */
    ILLEGAL_SMS_TEMPLATE_KEY(1061, "短信模板调用key不合法"),

    /**
     * 短信内容重复发送
     */
    REPEAT_SMS_CONTENT(1062, "短信内容重复发送"),

    /**
     * 请求头中未传token
     */
    NO_TOKEN(2000, "token信息为空"),
    /**
     * token验证失败
     */
    TOKEN_VALIDATION_FAILED(2001, "token验证失败"),
    /**
     * token过期
     * expire
     */
    TOKEN_EXPIRE(2002, "token过期"),
    /**
     * 签名错误
     */
    ERROR_SIGN(2003, "签名错误"),

    /**
     * 提现失败
     */
    WITHDRAW_FAILED(3000, "提现失败"),


    /**
     * 重复支付
     */
    REPEAT_PAYMENT(3001, "该单已经付款成功了，无需重复付款"),


    /**
     * 获取支付信息失败
     */
    PAY_FAILURE(3002, "抱歉，获取支付信息失败，请稍后再试或联系平台获取帮助。");


    private Integer code;

    private String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ErrorCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescByCode(Integer code) {
        for (ErrorCodeEnum e : ErrorCodeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e.getDesc();
            }
        }
        return ErrorCodeEnum.ERROR.getDesc();
    }

    public static ErrorCodeEnum getByCode(Integer code) {
        for (ErrorCodeEnum e : ErrorCodeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }
}

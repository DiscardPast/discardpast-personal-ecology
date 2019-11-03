package com.discardpast.louwailou.base.domain;

import com.discardpast.louwailou.base.enums.ErrorCodeEnum;
import lombok.Data;

/**
 * 注释
 *
 * @author discardpast@yeah.net
 * @since 2019/10/3 22:37
 */
@Data
public class Result {

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 详细信息
     */
    private String msg;

    /**
     * 实体对象对象
     */
    private Object data;


    public static Result success() {
        Result result = new Result();
        result.setCode(ErrorCodeEnum.SUCCESS.getCode());
        result.setMsg(ErrorCodeEnum.SUCCESS.getDesc());
        result.setData(null);
        return result;
    }

    public static Result success(Object obj) {
        Result result = success();
        result.setData(obj);
        return result;
    }

    public static Result success(String msg, Object obj) {
        Result result = success();
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    /**
     * 失败
     *
     * @return
     */
    public static Result fail() {
        Result result = new Result();
        result.setCode(ErrorCodeEnum.FAIL.getCode());
        result.setMsg(ErrorCodeEnum.FAIL.getDesc());
        result.setData(null);
        return result;
    }

    public static Result fail(String msg) {
        Result result = fail();
        result.setMsg(msg);
        return result;
    }

    public static Result fail(Object obj) {
        Result result = fail();
        result.setData(obj);
        return result;
    }

    public static Result fail(String msg, Object obj) {
        Result result = fail();
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    /**
     * 异常
     *
     * @return
     */
    public static Result error() {
        Result result = new Result();
        result.setCode(ErrorCodeEnum.ERROR.getCode());
        result.setMsg(ErrorCodeEnum.ERROR.getDesc());
        result.setData(null);
        return result;
    }

    public static Result error(String msg) {
        Result result = error();
        result.setMsg(msg);
        return result;
    }

    public static Result error(ErrorCodeEnum errorCodeEnum) {
        Result result = error();
        result.setCode(errorCodeEnum.getCode());
        result.setMsg(errorCodeEnum.getDesc());
        return result;
    }

    public static Result error(Object obj) {
        Result result = error();
        result.setData(obj);
        return result;
    }

    public static Result error(String msg, Object obj) {
        Result result = error();
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    /**
     * 自定义
     *
     * @param code
     * @param msg
     * @param obj
     * @return
     */
    public static Result custom(Integer code, String msg, Object obj) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    /**
     * 自定义
     *
     * @param errorCodeEnum
     * @param obj
     * @return
     */
    public static Result custom(ErrorCodeEnum errorCodeEnum, Object obj) {
        Result result = new Result();
        result.setCode(errorCodeEnum.getCode());
        result.setMsg(errorCodeEnum.getDesc());
        result.setData(obj);
        return result;
    }

    public Boolean isSuccess() {
        return this.code.equals(ErrorCodeEnum.SUCCESS.getCode());
    }
}

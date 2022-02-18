package com.xiangkai.cfms.dto;

import com.xiangkai.cfms.enums.ResponseResultCodeEnum;

import java.io.Serializable;

/**
 * 接口返回结果是resultCode、resultDesc和data的组合，具体结果放在data中；
 * resultCode=1，表示处理成功，从data中取出返回值；
 * resultCode<=0，表示处理失败，有各种失败原因：某入参为空，或参数取值无意义，或程序处理出错，具体描述放在resultDesc中，data的值是个空字符串。
 * Created by xukq on 2018-2-23.
 */
public class BaseResponseDTO<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 结果代码
     **/
    private Integer resultCode;

    /**
     * 结果描述
     **/
    private String resultDesc;

    /**
     * 处理结果
     **/
    private T data;

    /**
     * 查询的记录总数（分页时用）
     */
    private long total;

    public BaseResponseDTO() {
        this.resultCode = ResponseResultCodeEnum.SUCCESS.getCode();
        this.resultDesc = ResponseResultCodeEnum.SUCCESS.getDesc();
    }

    public BaseResponseDTO(Integer resultCode, String resultDesc) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }

    public BaseResponseDTO(Integer resultCode, String resultDesc, T data) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.data = data;
    }

    public BaseResponseDTO(T data) {
        this.resultCode = ResponseResultCodeEnum.SUCCESS.getCode();
        this.resultDesc = ResponseResultCodeEnum.SUCCESS.getDesc();
        this.data = data;
    }

    public BaseResponseDTO(T data, long total) {
        this.resultCode = ResponseResultCodeEnum.SUCCESS.getCode();
        this.resultDesc = ResponseResultCodeEnum.SUCCESS.getDesc();
        this.data = data;
        this.total = total;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BaseResponseDTO{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                ", data=" + data +
                '}';
    }
}

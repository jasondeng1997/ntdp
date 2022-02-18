package com.xiangkai.cfms.constant;

/**
 * Created by xukq on 2018-3-23.
 */
public class ConstantKey {
    public static final String ROOT_DIRECTORY_ADMIN = "admin";
    public static final String ROOT_DIRECTORY_API = "api";

    public static final String SIGNING_KEY = "Boss@Jwt!&Secret^#";
    public static final String BASE64_SECRET = "DYk5ZjZiY7P0NjIxZDM3M2NhZGU0ZTgzMjYyN4O0YjX=";
    public static final String JWT_TOKEN_PREFIX = "xiangkai;";
    public static final String DEFAULT_PASSWORD = "666666";
    public static final int JWT_TOKEN_EXPIRES_TIME = 36000000; // 10h

    /**录入中**/
    public static final short CONTRACT_STATUS__RECORDING = 1;
    /**待审核**/
    public static final short CONTRACT_STATUS__WAIT_AUDIT = 2;
    /**审核通过**/
    public static final short CONTRACT_STATUS__AUDIT_PASS = 3;
    /**审核回退**/
    public static final short CONTRACT_STATUS__AUDIT_BACK = 4;

    // 用户状态
    public static final int USER_STATUS_DISABLED = 0;
    public static final int USER_STATUS_VALID = 1;
    public static final int USER_STATUS_LOCKED = 2;

    // 用户角色
    public static final String USER_ROLE_RECORD = "record";
    public static final String USER_ROLE_AUDIT = "audit";
    public static final String USER_ROLE_ADMIN = "admin";

    // 收付类型
    public static final int CP_TYPE_COLLECT = 1;
    public static final int CP_TYPE_PAY = 2;
    public static final int CP_TYPE_OTHER = 3;

    // 是否删除
    public static final short DEL_FLAG_NO = 0;
    public static final short DEL_FLAG_YES = 1;

}

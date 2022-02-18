package com.xiangkai.cfms.util;

import org.springframework.util.DigestUtils;

/**
 * MD5工具类，加盐
 */
public class MD5Util {
  /**
   * 加盐MD5
   * @author kaiqin.xu
   * @param password
   * @return
   */
  public static String generate(String password) {
    return DigestUtils.md5DigestAsHex(password.getBytes());
  }

  /**
   * 校验加盐后是否和原文一致
   * @param password
   * @param md5
   * @return
   */
  public static boolean verify(String password, String md5) {
    return DigestUtils.md5DigestAsHex(password.getBytes()).equals(md5);
  }
}

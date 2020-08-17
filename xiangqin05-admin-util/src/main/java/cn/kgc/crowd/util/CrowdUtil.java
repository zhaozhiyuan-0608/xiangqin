package cn.kgc.crowd.util;

import cn.kgc.crowd.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author wuchao
 * @create 2020-08-14 16:59
 */
public class CrowdUtil {
    //测试加密
    public static void main(String[] args) {
        String str="123123";
        String s = CrowdUtil.md5(str);
        System.out.println(s);

    }




    /*加密方法*/
    /**
     * 对明文字符串进行MD5加密
     * @param source 传入的明文字符串
     * @return 加密结果
     */
    public static String md5(String source) {

        // 1.判断source是否有效
        if (source == null || source.length() == 0) {

            // 2.如果不是有效的字符串抛出异常
            throw new RuntimeException(CrowdConstant.MESSAGE_STRING_INVALIDATE);
        }

        try {
            // 3.获取MessageDigest对象
            String algorithm = "md5";

            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);

            // 4.获取明文字符串对应的字节数组
            byte[] input = source.getBytes();

            // 5.执行加密
            byte[] output = messageDigest.digest(input);

            // 6.创建BigInteger对象
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum, output);

            // 7.按照16进制将bigInteger的值转换为字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();

            return encoded;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }








    public  static  boolean  judgeRequestType(HttpServletRequest request){

        /*获取请求头*/
        String acceptHeader = request.getHeader("Accept");
        String xRequestHeader = request.getHeader("X-Requested-With");

        return(
                ( acceptHeader!=null && acceptHeader.contains("application/json"))
                        ||
                        (xRequestHeader !=null && xRequestHeader.contains("XMLHttpRequest"))

        );




    }


}

package cn.com.utils.encode;

import java.io.UnsupportedEncodingException;
/**
 * base64编码工具类
 * @author 常东旭
 *
 */
public final class Base64Encode {
	private static final char[] base64EncodeChars = new char[] { 
	        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
	        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
	        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 
	        'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 
	        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
	        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
	        'w', 'x', 'y', 'z', '0', '1', '2', '3', 
	        '4', '5', '6', '7', '8', '9', '+', '/' }; 
	
	/**
	 * base64 编码
	 * @param data  byte[]类型
	 * @return
	 */
	public static final String base64Encode(byte[] data) { 
        StringBuffer sb = new StringBuffer(); 
        int len = data.length; 
        int i = 0; 
        int b1, b2, b3; 
        while (i < len) { 
            b1 = data[i++] & 0xff; 
            if (i == len) 
            { 
                sb.append(base64EncodeChars[b1 >>> 2]); 
                sb.append(base64EncodeChars[(b1 & 0x3) << 4]); 
                sb.append("=="); 
                break; 
            } 
            b2 = data[i++] & 0xff; 
            if (i == len) 
            { 
                sb.append(base64EncodeChars[b1 >>> 2]); 
                sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]); 
                sb.append(base64EncodeChars[(b2 & 0x0f) << 2]); 
                sb.append("="); 
                break; 
            } 
            b3 = data[i++] & 0xff; 
            sb.append(base64EncodeChars[b1 >>> 2]); 
            sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]); 
            sb.append(base64EncodeChars[((b2 & 0x0f) << 2) | ((b3 & 0xc0) >>> 6)]); 
            sb.append(base64EncodeChars[b3 & 0x3f]); 
        } 
        return sb.toString(); 
    }
	
	/**
	 * base64编码
	 * @param data 数据
	 * @param charset 字符集
	 * @return 结果
	 */
	public static final String base64Encode(String data,String charset){
		if (charset != null) {
			try {
				return base64Encode(data.getBytes(charset));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return base64Encode(data.getBytes());
	}
}

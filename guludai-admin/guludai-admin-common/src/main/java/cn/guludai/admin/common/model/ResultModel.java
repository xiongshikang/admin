/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.common.model;

import cn.guludai.api.code.BaseCode;

import java.util.List;

/**
 * 
 * @ClassName: ResultModel 
 * @Description: 返回结果类
 * @author: xiongshikang
 * @date: 2017年11月3日 下午5:02:34 
 * @param <T>
 */
public class ResultModel<T> {
	
	/**
	 * 状态码
	 */
	private String code;

	/**
	 * 文件流
	 */
	private String bytes;
	
	/**
	 * 结果数据
	 */
	private T result;
	
	private List<T> ls;

	public List<T> getLs() {
		return ls;
	}

	public void setLs(List<T> ls) {
		this.ls = ls;
	}

	/**
	 * 签名
	 */
	private String sign;
	
 
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}

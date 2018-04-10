/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.enums;

import cn.guludai.api.Code;

/**
 * 
 * @ClassName: BaseShopErpEnum 
 * @Description: 门店安全梅举类
 * @author: xiongshikang
 * @date: 2017年11月1日 下午6:40:53
 */
public enum BaseShopErpEnum implements Code {
	PARAMETER_ERROR("303","参数不合法"),
	SHOPCODE_IS_EMPTY("1", "门店编号为空"), 
	ERPCODE_IS_EMPTY("1", "erp厂商编号为空"), 
	ERPVERSIONCODE_IS_EMPTY("1", "erp厂商版本编号为空");

	private String code;
	
	private String message;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	BaseShopErpEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年11月1日 下午12:02:28
	 * @Title: selectStateEnumByCode 
	 * @Description: 通过code查找状态
	 * @param code
	 * @return
	 *
	 */
	public BaseShopErpEnum selectStateEnumByCode(int code) {
		BaseShopErpEnum[] stateEnums = BaseShopErpEnum.values();
		BaseShopErpEnum stateEnum = null;
		for (BaseShopErpEnum s : stateEnums) {
			if(s.getCode().equals(code)){
				stateEnum = s;
			}
		}
		return stateEnum;
	}
	
}

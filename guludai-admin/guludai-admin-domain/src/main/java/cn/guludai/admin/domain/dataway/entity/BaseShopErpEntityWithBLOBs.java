/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.domain.dataway.entity;

/**
 * @author gaopeng
 */
public class BaseShopErpEntityWithBLOBs extends BaseShopErpEntity {
	/**
	 * <pre>
	 * 数据公钥串
	 * 表字段 : base_shop_erp.data_public_key
	 * </pre>
	 */
	private String dataPublicKey;

	/**
	 * <pre>
	 * 数据私钥串
	 * 表字段 : base_shop_erp.data_private_key
	 * </pre>
	 */
	private String dataPrivateKey;

	/**
	 * <pre>
	 * 获取：数据公钥串
	 * 表字段：base_shop_erp.data_public_key
	 * </pre>
	 * 
	 * @return 数据公钥串 : {@link java.lang.String}
	 */
	public String getDataPublicKey() {
		return dataPublicKey;
	}

	/**
	 * <pre>
	 * 设置：数据公钥串
	 * 表字段：base_shop_erp.data_public_key
	 * </pre>
	 * 
	 * @param dataPublicKey
	 *              数据公钥串 : {@link java.lang.String}
	 */
	public void setDataPublicKey(String dataPublicKey) {
		this.dataPublicKey = dataPublicKey == null ? null : dataPublicKey.trim();
	}

	/**
	 * <pre>
	 * 获取：数据私钥串
	 * 表字段：base_shop_erp.data_private_key
	 * </pre>
	 * 
	 * @return 数据私钥串 : {@link java.lang.String}
	 */
	public String getDataPrivateKey() {
		return dataPrivateKey;
	}

	/**
	 * <pre>
	 * 设置：数据私钥串
	 * 表字段：base_shop_erp.data_private_key
	 * </pre>
	 * 
	 * @param dataPrivateKey
	 *              数据私钥串 : {@link java.lang.String}
	 */
	public void setDataPrivateKey(String dataPrivateKey) {
		this.dataPrivateKey = dataPrivateKey == null ? null : dataPrivateKey.trim();
	}
}
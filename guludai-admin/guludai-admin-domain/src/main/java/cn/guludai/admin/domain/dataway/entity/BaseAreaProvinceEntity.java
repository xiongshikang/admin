/**
 * 上海谨微数据服务有限公司
 */package cn.guludai.admin.domain.dataway.entity;

import java.util.Date;

/**
 * @author gaopeng
 */
public class BaseAreaProvinceEntity {
    /**
     * <pre>
     * 
     * 表字段 : base_area_province.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 省编号
     * 表字段 : base_area_province.province_no
     * </pre>
     */
    private String provinceNo;

    /**
     * <pre>
     * 省名称
     * 表字段 : base_area_province.province_name
     * </pre>
     */
    private String provinceName;

    /**
     * <pre>
     * 排序号
     * 表字段 : base_area_province.orders
     * </pre>
     */
    private Short orders;

    /**
     * <pre>
     * 版本号(默认值：1，同步递增修改)
     * 表字段 : base_area_province.version
     * </pre>
     */
    private Long version;

    /**
     * <pre>
     * 创建时间
     * 表字段 : base_area_province.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 修改时间
     * 表字段 : base_area_province.update_time
     * </pre>
     */
    private Date updateTime;

    /**
     * <pre>
     * 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段 : base_area_province.data_status
     * </pre>
     */
    private String dataStatus;

    /**
     * <pre>
     * 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     * 表字段 : base_area_province.disk_status
     * </pre>
     */
    private String diskStatus;

    /**
     * <pre>
     * 获取：
     * 表字段：base_area_province.id
     * </pre>
     * @return  : {@link java.lang.Long} 
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：base_area_province.id
     * </pre>
     * @param id  : {@link java.lang.Long} 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：省编号
     * 表字段：base_area_province.province_no
     * </pre>
     * @return 省编号 : {@link java.lang.String} 
     */
    public String getProvinceNo() {
        return provinceNo;
    }

    /**
     * <pre>
     * 设置：省编号
     * 表字段：base_area_province.province_no
     * </pre>
     * @param provinceNo 省编号 : {@link java.lang.String} 
     */
    public void setProvinceNo(String provinceNo) {
        this.provinceNo = provinceNo == null ? null : provinceNo.trim();
    }

    /**
     * <pre>
     * 获取：省名称
     * 表字段：base_area_province.province_name
     * </pre>
     * @return 省名称 : {@link java.lang.String} 
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * <pre>
     * 设置：省名称
     * 表字段：base_area_province.province_name
     * </pre>
     * @param provinceName 省名称 : {@link java.lang.String} 
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * <pre>
     * 获取：排序号
     * 表字段：base_area_province.orders
     * </pre>
     * @return 排序号 : {@link java.lang.Short} 
     */
    public Short getOrders() {
        return orders;
    }

    /**
     * <pre>
     * 设置：排序号
     * 表字段：base_area_province.orders
     * </pre>
     * @param orders 排序号 : {@link java.lang.Short} 
     */
    public void setOrders(Short orders) {
        this.orders = orders;
    }

    /**
     * <pre>
     * 获取：版本号(默认值：1，同步递增修改)
     * 表字段：base_area_province.version
     * </pre>
     * @return 版本号(默认值：1，同步递增修改) : {@link java.lang.Long} 
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <pre>
     * 设置：版本号(默认值：1，同步递增修改)
     * 表字段：base_area_province.version
     * </pre>
     * @param version 版本号(默认值：1，同步递增修改) : {@link java.lang.Long} 
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：base_area_province.create_time
     * </pre>
     * @return 创建时间 : {@link java.util.Date} 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：base_area_province.create_time
     * </pre>
     * @param createTime 创建时间 : {@link java.util.Date} 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：修改时间
     * 表字段：base_area_province.update_time
     * </pre>
     * @return 修改时间 : {@link java.util.Date} 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <pre>
     * 设置：修改时间
     * 表字段：base_area_province.update_time
     * </pre>
     * @param updateTime 修改时间 : {@link java.util.Date} 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <pre>
     * 获取：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：base_area_province.data_status
     * </pre>
     * @return 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String} 
     */
    public String getDataStatus() {
        return dataStatus;
    }

    /**
     * <pre>
     * 设置：逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y)
     * 表字段：base_area_province.data_status
     * </pre>
     * @param dataStatus 逻辑状态(常量值：Y-逻辑保留，N-逻辑删除，默认值：Y) : {@link java.lang.String} 
     */
    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    /**
     * <pre>
     * 获取：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     * 表字段：base_area_province.disk_status
     * </pre>
     * @return 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String} 
     */
    public String getDiskStatus() {
        return diskStatus;
    }

    /**
     * <pre>
     * 设置：物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y)
     * 表字段：base_area_province.disk_status
     * </pre>
     * @param diskStatus 物理状态(常量值：Y-物理保留，N-物理删除，默认值：Y) : {@link java.lang.String} 
     */
    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus == null ? null : diskStatus.trim();
    }
}
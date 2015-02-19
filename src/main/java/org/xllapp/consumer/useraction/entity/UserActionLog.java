package org.xllapp.consumer.useraction.entity;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Date;

public class UserActionLog implements Serializable {
	
	private static final long serialVersionUID = 6696534057988136810L;

	private Integer id;
    
    private String productId;
    
    private String clientType;
    
    private String clientVersion;
    
    private String clientChannelType;
    
    private String osType;
    
    private String imei;
    
    private String imsi;
    
    private String mobile;
    
    private String orgCode;
    
    private String cityCode;
    
    private String longitude;
    
    private String latitude;
    
    private String ip;
    
    private String actionType;
    
    private String areaId;
    
    private String itemType;
    
    private String itemId;
    
    private String subItemId;
    
    private String desc;
    
    private String actionTime;
    
    private String field1;
    
    private String field2;
    
    private Date createTime;
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }
    public String getClientChannelType() {
        return this.clientChannelType;
    }

    public void setClientChannelType(String clientChannelType) {
        this.clientChannelType = clientChannelType;
    }
    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }
    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
    public String getImsi() {
        return this.imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public String getSubItemId() {
        return this.subItemId;
    }

    public void setSubItemId(String subItemId) {
        this.subItemId = subItemId;
    }
    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getActionTime() {
        return this.actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }
    public String getField1() {
        return this.field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
    public String getField2() {
        return this.field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
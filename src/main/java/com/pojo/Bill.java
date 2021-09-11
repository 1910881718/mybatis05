package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 账单编码
     */
    private String billcode;

    /**
     * 商品名称
     */
    private String productname;

    /**
     * 商品描述
     */
    private String productdesc;

    /**
     * 商品单位
     */
    private String productunit;

    /**
     * 商品数量
     */
    private BigDecimal productcount;

    /**
     * 商品总额
     */
    private BigDecimal totalprice;

    /**
     * 是否支付（1：未支付 2：已支付）
     */
    private Integer ispayment;

    /**
     * 创建者（userId）
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 更新者（userId）
     */
    private Long modifyby;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 供应商ID
     */
    private Long providerid;

    //供应商
    private Provider provider;


    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public String getProductunit() {
        return productunit;
    }

    public void setProductunit(String productunit) {
        this.productunit = productunit == null ? null : productunit.trim();
    }

    public BigDecimal getProductcount() {
        return productcount;
    }

    public void setProductcount(BigDecimal productcount) {
        this.productcount = productcount;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getIspayment() {
        return ispayment;
    }

    public void setIspayment(Integer ispayment) {
        this.ispayment = ispayment;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getProviderid() {
        return providerid;
    }

    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billcode='" + billcode + '\'' +
                ", productname='" + productname + '\'' +
                ", productdesc='" + productdesc + '\'' +
                ", productunit='" + productunit + '\'' +
                ", productcount=" + productcount +
                ", totalprice=" + totalprice +
                ", ispayment=" + ispayment +
                ", createdby=" + createdby +
                ", creationdate=" + creationdate +
                ", modifyby=" + modifyby +
                ", modifydate=" + modifydate +
                ", providerid=" + providerid +
                ", provider=" + provider +
                '}';
    }
}
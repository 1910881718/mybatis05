package com.pojo;

import java.util.Date;
import java.util.List;

public class Provider {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 供应商编码
     */
    private String procode;

    /**
     * 供应商名称
     */
    private String proname;

    /**
     * 供应商详细描述
     */
    private String prodesc;

    /**
     * 供应商联系人
     */
    private String procontact;

    /**
     * 联系电话
     */
    private String prophone;

    /**
     * 地址
     */
    private String proaddress;

    /**
     * 传真
     */
    private String profax;

    /**
     * 创建者（userId）
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 更新者（userId）
     */

    private List<Bill> billList;

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    private Long modifyby;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode == null ? null : procode.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc == null ? null : prodesc.trim();
    }

    public String getProcontact() {
        return procontact;
    }

    public void setProcontact(String procontact) {
        this.procontact = procontact == null ? null : procontact.trim();
    }

    public String getProphone() {
        return prophone;
    }

    public void setProphone(String prophone) {
        this.prophone = prophone == null ? null : prophone.trim();
    }

    public String getProaddress() {
        return proaddress;
    }

    public void setProaddress(String proaddress) {
        this.proaddress = proaddress == null ? null : proaddress.trim();
    }

    public String getProfax() {
        return profax;
    }

    public void setProfax(String profax) {
        this.profax = profax == null ? null : profax.trim();
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

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", procode='" + procode + '\'' +
                ", proname='" + proname + '\'' +
                ", prodesc='" + prodesc + '\'' +
                ", procontact='" + procontact + '\'' +
                ", prophone='" + prophone + '\'' +
                ", proaddress='" + proaddress + '\'' +
                ", profax='" + profax + '\'' +
                ", createdby=" + createdby +
                ", creationdate=" + creationdate +
                ", modifydate=" + modifydate +
                ", billList=" + billList +
                ", modifyby=" + modifyby +
                '}';
    }
}
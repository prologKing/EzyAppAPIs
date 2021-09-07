/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allianz.entities;

import com.allianz.dto.TmpUssdDataDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Developer
 */
@Entity
@Table(name = "tmp_ussd_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TmpUssdData.findAll", query = "SELECT t FROM TmpUssdData t"),
    @NamedQuery(name = "TmpUssdData.findById", query = "SELECT t FROM TmpUssdData t WHERE t.id = :id"),
    @NamedQuery(name = "TmpUssdData.findByMobile", query = "SELECT t FROM TmpUssdData t WHERE t.mobile = :mobile"),
    @NamedQuery(name = "TmpUssdData.deleteByMobile", query = "DELETE FROM TmpUssdData t WHERE t.mobile = :mobile"),
    @NamedQuery(name = "TmpUssdData.findByScreenNo", query = "SELECT t FROM TmpUssdData t WHERE t.screenNo = :screenNo"),
    @NamedQuery(name = "TmpUssdData.findByValue1", query = "SELECT t FROM TmpUssdData t WHERE t.value1 = :value1"),
    @NamedQuery(name = "TmpUssdData.findByValue2", query = "SELECT t FROM TmpUssdData t WHERE t.value2 = :value2"),
    @NamedQuery(name = "TmpUssdData.findByValue3", query = "SELECT t FROM TmpUssdData t WHERE t.value3 = :value3"),
    @NamedQuery(name = "TmpUssdData.findByValue4", query = "SELECT t FROM TmpUssdData t WHERE t.value4 = :value4"),
    @NamedQuery(name = "TmpUssdData.findByValue5", query = "SELECT t FROM TmpUssdData t WHERE t.value5 = :value5"),
    @NamedQuery(name = "TmpUssdData.findByValue6", query = "SELECT t FROM TmpUssdData t WHERE t.value6 = :value6"),
    @NamedQuery(name = "TmpUssdData.findByValue7", query = "SELECT t FROM TmpUssdData t WHERE t.value7 = :value7"),
    @NamedQuery(name = "TmpUssdData.findByValue8", query = "SELECT t FROM TmpUssdData t WHERE t.value8 = :value8"),
    @NamedQuery(name = "TmpUssdData.findByValue9", query = "SELECT t FROM TmpUssdData t WHERE t.value9 = :value9"),
    @NamedQuery(name = "TmpUssdData.findByValue10", query = "SELECT t FROM TmpUssdData t WHERE t.value10 = :value10"),
    @NamedQuery(name = "TmpUssdData.findByValue11", query = "SELECT t FROM TmpUssdData t WHERE t.value11 = :value11"),
    @NamedQuery(name = "TmpUssdData.findByValue12", query = "SELECT t FROM TmpUssdData t WHERE t.value12 = :value12"),
    @NamedQuery(name = "TmpUssdData.findByValue13", query = "SELECT t FROM TmpUssdData t WHERE t.value13 = :value13"),
    @NamedQuery(name = "TmpUssdData.findByValue14", query = "SELECT t FROM TmpUssdData t WHERE t.value14 = :value14"),
    @NamedQuery(name = "TmpUssdData.findByValue15", query = "SELECT t FROM TmpUssdData t WHERE t.value15 = :value15"),
    @NamedQuery(name = "TmpUssdData.findByValue16", query = "SELECT t FROM TmpUssdData t WHERE t.value16 = :value16"),
    @NamedQuery(name = "TmpUssdData.findByValue17", query = "SELECT t FROM TmpUssdData t WHERE t.value17 = :value17"),
    @NamedQuery(name = "TmpUssdData.findByValue18", query = "SELECT t FROM TmpUssdData t WHERE t.value18 = :value18"),
    @NamedQuery(name = "TmpUssdData.findByValue19", query = "SELECT t FROM TmpUssdData t WHERE t.value19 = :value19"),
    @NamedQuery(name = "TmpUssdData.findByValue20", query = "SELECT t FROM TmpUssdData t WHERE t.value20 = :value20"),
    @NamedQuery(name = "TmpUssdData.findByValue21", query = "SELECT t FROM TmpUssdData t WHERE t.value21 = :value21"),
    @NamedQuery(name = "TmpUssdData.findByValue22", query = "SELECT t FROM TmpUssdData t WHERE t.value22 = :value22"),
    @NamedQuery(name = "TmpUssdData.findByValue23", query = "SELECT t FROM TmpUssdData t WHERE t.value23 = :value23"),
    @NamedQuery(name = "TmpUssdData.findByValue24", query = "SELECT t FROM TmpUssdData t WHERE t.value24 = :value24"),
    @NamedQuery(name = "TmpUssdData.findByValue25", query = "SELECT t FROM TmpUssdData t WHERE t.value25 = :value25"),
    @NamedQuery(name = "TmpUssdData.findByValue26", query = "SELECT t FROM TmpUssdData t WHERE t.value26 = :value26"),
    @NamedQuery(name = "TmpUssdData.findByLog", query = "SELECT t FROM TmpUssdData t WHERE t.log = :log"),
    @NamedQuery(name = "TmpUssdData.findByLastAccess", query = "SELECT t FROM TmpUssdData t WHERE t.lastAccess = :lastAccess")})
public class TmpUssdData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "mobile")
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Column(name = "screen_no")
    private int screenNo;
    @Size(max = 100)
    @Column(name = "value1")
    private String value1;
    @Size(max = 100)
    @Column(name = "value2")
    private String value2;
    @Size(max = 100)
    @Column(name = "value3")
    private String value3;
    @Size(max = 100)
    @Column(name = "value4")
    private String value4;
    @Size(max = 100)
    @Column(name = "value5")
    private String value5;
    @Size(max = 100)
    @Column(name = "value6")
    private String value6;
    @Size(max = 100)
    @Column(name = "value7")
    private String value7;
    @Size(max = 100)
    @Column(name = "value8")
    private String value8;
    @Size(max = 100)
    @Column(name = "value9")
    private String value9;
    @Size(max = 100)
    @Column(name = "value10")
    private String value10;
    @Size(max = 100)
    @Column(name = "value11")
    private String value11;
    @Size(max = 100)
    @Column(name = "value12")
    private String value12;
    @Size(max = 100)
    @Column(name = "value13")
    private String value13;
    @Size(max = 100)
    @Column(name = "value14")
    private String value14;
    @Size(max = 100)
    @Column(name = "value15")
    private String value15;
    @Size(max = 100)
    @Column(name = "value16")
    private String value16;
    @Size(max = 100)
    @Column(name = "value17")
    private String value17;
    @Size(max = 100)
    @Column(name = "value18")
    private String value18;
    @Size(max = 100)
    @Column(name = "value19")
    private String value19;
    @Size(max = 100)
    @Column(name = "value20")
    private String value20;
    @Size(max = 100)
    @Column(name = "value21")
    private String value21;
    @Size(max = 100)
    @Column(name = "value22")
    private String value22;
    @Size(max = 100)
    @Column(name = "value23")
    private String value23;
    @Size(max = 100)
    @Column(name = "value24")
    private String value24;
    @Size(max = 100)
    @Column(name = "value25")
    private String value25;
    @Size(max = 100)
    @Column(name = "value26")
    private String value26;
    @Size(max = 200)
    @Column(name = "log")
    private String log;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_access")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAccess;

    public TmpUssdData() {
    }

    public TmpUssdData(TmpUssdDataDTO tmpDTO) {
        this.id = tmpDTO.getId();
        this.mobile = tmpDTO.getMobile();
        this.screenNo = tmpDTO.getScreenNo();
        this.value1 = tmpDTO.getValue1();
        this.value2 = tmpDTO.getValue2();
        this.value3 = tmpDTO.getValue3();
        this.value4 = tmpDTO.getValue4();
        this.value5 = tmpDTO.getValue5();
        this.value6 = tmpDTO.getValue6();
        this.value7 = tmpDTO.getValue7();
        this.value8 = tmpDTO.getValue8();
        this.value9 = tmpDTO.getValue9();
        this.value10 = tmpDTO.getValue10();
        this.value11 = tmpDTO.getValue11();
        this.value12 = tmpDTO.getValue12();
        this.value13 = tmpDTO.getValue13();
        this.value14 = tmpDTO.getValue14();
        this.value15 = tmpDTO.getValue15();
        this.value16 = tmpDTO.getValue16();
        this.value17 = tmpDTO.getValue17();
        this.value18 = tmpDTO.getValue18();
        this.value19 = tmpDTO.getValue19();
        this.value20 = tmpDTO.getValue20();
        this.value21 = tmpDTO.getValue21();
        this.value22 = tmpDTO.getValue22();
        this.value23 = tmpDTO.getValue23();
        this.value24 = tmpDTO.getValue24();
        this.value25 = tmpDTO.getValue25();
        this.value26 = tmpDTO.getValue26();
        this.log = tmpDTO.getLog();
        this.lastAccess = new Date();
    }

    public TmpUssdData(Integer id) {
        this.id = id;
    }

    public TmpUssdData(Integer id, String mobile, int screenNo, Date lastAccess) {
        this.id = id;
        this.mobile = mobile;
        this.screenNo = screenNo;
        this.lastAccess = lastAccess;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(int screenNo) {
        this.screenNo = screenNo;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public String getValue9() {
        return value9;
    }

    public void setValue9(String value9) {
        this.value9 = value9;
    }

    public String getValue10() {
        return value10;
    }

    public void setValue10(String value10) {
        this.value10 = value10;
    }

    public String getValue11() {
        return value11;
    }

    public void setValue11(String value11) {
        this.value11 = value11;
    }

    public String getValue12() {
        return value12;
    }

    public void setValue12(String value12) {
        this.value12 = value12;
    }

    public String getValue13() {
        return value13;
    }

    public void setValue13(String value13) {
        this.value13 = value13;
    }

    public String getValue14() {
        return value14;
    }

    public void setValue14(String value14) {
        this.value14 = value14;
    }

    public String getValue15() {
        return value15;
    }

    public void setValue15(String value15) {
        this.value15 = value15;
    }

    public String getValue16() {
        return value16;
    }

    public void setValue16(String value16) {
        this.value16 = value16;
    }

    public String getValue17() {
        return value17;
    }

    public void setValue17(String value17) {
        this.value17 = value17;
    }

    public String getValue18() {
        return value18;
    }

    public void setValue18(String value18) {
        this.value18 = value18;
    }

    public String getValue19() {
        return value19;
    }

    public void setValue19(String value19) {
        this.value19 = value19;
    }

    public String getValue20() {
        return value20;
    }

    public void setValue20(String value20) {
        this.value20 = value20;
    }

    public String getValue21() {
        return value21;
    }

    public void setValue21(String value21) {
        this.value21 = value21;
    }

    public String getValue22() {
        return value22;
    }

    public void setValue22(String value22) {
        this.value22 = value22;
    }

    public String getValue23() {
        return value23;
    }

    public void setValue23(String value23) {
        this.value23 = value23;
    }

    public String getValue24() {
        return value24;
    }

    public void setValue24(String value24) {
        this.value24 = value24;
    }

    public String getValue25() {
        return value25;
    }

    public void setValue25(String value25) {
        this.value25 = value25;
    }

    public String getValue26() {
        return value26;
    }

    public void setValue26(String value26) {
        this.value26 = value26;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TmpUssdData)) {
            return false;
        }
        TmpUssdData other = (TmpUssdData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.allianz.entities.TmpUssdData[ id=" + id + " ]";
    }

}

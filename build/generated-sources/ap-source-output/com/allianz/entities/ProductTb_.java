package com.allianz.entities;

import com.allianz.entities.ProductTbPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-07-18T06:16:17")
@StaticMetamodel(ProductTb.class)
public class ProductTb_ { 

    public static volatile SingularAttribute<ProductTb, Integer> pdtOthlifeWaitDays;
    public static volatile SingularAttribute<ProductTb, Date> pdtApprDt;
    public static volatile SingularAttribute<ProductTb, Integer> pdtReinstateDays;
    public static volatile SingularAttribute<ProductTb, String> pdtSts;
    public static volatile SingularAttribute<ProductTb, Integer> pdtMageTo;
    public static volatile SingularAttribute<ProductTb, Integer> pdtMageFrm;
    public static volatile SingularAttribute<ProductTb, String> pdtCode;
    public static volatile SingularAttribute<ProductTb, String> pdtName;
    public static volatile SingularAttribute<ProductTb, ProductTbPK> productTbPK;
    public static volatile SingularAttribute<ProductTb, Date> pdtEndDt;
    public static volatile SingularAttribute<ProductTb, String> pdtAppr;
    public static volatile SingularAttribute<ProductTb, Date> pdtSysDt;
    public static volatile SingularAttribute<ProductTb, String> pdtType;
    public static volatile SingularAttribute<ProductTb, Date> pdtStDt;
    public static volatile SingularAttribute<ProductTb, Integer> pdtMinTerm;
    public static volatile SingularAttribute<ProductTb, Integer> pdtMainlifeWaitDays;
    public static volatile SingularAttribute<ProductTb, String> pdtTcDoc;
    public static volatile SingularAttribute<ProductTb, Integer> pdtMaxTerm;
    public static volatile SingularAttribute<ProductTb, Integer> pdtGraceDays;
    public static volatile SingularAttribute<ProductTb, String> pdtPlnDepent;
    public static volatile SingularAttribute<ProductTb, Date> pdtCrtDt;

}
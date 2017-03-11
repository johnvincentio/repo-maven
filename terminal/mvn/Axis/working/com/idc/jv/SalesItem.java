/**
 * SalesItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.idc.jv;

public class SalesItem  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String icNumber;

    private java.lang.String category;

    private java.lang.String classification;

    private java.lang.String serialNumber;

    private java.lang.String make;

    private java.lang.String model;

    private int modelYear;

    private java.math.BigDecimal price;

    private java.lang.String meterCode;

    private int meterReading;

    private java.lang.String branch;

    private java.lang.String description;

    private java.lang.String hotDeal;

    private java.lang.String inventoryStatus;

    private java.math.BigDecimal investmentCost;

    private java.math.BigDecimal netBookValue;

    private java.math.BigDecimal fairMarketValue;

    private java.lang.String hotDealUrl;

    public SalesItem() {
    }

    public SalesItem(
           java.lang.String country,
           java.lang.String icNumber,
           java.lang.String category,
           java.lang.String classification,
           java.lang.String serialNumber,
           java.lang.String make,
           java.lang.String model,
           int modelYear,
           java.math.BigDecimal price,
           java.lang.String meterCode,
           int meterReading,
           java.lang.String branch,
           java.lang.String description,
           java.lang.String hotDeal,
           java.lang.String inventoryStatus,
           java.math.BigDecimal investmentCost,
           java.math.BigDecimal netBookValue,
           java.math.BigDecimal fairMarketValue,
           java.lang.String hotDealUrl) {
           this.country = country;
           this.icNumber = icNumber;
           this.category = category;
           this.classification = classification;
           this.serialNumber = serialNumber;
           this.make = make;
           this.model = model;
           this.modelYear = modelYear;
           this.price = price;
           this.meterCode = meterCode;
           this.meterReading = meterReading;
           this.branch = branch;
           this.description = description;
           this.hotDeal = hotDeal;
           this.inventoryStatus = inventoryStatus;
           this.investmentCost = investmentCost;
           this.netBookValue = netBookValue;
           this.fairMarketValue = fairMarketValue;
           this.hotDealUrl = hotDealUrl;
    }


    /**
     * Gets the country value for this SalesItem.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SalesItem.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the icNumber value for this SalesItem.
     * 
     * @return icNumber
     */
    public java.lang.String getIcNumber() {
        return icNumber;
    }


    /**
     * Sets the icNumber value for this SalesItem.
     * 
     * @param icNumber
     */
    public void setIcNumber(java.lang.String icNumber) {
        this.icNumber = icNumber;
    }


    /**
     * Gets the category value for this SalesItem.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SalesItem.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the classification value for this SalesItem.
     * 
     * @return classification
     */
    public java.lang.String getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this SalesItem.
     * 
     * @param classification
     */
    public void setClassification(java.lang.String classification) {
        this.classification = classification;
    }


    /**
     * Gets the serialNumber value for this SalesItem.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SalesItem.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the make value for this SalesItem.
     * 
     * @return make
     */
    public java.lang.String getMake() {
        return make;
    }


    /**
     * Sets the make value for this SalesItem.
     * 
     * @param make
     */
    public void setMake(java.lang.String make) {
        this.make = make;
    }


    /**
     * Gets the model value for this SalesItem.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this SalesItem.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the modelYear value for this SalesItem.
     * 
     * @return modelYear
     */
    public int getModelYear() {
        return modelYear;
    }


    /**
     * Sets the modelYear value for this SalesItem.
     * 
     * @param modelYear
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }


    /**
     * Gets the price value for this SalesItem.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this SalesItem.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the meterCode value for this SalesItem.
     * 
     * @return meterCode
     */
    public java.lang.String getMeterCode() {
        return meterCode;
    }


    /**
     * Sets the meterCode value for this SalesItem.
     * 
     * @param meterCode
     */
    public void setMeterCode(java.lang.String meterCode) {
        this.meterCode = meterCode;
    }


    /**
     * Gets the meterReading value for this SalesItem.
     * 
     * @return meterReading
     */
    public int getMeterReading() {
        return meterReading;
    }


    /**
     * Sets the meterReading value for this SalesItem.
     * 
     * @param meterReading
     */
    public void setMeterReading(int meterReading) {
        this.meterReading = meterReading;
    }


    /**
     * Gets the branch value for this SalesItem.
     * 
     * @return branch
     */
    public java.lang.String getBranch() {
        return branch;
    }


    /**
     * Sets the branch value for this SalesItem.
     * 
     * @param branch
     */
    public void setBranch(java.lang.String branch) {
        this.branch = branch;
    }


    /**
     * Gets the description value for this SalesItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SalesItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hotDeal value for this SalesItem.
     * 
     * @return hotDeal
     */
    public java.lang.String getHotDeal() {
        return hotDeal;
    }


    /**
     * Sets the hotDeal value for this SalesItem.
     * 
     * @param hotDeal
     */
    public void setHotDeal(java.lang.String hotDeal) {
        this.hotDeal = hotDeal;
    }


    /**
     * Gets the inventoryStatus value for this SalesItem.
     * 
     * @return inventoryStatus
     */
    public java.lang.String getInventoryStatus() {
        return inventoryStatus;
    }


    /**
     * Sets the inventoryStatus value for this SalesItem.
     * 
     * @param inventoryStatus
     */
    public void setInventoryStatus(java.lang.String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }


    /**
     * Gets the investmentCost value for this SalesItem.
     * 
     * @return investmentCost
     */
    public java.math.BigDecimal getInvestmentCost() {
        return investmentCost;
    }


    /**
     * Sets the investmentCost value for this SalesItem.
     * 
     * @param investmentCost
     */
    public void setInvestmentCost(java.math.BigDecimal investmentCost) {
        this.investmentCost = investmentCost;
    }


    /**
     * Gets the netBookValue value for this SalesItem.
     * 
     * @return netBookValue
     */
    public java.math.BigDecimal getNetBookValue() {
        return netBookValue;
    }


    /**
     * Sets the netBookValue value for this SalesItem.
     * 
     * @param netBookValue
     */
    public void setNetBookValue(java.math.BigDecimal netBookValue) {
        this.netBookValue = netBookValue;
    }


    /**
     * Gets the fairMarketValue value for this SalesItem.
     * 
     * @return fairMarketValue
     */
    public java.math.BigDecimal getFairMarketValue() {
        return fairMarketValue;
    }


    /**
     * Sets the fairMarketValue value for this SalesItem.
     * 
     * @param fairMarketValue
     */
    public void setFairMarketValue(java.math.BigDecimal fairMarketValue) {
        this.fairMarketValue = fairMarketValue;
    }


    /**
     * Gets the hotDealUrl value for this SalesItem.
     * 
     * @return hotDealUrl
     */
    public java.lang.String getHotDealUrl() {
        return hotDealUrl;
    }


    /**
     * Sets the hotDealUrl value for this SalesItem.
     * 
     * @param hotDealUrl
     */
    public void setHotDealUrl(java.lang.String hotDealUrl) {
        this.hotDealUrl = hotDealUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesItem)) return false;
        SalesItem other = (SalesItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.icNumber==null && other.getIcNumber()==null) || 
             (this.icNumber!=null &&
              this.icNumber.equals(other.getIcNumber()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.make==null && other.getMake()==null) || 
             (this.make!=null &&
              this.make.equals(other.getMake()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            this.modelYear == other.getModelYear() &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.meterCode==null && other.getMeterCode()==null) || 
             (this.meterCode!=null &&
              this.meterCode.equals(other.getMeterCode()))) &&
            this.meterReading == other.getMeterReading() &&
            ((this.branch==null && other.getBranch()==null) || 
             (this.branch!=null &&
              this.branch.equals(other.getBranch()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hotDeal==null && other.getHotDeal()==null) || 
             (this.hotDeal!=null &&
              this.hotDeal.equals(other.getHotDeal()))) &&
            ((this.inventoryStatus==null && other.getInventoryStatus()==null) || 
             (this.inventoryStatus!=null &&
              this.inventoryStatus.equals(other.getInventoryStatus()))) &&
            ((this.investmentCost==null && other.getInvestmentCost()==null) || 
             (this.investmentCost!=null &&
              this.investmentCost.equals(other.getInvestmentCost()))) &&
            ((this.netBookValue==null && other.getNetBookValue()==null) || 
             (this.netBookValue!=null &&
              this.netBookValue.equals(other.getNetBookValue()))) &&
            ((this.fairMarketValue==null && other.getFairMarketValue()==null) || 
             (this.fairMarketValue!=null &&
              this.fairMarketValue.equals(other.getFairMarketValue()))) &&
            ((this.hotDealUrl==null && other.getHotDealUrl()==null) || 
             (this.hotDealUrl!=null &&
              this.hotDealUrl.equals(other.getHotDealUrl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getIcNumber() != null) {
            _hashCode += getIcNumber().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getMake() != null) {
            _hashCode += getMake().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        _hashCode += getModelYear();
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getMeterCode() != null) {
            _hashCode += getMeterCode().hashCode();
        }
        _hashCode += getMeterReading();
        if (getBranch() != null) {
            _hashCode += getBranch().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHotDeal() != null) {
            _hashCode += getHotDeal().hashCode();
        }
        if (getInventoryStatus() != null) {
            _hashCode += getInventoryStatus().hashCode();
        }
        if (getInvestmentCost() != null) {
            _hashCode += getInvestmentCost().hashCode();
        }
        if (getNetBookValue() != null) {
            _hashCode += getNetBookValue().hashCode();
        }
        if (getFairMarketValue() != null) {
            _hashCode += getFairMarketValue().hashCode();
        }
        if (getHotDealUrl() != null) {
            _hashCode += getHotDealUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.rouseservices.com/", "SalesItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "icNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("make");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "make"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "modelYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "meterCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterReading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "meterReading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "branch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotDeal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "hotDeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "inventoryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investmentCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "investmentCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netBookValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "netBookValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairMarketValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "fairMarketValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotDealUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.rouseservices.com/", "hotDealUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

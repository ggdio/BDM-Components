/**
 * SystemCPUUsageExtended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.produban.openbus.f5.api;

public class SystemCPUUsageExtended  implements java.io.Serializable {
    private String host_id;

    private CommonStatistic[][] statistics;

    public SystemCPUUsageExtended() {
    }

    public SystemCPUUsageExtended(
           String host_id,
           CommonStatistic[][] statistics) {
           this.host_id = host_id;
           this.statistics = statistics;
    }


    /**
     * Gets the host_id value for this SystemCPUUsageExtended.
     * 
     * @return host_id
     */
    public String getHost_id() {
        return host_id;
    }


    /**
     * Sets the host_id value for this SystemCPUUsageExtended.
     * 
     * @param host_id
     */
    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }


    /**
     * Gets the statistics value for this SystemCPUUsageExtended.
     * 
     * @return statistics
     */
    public CommonStatistic[][] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this SystemCPUUsageExtended.
     * 
     * @param statistics
     */
    public void setStatistics(CommonStatistic[][] statistics) {
        this.statistics = statistics;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SystemCPUUsageExtended)) return false;
        SystemCPUUsageExtended other = (SystemCPUUsageExtended) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.host_id==null && other.getHost_id()==null) || 
             (this.host_id!=null &&
              this.host_id.equals(other.getHost_id()))) &&
            ((this.statistics==null && other.getStatistics()==null) || 
             (this.statistics!=null &&
              java.util.Arrays.equals(this.statistics, other.getStatistics())));
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
        if (getHost_id() != null) {
            _hashCode += getHost_id().hashCode();
        }
        if (getStatistics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatistics());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStatistics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemCPUUsageExtended.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.CPUUsageExtended"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.StatisticSequence"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

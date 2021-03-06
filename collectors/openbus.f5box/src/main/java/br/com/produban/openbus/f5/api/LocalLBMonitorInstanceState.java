/**
 * LocalLBMonitorInstanceState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.produban.openbus.f5.api;

public class LocalLBMonitorInstanceState  implements java.io.Serializable {
    private LocalLBMonitorInstance instance;

    private LocalLBMonitorInstanceStateType instance_state;

    private boolean enabled_state;

    public LocalLBMonitorInstanceState() {
    }

    public LocalLBMonitorInstanceState(
           LocalLBMonitorInstance instance,
           LocalLBMonitorInstanceStateType instance_state,
           boolean enabled_state) {
           this.instance = instance;
           this.instance_state = instance_state;
           this.enabled_state = enabled_state;
    }


    /**
     * Gets the instance value for this LocalLBMonitorInstanceState.
     * 
     * @return instance
     */
    public LocalLBMonitorInstance getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this LocalLBMonitorInstanceState.
     * 
     * @param instance
     */
    public void setInstance(LocalLBMonitorInstance instance) {
        this.instance = instance;
    }


    /**
     * Gets the instance_state value for this LocalLBMonitorInstanceState.
     * 
     * @return instance_state
     */
    public LocalLBMonitorInstanceStateType getInstance_state() {
        return instance_state;
    }


    /**
     * Sets the instance_state value for this LocalLBMonitorInstanceState.
     * 
     * @param instance_state
     */
    public void setInstance_state(LocalLBMonitorInstanceStateType instance_state) {
        this.instance_state = instance_state;
    }


    /**
     * Gets the enabled_state value for this LocalLBMonitorInstanceState.
     * 
     * @return enabled_state
     */
    public boolean isEnabled_state() {
        return enabled_state;
    }


    /**
     * Sets the enabled_state value for this LocalLBMonitorInstanceState.
     * 
     * @param enabled_state
     */
    public void setEnabled_state(boolean enabled_state) {
        this.enabled_state = enabled_state;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocalLBMonitorInstanceState)) return false;
        LocalLBMonitorInstanceState other = (LocalLBMonitorInstanceState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              this.instance.equals(other.getInstance()))) &&
            ((this.instance_state==null && other.getInstance_state()==null) || 
             (this.instance_state!=null &&
              this.instance_state.equals(other.getInstance_state()))) &&
            this.enabled_state == other.isEnabled_state();
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
        if (getInstance() != null) {
            _hashCode += getInstance().hashCode();
        }
        if (getInstance_state() != null) {
            _hashCode += getInstance_state().hashCode();
        }
        _hashCode += (isEnabled_state() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBMonitorInstanceState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstance"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instance_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceStateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

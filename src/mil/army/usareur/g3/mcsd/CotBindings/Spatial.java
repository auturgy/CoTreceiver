//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:34:27 AM CEST 
//
package mil.army.usareur.g3.mcsd.CotBindings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attitude">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="roll" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="-180"/>
 *                       &lt;maxInclusive value="180"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="pitch" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;maxInclusive value="180"/>
 *                       &lt;minExclusive value="-180"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="yaw">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;maxInclusive value="180"/>
 *                       &lt;minExclusive value="-180"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="eRoll">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ePitch">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="eYaw">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="spin">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="roll" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="pitch" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="yaw">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="eRoll">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ePitch">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="eYaw">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;minExclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attitude",
    "spin"
})
@XmlRootElement(name = "spatial")
public class Spatial {

    @XmlElement(required = true)
    protected Spatial.Attitude attitude;
    @XmlElement(required = true)
    protected Spatial.Spin spin;
    @XmlAttribute(name = "version")
    protected double version;

    /**
     * Gets the value of the attitude property.
     *
     * @return possible object is {@link Spatial.Attitude }
     *
     */
    public Spatial.Attitude getAttitude() {
        return attitude;
    }

    /**
     * Sets the value of the attitude property.
     *
     * @param value allowed object is {@link Spatial.Attitude }
     *
     */
    public void setAttitude(Spatial.Attitude value) {
        this.attitude = value;
    }

    /**
     * Gets the value of the spin property.
     *
     * @return possible object is {@link Spatial.Spin }
     *
     */
    public Spatial.Spin getSpin() {
        return spin;
    }

    /**
     * Sets the value of the spin property.
     *
     * @param value allowed object is {@link Spatial.Spin }
     *
     */
    public void setSpin(Spatial.Spin value) {
        this.spin = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link double }
     *
     */
    public double getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link double }
     *
     */
    public void setVersion(double value) {
        this.version = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="roll" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="-180"/>
     *             &lt;maxInclusive value="180"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="pitch" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;maxInclusive value="180"/>
     *             &lt;minExclusive value="-180"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="yaw">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;maxInclusive value="180"/>
     *             &lt;minExclusive value="-180"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="eRoll">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ePitch">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="eYaw">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Attitude {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "roll", required = true)
        protected double roll;
        @XmlAttribute(name = "pitch", required = true)
        protected double pitch;
        @XmlAttribute(name = "yaw")
        protected double yaw;
        @XmlAttribute(name = "eRoll")
        protected double eRoll;
        @XmlAttribute(name = "ePitch")
        protected double ePitch;
        @XmlAttribute(name = "eYaw")
        protected double eYaw;

        /**
         * Gets the value of the any property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the any property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the roll property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getRoll() {
            return roll;
        }

        /**
         * Sets the value of the roll property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setRoll(double value) {
            this.roll = value;
        }

        /**
         * Gets the value of the pitch property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getPitch() {
            return pitch;
        }

        /**
         * Sets the value of the pitch property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setPitch(double value) {
            this.pitch = value;
        }

        /**
         * Gets the value of the yaw property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getYaw() {
            return yaw;
        }

        /**
         * Sets the value of the yaw property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setYaw(double value) {
            this.yaw = value;
        }

        /**
         * Gets the value of the eRoll property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getERoll() {
            return eRoll;
        }

        /**
         * Sets the value of the eRoll property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setERoll(double value) {
            this.eRoll = value;
        }

        /**
         * Gets the value of the ePitch property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getEPitch() {
            return ePitch;
        }

        /**
         * Sets the value of the ePitch property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setEPitch(double value) {
            this.ePitch = value;
        }

        /**
         * Gets the value of the eYaw property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getEYaw() {
            return eYaw;
        }

        /**
         * Sets the value of the eYaw property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setEYaw(double value) {
            this.eYaw = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="roll" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="pitch" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="yaw">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="eRoll">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ePitch">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="eYaw">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;minExclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Spin {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "roll", required = true)
        protected double roll;
        @XmlAttribute(name = "pitch", required = true)
        protected double pitch;
        @XmlAttribute(name = "yaw")
        protected double yaw;
        @XmlAttribute(name = "eRoll")
        protected double eRoll;
        @XmlAttribute(name = "ePitch")
        protected double ePitch;
        @XmlAttribute(name = "eYaw")
        protected double eYaw;

        /**
         * Gets the value of the any property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the any property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the roll property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getRoll() {
            return roll;
        }

        /**
         * Sets the value of the roll property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setRoll(double value) {
            this.roll = value;
        }

        /**
         * Gets the value of the pitch property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getPitch() {
            return pitch;
        }

        /**
         * Sets the value of the pitch property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setPitch(double value) {
            this.pitch = value;
        }

        /**
         * Gets the value of the yaw property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getYaw() {
            return yaw;
        }

        /**
         * Sets the value of the yaw property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setYaw(double value) {
            this.yaw = value;
        }

        /**
         * Gets the value of the eRoll property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getERoll() {
            return eRoll;
        }

        /**
         * Sets the value of the eRoll property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setERoll(double value) {
            this.eRoll = value;
        }

        /**
         * Gets the value of the ePitch property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getEPitch() {
            return ePitch;
        }

        /**
         * Sets the value of the ePitch property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setEPitch(double value) {
            this.ePitch = value;
        }

        /**
         * Gets the value of the eYaw property.
         *
         * @return possible object is {@link double }
         *
         */
        public double getEYaw() {
            return eYaw;
        }

        /**
         * Sets the value of the eYaw property.
         *
         * @param value allowed object is {@link double }
         *
         */
        public void setEYaw(double value) {
            this.eYaw = value;
        }

    }

}
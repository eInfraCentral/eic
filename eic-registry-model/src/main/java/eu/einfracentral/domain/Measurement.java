package eu.einfracentral.domain;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlType
@XmlRootElement(namespace = "http://einfracentral.eu")
public class Measurement<T> implements Identifiable {
    @XmlElement(required = true)
    private String id;
    @XmlElement(required = true)
    private Indicator indicator;
    @XmlElement(required = true)
    private Object value;
    @XmlElement
    private XMLGregorianCalendar time;
    @XmlElement
    private String[] location;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public XMLGregorianCalendar getTime() {
        return time;
    }

    public void setTime(XMLGregorianCalendar time) {
        this.time = time;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }
}
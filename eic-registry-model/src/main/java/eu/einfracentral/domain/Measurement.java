package eu.einfracentral.domain;

import eu.einfracentral.annotation.FieldValidation;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Deprecated
@XmlType
@XmlRootElement(namespace = "http://einfracentral.eu")
public class Measurement implements Identifiable {
    @XmlElement(required = true)
    @ApiModelProperty(position = 1, notes = "Autogenerated")
    @FieldValidation
    private String id;

    @XmlElement(required = true)
    @ApiModelProperty(position = 2)
    @FieldValidation(containsId = true, idClass = Indicator.class)
    private String indicatorId;

    @XmlElement(required = true)
    @ApiModelProperty(position = 3)
    @FieldValidation
    private String serviceId;

    @XmlElement
    @ApiModelProperty(position = 4, example = "2020-01-01", notes = "Timestamp of the measurement")
    @FieldValidation(nullable = true)
    private XMLGregorianCalendar time;

    @XmlElementWrapper(name = "locations")
    @XmlElement(name = "location")
    @ApiModelProperty(position = 5)
    @FieldValidation(nullable = true)
    private List<String> locations;

    @XmlElement(required = true)
    @ApiModelProperty(position = 6)
    @FieldValidation
    private boolean valueIsRange;

    @XmlElement
    @ApiModelProperty(position = 7)
    @FieldValidation(nullable = true)
    private String value;

    @XmlElement
    @ApiModelProperty(position = 8)
    @FieldValidation(nullable = true)
    private RangeValue rangeValue;


    public Measurement() {

    }

    public Measurement(Measurement measurement) {
        this.id = measurement.getId();
        this.indicatorId = measurement.getIndicatorId();
        this.serviceId = measurement.getServiceId();
        this.valueIsRange = measurement.getValueIsRange();
        this.value = measurement.getValue();
        this.rangeValue = measurement.getRangeValue();
        this.time = measurement.getTime();
        this.locations = measurement.getLocations();
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "id='" + id + '\'' +
                ", indicatorId='" + indicatorId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", time=" + time +
                ", locations=" + locations +
                ", valueIsRange=" + valueIsRange +
                ", value='" + value + '\'' +
                ", rangeValue=" + rangeValue +
                '}';
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RangeValue getRangeValue() {
        return rangeValue;
    }

    public void setRangeValue(RangeValue rangeValue) {
        this.rangeValue = rangeValue;
    }

    public XMLGregorianCalendar getTime() {
        return time;
    }

    public void setTime(XMLGregorianCalendar time) {
        this.time = time;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public boolean getValueIsRange() {
        return valueIsRange;
    }

    public void setValueIsRange(boolean valueIsRange) {
        this.valueIsRange = valueIsRange;
    }
}

package com.newbiest.vanchip.dto.vlm;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement(name = "Body")
@XmlAccessorType(XmlAccessType.FIELD)
public class VLMRequestBody implements Serializable {

    @XmlElement(name ="getBoxID_20190403")
    private GetBoxID getBoxID;
}

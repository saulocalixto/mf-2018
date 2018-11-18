package com.github.com.saulocalixto.dto.Parser;

import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class ParserDto<T> {

    private transient Class<T> generico;

    public ParserDto() {
        generico = (Class<T>)this.getClass();
    }

    private Gson GsonCreator() {
        return new Gson();
    }

    private JAXBContext JAXContextCreator() throws JAXBException {
        return JAXBContext.newInstance(generico);
    }

    public T fromJson(String json) {
        return GsonCreator().fromJson(json != null ? json.trim() : "", generico);
    }

    public String toJson() {
        return this != null ? GsonCreator().toJson(this) : "";
    }

    public String toXml() {
        StringWriter sw = new StringWriter();
        try {
            Marshaller marshaller = JAXContextCreator().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, sw);
        } catch(JAXBException e) {
            System.out.println(e.getMessage());
        }

        return sw.toString();
    }

    public T fromXml(String xml) {
        StringReader xmlToConvert = new StringReader(xml);
        try {
            Unmarshaller unmarshaller = JAXContextCreator().createUnmarshaller();
            T objeto = (T) unmarshaller.unmarshal(xmlToConvert);
            return objeto;
        } catch(JAXBException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

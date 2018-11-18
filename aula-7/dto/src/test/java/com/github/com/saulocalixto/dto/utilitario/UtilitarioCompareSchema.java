package com.github.com.saulocalixto.dto.utilitario;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.Assertions;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UtilitarioCompareSchema {
    public static void valideSchemaJson(String nomeSchema, String nomeJson) {
        File resourcesDirectory = new File("src/test/resources");
        final String jsonSchema = nomeSchema;
        final String jsonFileName = nomeJson;
        try {
            File schemaFile = new File(resourcesDirectory.getAbsolutePath() +
                    "/jsonSchema/" + jsonSchema);
            BufferedReader brSchema =
                    new BufferedReader(new FileReader(schemaFile));
            File jsonFile = new File(resourcesDirectory.getAbsolutePath() +
                    "/arquivosJson/" + jsonFileName);
            BufferedReader brJson =
                    new BufferedReader(new FileReader(jsonFile));

            JSONObject rawSchema = new JSONObject(new JSONTokener(brSchema));
            org.everit.json.schema.Schema schema =
                    org.everit.json.schema.loader.SchemaLoader.load(rawSchema);
            JSONObject json = new JSONObject(new JSONTokener(brJson));
            schema.validate(json);

            Assertions.assertTrue(true);
        } catch (Exception e) {
            Assertions.assertTrue(false);
        }
    }

    public static void valideSchemaXml(String nomeSchema, String nomeXml) {
        File resourcesDirectory = new File("src/test/resources");
        File schemaFile = new File(resourcesDirectory.getAbsolutePath() +
                "/xmlSchema/" + nomeSchema);
        Source xmlFile =
                new StreamSource(new File(resourcesDirectory.getAbsolutePath() +
                        "/arquivosXml/" + nomeXml));
        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            Assertions.assertTrue(true);
        } catch (Exception e) {
            Assertions.assertTrue(false);
        }
    }
}

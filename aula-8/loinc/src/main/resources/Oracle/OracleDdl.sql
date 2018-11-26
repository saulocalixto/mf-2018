CREATE TABLE Loinc
(
  LOINC_NUM                  VARCHAR2(10),
  COMPONENT                  VARCHAR2(255),
  PROPERTY                   VARCHAR2(255),
  TIME_ASPCT                 VARCHAR2(255),
  SYSTEM                     VARCHAR2(255),
  SCALE_TYP                  VARCHAR2(255),
  METHOD_TYP                 VARCHAR2(255),
  CLASS                      VARCHAR2(255),
  VersionLastChanged         VARCHAR2(255),
  CHNG_TYPE                  VARCHAR2(255),
  DEFINITIONDESCRIPTION      CLOB,
  STATUS                     VARCHAR2(255),
  CONSUMER_NAME              VARCHAR2(255),
  CLASSTYPE                  VARCHAR(2),
  FORMULA                    CLOB,
  SPECIES                    VARCHAR2(20),
  EXMPL_ANSWERS              CLOB,
  SURVEY_QUEST_TEXT          CLOB,
  SURVEY_QUEST_SRC           VARCHAR2(50),
  UNITSREQUIRED              VARCHAR2(1),
  SUBMITTED_UNITS            VARCHAR2(30),
  RELATEDNAMES2              CLOB,
  SHORTNAME                  VARCHAR2(255),
  ORDER_OBS                  VARCHAR2(15),
  CDISC_COMMON_TESTS         VARCHAR2(1),
  HL7_FIELD_SUBFIELD_ID      VARCHAR2(50),
  EXTERNAL_COPYRIGHT_NOTICE  CLOB,
  EXAMPLE_UNITS              VARCHAR2(255),
  LONG_COMMON_NAME           VARCHAR2(255),
  UNITSANDRANGE   					 CLOB,
  DOCUMENT_SECTION           VARCHAR2(255),
  EXAMPLE_UCUM_UNITS         VARCHAR2(255),
  EXAMPLE_SI_UCUM_UNITS      VARCHAR2(255),
  STATUS_REASON              VARCHAR2(9),
  STATUS_TEXT                CLOB,
  CHANGE_REASON_PUBLIC       CLOB,
  COMMON_TEST_RANK           VARCHAR2(20),
  COMMON_ORDER_RANK          VARCHAR2(20),
  COMMON_SI_TEST_RANK        VARCHAR2(20),
  HL7_ATTACHMENT_STRUCTURE   VARCHAR2(15),
  EXTERNAL_COPYRIGHT_LINK    VARCHAR2(255),
  PANELTYPE                  VARCHAR2(50),
	ASKATORDERENTRY            VARCHAR2(255),
	ASSOCIATEDOBSERVATIONS     VARCHAR2(255),
	VersionFirstReleased       VARCHAR2(255),
	ValidHL7AttachmentRequest  VARCHAR2(50)
);

CREATE TABLE MapTo
(
  LOINC      VARCHAR2(10),
  MAP_TO     VARCHAR2(10),
  "COMMENT"  CLOB
);

CREATE TABLE SourceOrganization
(
	COPYRIGHT_ID	VARCHAR2(255),
  NAME          VARCHAR2(255),
  COPYRIGHT     CLOB,
  TERMS_OF_USE  CLOB,
  URL           VARCHAR2(4000)
);

EXIT;

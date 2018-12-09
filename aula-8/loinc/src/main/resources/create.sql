DROP TABLE loinc IF EXISTS;

CREATE TABLE loinc(
   LOINC_NUM                 VARCHAR(7) NOT NULL PRIMARY KEY
  ,COMPONENT                 VARCHAR(246) NOT NULL
  ,PROPERTY                  VARCHAR(29)
  ,TIME_ASPCT                VARCHAR(15)
  ,SYSTEM                    VARCHAR(106)
  ,SCALE_TYP                 VARCHAR(5)
  ,METHOD_TYP                VARCHAR(57)
  ,CLASS                     VARCHAR(20) NOT NULL
  ,CLASSTYPE                 INTEGER  NOT NULL
  ,LONG_COMMON_NAME          VARCHAR(254) NOT NULL
  ,SHORTNAME                 VARCHAR(51)
  ,EXTERNAL_COPYRIGHT_NOTICE VARCHAR(2544)
  ,STATUS                    VARCHAR(11) NOT NULL
  ,VersionFirstReleased      VARCHAR(7) NOT NULL
  ,VersionLastChanged        VARCHAR(5) NOT NULL
);

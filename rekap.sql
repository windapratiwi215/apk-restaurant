--------------------------------------------------------
--  File created - Saturday-December-19-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table REKAP
--------------------------------------------------------

  CREATE TABLE "REKAP" 
   (	"ID_MENU" VARCHAR2(5 BYTE), 
	"JUMLAH" NUMBER(3,0), 
	"TANGGAL" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into REKAP
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table REKAP
--------------------------------------------------------

  ALTER TABLE "REKAP" MODIFY ("ID_MENU" NOT NULL ENABLE);
 
  ALTER TABLE "REKAP" MODIFY ("JUMLAH" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table REKAP
--------------------------------------------------------

  ALTER TABLE "REKAP" ADD CONSTRAINT "REK_ID_FK" FOREIGN KEY ("ID_MENU")
	  REFERENCES "MENU" ("ID_MENU") ENABLE;

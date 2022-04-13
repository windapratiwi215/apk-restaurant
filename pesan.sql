--------------------------------------------------------
--  File created - Thursday-December-17-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PESAN
--------------------------------------------------------

  CREATE TABLE "PESAN" 
   (	"ID_MENU" VARCHAR2(5 BYTE), 
	"NAMA" VARCHAR2(20 BYTE), 
	"HARGA" NUMBER(8,0), 
	"JUMLAH" NUMBER(3,0), 
	"SUBTOTAL" NUMBER(8,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into PESAN
SET DEFINE OFF;
Insert into PESAN (ID_MENU,NAMA,HARGA,JUMLAH,SUBTOTAL) values ('B001','Es Teh','5000','2','10000');
--------------------------------------------------------
--  Constraints for Table PESAN
--------------------------------------------------------

  ALTER TABLE "PESAN" MODIFY ("ID_MENU" NOT NULL ENABLE);
 
  ALTER TABLE "PESAN" MODIFY ("NAMA" NOT NULL ENABLE);
 
  ALTER TABLE "PESAN" MODIFY ("HARGA" NOT NULL ENABLE);
 
  ALTER TABLE "PESAN" MODIFY ("JUMLAH" NOT NULL ENABLE);
 
  ALTER TABLE "PESAN" MODIFY ("SUBTOTAL" NOT NULL ENABLE);

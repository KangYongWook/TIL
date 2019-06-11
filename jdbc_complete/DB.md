```sql
CREATE TABLE PRODUCTS(
   PDNO      NUMBER       NOT NULL,
   PDNAME    VARCHAR2(10) NOT NULL,
   PDSUBNAME VARCHAR2(10) NOT NULL,
   FACTNO    VARCHAR2(5)  NOT NULL,
   PDDATE    DATE         NOT NULL,
   PDCOST    NUMBER       NOT NULL,
   PDPRICE   NUMBER       NOT NULL,
   PDAMOUNT  NUMBER       NOT NULL  
)

ALTER TABLE PRODUCTS ADD PRIMARY KEY(PDNO)
DESC PRODUCTS 

CREATE TABLE FACTORY(
   FACTNO   VARCHAR2(5)   NOT NULL,
   FACNAME  VARCHAR2(14)  NOT NULL,
   FACLOC   VARCHAR2(13)  NOT NULL
)

ALTER TABLE FACTORY ADD PRIMARY KEY(FACTNO)
ALTER TABLE PRODUCTS ADD [CONSTRAINT FK] FOREIGN KEY (FACTNO) REFERENCES FACTORY (FACTNO) 
DESC FACTORY

INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(001,'핸드폰','갤럭10','1111',SYSDATE,20000,25000,10)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(002,'핸드폰','V40','2222',SYSDATE,19000,24000,30)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(003,'데이터','5G','3333',SYSDATE,2000,2500,999)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(004,'데이터','4G','4444',SYSDATE,1800,2300,999)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(005,'원유','경유','5555',SYSDATE,100,2000,9999)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(006,'OS','WIN','6666',SYSDATE,5000,40000,100)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(007,'OS','MAC','7777',SYSDATE,4000,50000,100)
INSERT INTO PRODUCTS (PDNO,PDNAME,PDSUBNAME,FACTNO,PDDATE,PDCOST,PDPRICE,PDAMOUNT) VALUES(008,'OS','AND','8888',SYSDATE,4000,30000,100)

INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(1111,'SAMSUNG','서울')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(2222,'LG','서울')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(3333,'SK','서울')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(4444,'KT','경기도')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(5555,'GS','서울')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(6666,'MIST','워싱턴')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(7777,'APPLE','캘리포')
INSERT INTO FACTORY (FACTNO,FACNAME,FACLOC) VALUES(8888,'GOOGLE','캘리포')

SELECT * FROM PRODUCTS
SELECT * FROM FACTORY
```

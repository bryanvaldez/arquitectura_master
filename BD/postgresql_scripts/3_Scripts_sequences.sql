DROP TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO;
DROP TABLE IF EXISTS esqmicroservicios.TBL_PRODUCTO;
DROP TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE;
DROP TABLE IF EXISTS esqmicroservicios.TBL_EMPRESA;

DROP SEQUENCE IF EXISTS esqmicroservicios."SEQ_TBL_CLIENTE_PRODUCTO";
DROP SEQUENCE IF EXISTS esqmicroservicios."SEQ_TBL_PRODUCTO";
DROP SEQUENCE IF EXISTS esqmicroservicios."SEQ_TBL_CLIENTE";
DROP SEQUENCE IF EXISTS esqmicroservicios."SEQ_TBL_EMPRESA";

CREATE SEQUENCE esqmicroservicios."SEQ_TBL_CLIENTE_PRODUCTO"
   INCREMENT 1
   START 1
   MINVALUE 1
   MAXVALUE 99999
   CACHE 1;
ALTER SEQUENCE esqmicroservicios."SEQ_TBL_CLIENTE_PRODUCTO" OWNER TO postgres;

CREATE SEQUENCE esqmicroservicios."SEQ_TBL_PRODUCTO"
   INCREMENT 1
   START 1
   MINVALUE 1
   MAXVALUE 99999
   CACHE 1;
ALTER SEQUENCE esqmicroservicios."SEQ_TBL_PRODUCTO" OWNER TO postgres;

CREATE SEQUENCE esqmicroservicios."SEQ_TBL_CLIENTE"
   INCREMENT 1
   START 1
   MINVALUE 1
   MAXVALUE 99999
   CACHE 1;
ALTER SEQUENCE esqmicroservicios."SEQ_TBL_CLIENTE" OWNER TO postgres;

CREATE SEQUENCE esqmicroservicios."SEQ_TBL_EMPRESA"
   INCREMENT 1
   START 1
   MINVALUE 1
   MAXVALUE 99999
   CACHE 1;
ALTER SEQUENCE esqmicroservicios."SEQ_TBL_EMPRESA" OWNER TO postgres;
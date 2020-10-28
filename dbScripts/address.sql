-- Table: public.address

-- DROP TABLE public.address;

CREATE TABLE public.address
(
    id serial,
    street1 character varying(50) COLLATE pg_catalog."default" NOT NULL,
    street2 character varying(50) COLLATE pg_catalog."default",
    city character varying(20) COLLATE pg_catalog."default" NOT NULL,
    state character varying(2) COLLATE pg_catalog."default" NOT NULL,
    zip_code character varying(10) COLLATE pg_catalog."default" NOT NULL
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.address
    OWNER to postgres;
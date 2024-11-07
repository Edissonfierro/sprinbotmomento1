CREATE TABLE IF NOT EXISTS cliente (
    id SERIAL,
    nui VARCHAR (13) NOT NULL,
    fullname VARCHAR (100) NOT NULL,
    addres VARCHAR (50),
    PRIMARY KEY (id),
    UNIQUE (nui)
    );
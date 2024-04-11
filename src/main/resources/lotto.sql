CREATE TABLE lottorekker
(
    rekkeid SMALLINT NOT NULL AUTO_INCREMENT,
    tall0 CHAR(2),
    tall1 CHAR(2),
    tall2 CHAR(2),
    tall3 CHAR(2),
    tall4 CHAR(2),
    tall5 CHAR(2),
    tall6 CHAR(2),
    PRIMARY KEY (rekkeid)
);

CREATE TABLE vinnertall
(
    vinnerid SMALLINT NOT NULL AUTO_INCREMENT,
    tall0 CHAR(2),
    tall1 CHAR(2),
    tall2 CHAR(2),
    tall3 CHAR(2),
    tall4 CHAR(2),
    tall5 CHAR(2),
    tall6 CHAR(2),
    PRIMARY KEY (vinnerid)
);
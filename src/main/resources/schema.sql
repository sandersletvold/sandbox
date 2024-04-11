CREATE TABLE lottorekker
(
    rekkeId SMALLINT NOT NULL AUTO_INCREMENT,
    tall0 SMALLINT,
    tall1 SMALLINT,
    tall2 SMALLINT,
    tall3 SMALLINT,
    tall4 SMALLINT,
    tall5 SMALLINT,
    tall6 SMALLINT,
    PRIMARY KEY (rekkeid)
);

CREATE TABLE vinnertall
(
    vinnerId SMALLINT NOT NULL AUTO_INCREMENT,
    vinnertall0 SMALLINT,
    vinnertall1 SMALLINT,
    vinnertall2 SMALLINT,
    vinnertall3 SMALLINT,
    vinnertall4 SMALLINT,
    vinnertall5 SMALLINT,
    vinnertall6 SMALLINT,
    PRIMARY KEY (vinnerId)
);
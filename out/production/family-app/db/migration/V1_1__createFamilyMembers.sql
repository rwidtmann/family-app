CREATE TABLE family_members
(
  id          INT AUTO_INCREMENT
    PRIMARY KEY,
  first_name            VARCHAR(255) NULL,
  last_name             VARCHAR(255) NULL,
  middle_name           VARCHAR(255) NULL,
  maiden_name           VARCHAR(255) NULL,
  dob                   DATETIME     NULL
);


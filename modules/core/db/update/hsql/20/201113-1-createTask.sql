create table DROPS_TASK (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    KEY_ varchar(255),
    EPIC_ID varchar(36),
    PARENT_ID varchar(36),
    --
    primary key (ID)
);
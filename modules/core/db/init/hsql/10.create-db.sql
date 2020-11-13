-- begin DROPS_EPIC
create table DROPS_EPIC (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    KEY_ varchar(255),
    INITIATIVE_ID varchar(36),
    --
    primary key (ID)
)^
-- end DROPS_EPIC
-- begin DROPS_TASK
create table DROPS_TASK (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    KEY_ varchar(255),
    EPIC_ID varchar(36),
    PARENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end DROPS_TASK
-- begin DROPS_INITIATIVE
create table DROPS_INITIATIVE (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    KEY_ varchar(255),
    PROJECT_ID varchar(36),
    --
    primary key (ID)
)^
-- end DROPS_INITIATIVE
-- begin DROPS_PROJECT
create table DROPS_PROJECT (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    UID_ varchar(255),
    PORTFOLIO_ID varchar(36),
    --
    primary key (ID)
)^
-- end DROPS_PROJECT
-- begin DROPS_PORTFOLIO
create table DROPS_PORTFOLIO (
    ID varchar(36) not null,
    --
    NAME varchar(255),
    KEY_ varchar(255),
    --
    primary key (ID)
)^
-- end DROPS_PORTFOLIO
-- begin SEC_USER
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'drops_ExtUser' where DTYPE is null ^
-- end SEC_USER

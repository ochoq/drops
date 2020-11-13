alter table DROPS_TASK add constraint FK_DROPS_TASK_ON_EPIC foreign key (EPIC_ID) references DROPS_EPIC(ID) on delete CASCADE;
alter table DROPS_TASK add constraint FK_DROPS_TASK_ON_PARENT foreign key (PARENT_ID) references DROPS_TASK(ID) on delete CASCADE;
create index IDX_DROPS_TASK_ON_EPIC on DROPS_TASK (EPIC_ID);
create index IDX_DROPS_TASK_ON_PARENT on DROPS_TASK (PARENT_ID);

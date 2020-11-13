alter table DROPS_PROJECT add constraint FK_DROPS_PROJECT_ON_PORTFOLIO foreign key (PORTFOLIO_ID) references DROPS_PORTFOLIO(ID) on delete CASCADE;
create index IDX_DROPS_PROJECT_ON_PORTFOLIO on DROPS_PROJECT (PORTFOLIO_ID);

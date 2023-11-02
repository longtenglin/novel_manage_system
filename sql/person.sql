create table if not exists person
(
    id                varchar(16)                                                                            not null,
    person_name        varchar(64)                                                                            not null,
    age        varchar(16)                                                                            not null,
    person_description varchar(2048),
    person_attribute      varchar(64)                                                                            not null,
    deleted           integer     default 0                                                                  not null,
    create_time       timestamp                                                                              not null,
    creator           varchar(64) default 'SYS'::character varying                                           not null,
    update_time       timestamp                                                                              not null,
    updater           varchar(64) default 'SYS'::character varying                                           not null,
    constraint person_pk
    primary key (id)
    );

comment on table person is '用于存储小说信息';

alter table person
    owner to novel_manage_system;

create unique index if not exists person_id_uindex
    on person (id);


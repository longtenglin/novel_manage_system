create table if not exists novel
(
    id                varchar(16) default (('LTL'::text || 'N'::text) ||
                                           to_char(nextval('sequence_novel_id'::regclass), 'FM00000'::text)) not null,
    novel_name        varchar(64)                                                                            not null,
    novel_type        varchar(64)                                                                            not null,
    novel_description varchar(2048),
    novel_author      varchar(64)                                                                            not null,
    deleted           integer     default 0                                                                  not null,
    novel_pub_date    timestamp,
    create_time       timestamp                                                                              not null,
    creator           varchar(64) default 'SYS'::character varying                                           not null,
    update_time       timestamp                                                                              not null,
    updater           varchar(64) default 'SYS'::character varying                                           not null,
    constraint novel_pk
        primary key (id)
);

comment on table novel is '用于存储小说信息';

alter table novel
    owner to novel_manage_system;

create unique index if not exists novel_id_uindex
    on novel (id);


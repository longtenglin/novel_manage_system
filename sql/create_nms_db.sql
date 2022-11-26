------------------------------------------
-- Sequence of Table novel's id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_novel_id
    INCREMENT BY 1
    MINVALUE 0
    NO MAXVALUE
    START WITH 0
    CACHE 1
    NO CYCLE
    OWNED BY novel_manage_system.public.novel.id;

ALTER TABLE novel ALTER COLUMN id SET DEFAULT
        'LTL'||'N'||to_char(nextval('sequence_novel_id'), 'FM00000');

------------------------------------------
-- Sequence of Table person's id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_person_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.person.id;

ALTER TABLE person ALTER COLUMN id SET DEFAULT
        'LTL'||'P'||to_char(nextval('sequence_person_id'), 'FM00000');


------------------------------------------
-- Sequence of Table road's id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_road_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.road.id;

ALTER TABLE road ALTER COLUMN id SET DEFAULT
        'LTL'||'R'||to_char(nextval('sequence_road_id'), 'FM00000');

------------------------------------------
-- Sequence of Table sect's id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_sect_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.sect.id;

ALTER TABLE sect ALTER COLUMN id SET DEFAULT
        'LTL'||'S'||to_char(nextval('sequence_sect_id'), 'FM00000');


------------------------------------------
-- Sequence of Table skill's id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_skill_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.skill.id;

ALTER TABLE skill ALTER COLUMN id SET DEFAULT
        'LTL'||'SKILL'||to_char(nextval('sequence_skill_id'), 'FM00000');


------------------------------------------
-- Sequence of Table treasure
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_treasure_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.treasure.id;

ALTER TABLE treasure ALTER COLUMN id SET DEFAULT
        'LTL'||'T'||to_char(nextval('sequence_treasure_id'), 'FM00000');

------------------------------------------
-- Sequence of The table weapons' id
------------------------------------------
CREATE SEQUENCE IF NOT EXISTS sequence_weapons_id
INCREMENT BY 1
MINVALUE 0
NO MAXVALUE
START WITH 0
CACHE 1
NO CYCLE
OWNED BY novel_manage_system.public.weapons.id;

ALTER TABLE weapons ALTER COLUMN id SET DEFAULT
        'LTL'||'W'||to_char(nextval('sequence_weapons_id'), 'FM00000');

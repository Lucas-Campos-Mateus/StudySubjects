create table elective_subject (
    id_subject VARCHAR(36) NOT NULL,
    name TEXT NOT NULL,
    active boolean default true,
    PRIMARY KEY (id_subject)
);
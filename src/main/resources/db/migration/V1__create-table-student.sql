create table student (
    rgm TEXT NOT NULL,
    first_name TEXT not null,
    last_name TEXT not null,
    email TEXT not null,
    active boolean default true,
    PRIMARY KEY (rgm(255))
);

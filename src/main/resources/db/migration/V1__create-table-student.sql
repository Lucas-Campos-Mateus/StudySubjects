create table student (
    rgm int primary key,
    firstName text not null,
    lastName text not null,
    email text not null,
    active boolean default true
);
insert into users (username, password, enabled)
values ('admin', 'admin', true);
insert into users (username, password, enabled)
values ('user', 'user', true);

insert into authorities(username, authority)
    value ('admin', 'ROLE_ADMIN');
insert into authorities(username, authority)
    value ('user', 'ROLE_USER')
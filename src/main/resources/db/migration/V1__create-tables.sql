create table customers
(
    id  bigint      not null auto_increment,
    uid varchar(40) not null,
    primary key (id)
);

create table orders
(
    id          bigint      not null auto_increment,
    uid         varchar(40) not null,
    customer_id bigint,
    primary key (id),
    foreign key (customer_id) REFERENCES customers (id)
);

create table products
(
    id          bigint       not null auto_increment,
    uid         varchar(40)  not null,
    name        varchar(255) not null,
    description text,
    primary key (id)
);

create table order_product
(
    order_id   bigint not null,
    product_id bigint not null,
    foreign key (order_id) REFERENCES orders (id),
    foreign key (product_id) REFERENCES products (id)
)
-- V1__create_post_table.sql
CREATE TABLE IF NOT EXISTS post (
    id SERIAL PRIMARY KEY NOT NULL,
    title TEXT NOT NULL,
    description TEXT,
    link VARCHAR(255) NOT NULL,
    image_link VARCHAR(255)
);
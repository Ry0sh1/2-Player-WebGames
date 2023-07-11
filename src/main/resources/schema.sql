CREATE TABLE IF NOT EXISTS player(
    id BIGSERIAL,
    name TEXT,
    symbol boolean,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS game(
    id BIGSERIAL,
    turn boolean,
    primary key (id)
);
CREATE TABLE IF NOT EXISTS board(
    id BIGSERIAL,
    x1_y1_value int,
    x2_y1_value int,
    x3_y1_value int,
    x1_y2_value int,
    x2_y2_value int,
    x3_y2_value int,
    x1_y3_value int,
    x2_y3_value int,
    x3_y3_value int,
    primary key (id)
);
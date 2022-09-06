CREATE TABLE IF NOT EXIST opinion (
id BIGSERIAL PRIMARY KEY,
taste FLOAT,
service FLOAT,
cleanliness FLOAT,
price FLOAT,

CONSTRAINT FK_restaurant
FOREIGN KEY (restaurant_id)
REFERENCES restaurant (id)
ON DELETE CASCADE
);
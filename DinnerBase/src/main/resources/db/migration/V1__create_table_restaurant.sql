CREATE TABLE IF NOT EXISTS restaurant (
id BIGSERIAL PRIMARY KEY,
name VARCHAR(64),
city VARCHAR(64),
rating FLOAT,

CONSTRAINT FK_meal
FOREIGN KEY (meal_id)
REFERENCES meal (id)
ON DELETE CASCADE
);

CREATE TABLE Usuario (
  id INTEGER IDENTITY PRIMARY KEY,
  nome VARCHAR(30),
  email  VARCHAR(50)
);

INSERT INTO Usuario (nome, email) VALUES ('mkyong', 'aaa@gmail.com');
INSERT INTO Usuario (nome, email) VALUES ('alex', 'bbb@gmail.com');
INSERT INTO Usuario (nome, email) VALUES ('joel', 'ccc@gmail.com');

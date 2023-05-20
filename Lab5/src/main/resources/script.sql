CREATE TABLE Students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  last_name VARCHAR(255),
  first_name VARCHAR(255),
  middle_name VARCHAR(255),
  birth_date DATE,
  student_id VARCHAR(255)
);

INSERT INTO Students (last_name, first_name, middle_name, birth_date, student_id)
VALUES
  ('Ivanov', 'Ivan', 'Ivanovich', '2000-01-01', '12345'),
  ('Petrov', 'Petr', 'Petrovich', '2000-02-02', '54321'),
  ('Sidorov', 'Sidor', 'Sidorovich', '2000-03-03', '67890'),
  ('Kuznetsov', 'Andrey', 'Andreevich', '2000-04-04', '98765'),
  ('Smirnov', 'Alexey', 'Alexeevich', '2000-05-05', '13579'),
  ('Nikolaev', 'Nikolay', 'Ivanovich', '2000-01-01', '12346'),
  ('Ivanov', 'Nikolay', 'Petrovich', '2000-02-02', '54322'),
  ('Sidorov', 'Ivan', 'Sidorovich', '2000-03-03', '67891'),
  ('Andreev', 'Andrey', 'Andreevich', '2000-04-04', '98766'),
  ('Kuznetsov', 'Alexey', 'Alexeevich', '2000-05-05', '13580'),
  ('Ivanov', 'Ivan', 'Ivanovich', '2000-01-01', '12347'),
  ('Petrov', 'Petr', 'Petrovich', '2000-02-02', '54323'),
  ('Sidorov', 'Sidor', 'Sidorovich', '2000-03-03', '67892'),
  ('Kuznetsov', 'Andrey', 'Andreevich', '2000-04-04', '98767'),
  ('Smirnov', 'Alexey', 'Alexeevich', '2000-05-05', '13590'),
  ('Ivanov', 'Ivan', 'Ivanovich', '2000-01-01', '12350'),
  ('Petrov', 'Petr', 'Petrovich', '2000-02-02', '54400'),
  ('Sidorov', 'Sidor', 'Sidorovich', '2000-03-03', '67900'),
  ('Kuznetsov', 'Andrey', 'Andreevich', '2000-04-04', '98700'),
  ('Smirnov', 'Alexey', 'Alexeevich', '2000-05-05', '13600'),
  ('Zaytsev', 'Dmitry', 'Dmitrievich', '2000-12-31', '54300');
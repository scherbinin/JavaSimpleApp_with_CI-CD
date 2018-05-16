CREATE TABLE testing_db.public.test_table
(
  id SERIAL PRIMARY KEY,
  comment VARCHAR
);

CREATE UNIQUE INDEX test_table_id_uindex ON public.test_table (id);
INSERT INTO post (id, text, username) VALUES
  (1, 'lorem ipsum', 'Gupta'),
  (2, 'blablabla', 'hanswurst');

INSERT INTO comment (id, post_Id, text, username) VALUES
  (3, 1,'lo', 'Gu' ),
  (2, 3, 'bla', 'hans');

INSERT INTO quiz_question (question_text, correct_answer) VALUES
('Which keyword is used to define a constant in Java?', 'final'),
('What is the default value of a boolean variable in Java?', 'false'),
('Which method is used to start a thread in Java?', 'start()'),
('Which of the following is not a primitive data type in Java?', 'String'),
('What is the size of an int in Java?', '4 bytes'),
('Which operator is used to compare two values in Java?', '=='),
('What is the superclass of all classes in Java?', 'Object'),
('Which package is automatically imported in every Java program?', 'java.lang'),
('What is the output of the expression 5 + 2 * 3 in Java?', '11'),
('Which of these access modifiers makes a variable accessible only within its own class?', 'private');

INSERT INTO question_options (question_id, option_text) VALUES
-- Question 1: Which keyword is used to define a constant in Java?
(1, 'const'),
(1, 'final'),
(1, 'static'),
(1, 'constant'),

-- Question 2: What is the default value of a boolean variable in Java?
(2, 'true'),
(2, 'false'),
(2, '1'),
(2, 'null'),

-- Question 3: Which method is used to start a thread in Java?
(3, 'start()'),
(3, 'run()'),
(3, 'begin()'),
(3, 'init()'),

-- Question 4: Which of the following is not a primitive data type in Java?
(4, 'int'),
(4, 'boolean'),
(4, 'String'),
(4, 'char'),

-- Question 5: What is the size of an int in Java?
(5, '2 bytes'),
(5, '4 bytes'),
(5, '8 bytes'),
(5, '16 bytes'),

-- Question 6: Which operator is used to compare two values in Java?
(6, '='),
(6, '=='),
(6, '!='),
(6, 'equals()'),

-- Question 7: What is the superclass of all classes in Java?
(7, 'Class'),
(7, 'Object'),
(7, 'Superclass'),
(7, 'Main'),

-- Question 8: Which package is automatically imported in every Java program?
(8, 'java.io'),
(8, 'java.lang'),
(8, 'java.util'),
(8, 'java.text'),

-- Question 9: What is the output of the expression 5 + 2 * 3 in Java?
(9, '21'),
(9, '11'),
(9, '15'),
(9, '17'),

-- Question 10: Which of these access modifiers makes a variable accessible only within its own class?
(10, 'public'),
(10, 'private'),
(10, 'protected'),
(10, 'default');

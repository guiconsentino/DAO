# DAO
PADRÃO DAO
DATA ACCESS OBJECT

Objeto de acesso a dados (acrônimo do inglês Data Access Object - DAO), é um padrão para aplicações 
que utilizam persistência de dados, onde tem a separação das regras de negócio das regras de acesso a banco de dados,
implementada com linguagens de programação orientadas a objetos (como por exemplo Java) e arquitetura MVC,
onde todas as funcionalidades de bancos de dados, tais como obter conexões, mapear objetos para tipos de dados SQL ou executar comandos SQL, 
devem ser feitas por classes DAO.

pode ser criado para encapsular o processo de inclusao. Dessa forma não preciso me preocupar em criar uma conexao, criar um statement, setar atributos
no statment.
VOCE PASSA UM OBJETO e dentro DO METODO ELE FAZ TUDO O QUE PRECISA PARA PEGAR ESSE OBJETO E PASSAR PARA O BANCO DE DADOS!

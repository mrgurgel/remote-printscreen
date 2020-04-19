# remote-printscreen

## Sobre
Este projeto é parte do artigo acadêmico "Sugestão de	 arquitetura de Data Lake para armazenamento de notícias digitais".
Confeccionado como trabalho final do curso "Tecnologias Disruptivas", do Instituto de Educação Superior de Brasília - IESB, sob orientação do prof. Bruno Almeida.


## Passos para a execução
- Faça o download do driver `https://chromedriver.storage.googleapis.com/` e o torne disponível em algum diretório do seu sistema de arquivos
- Compile este projeto, com o seguinte comando `mvn package` (necessário ter o framework maven instalado)
- Execute o programa recém compilado com a seguinte linha de comando, prenchendo as variáveis indicadas no próprio comando:
` java -Dwebdriver.chrome.driver="[path to google chrome driver exec]" -jar target/remote-printscreen-1.jar [remote site, eg: https://edition.cnn.com/] [generated file destination. eg.: /tmp/cnn.png]`


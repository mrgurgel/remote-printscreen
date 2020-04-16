# remote-printscreen

## Pre requisites

- Download google chrome driver at `https://chromedriver.storage.googleapis.com/` and make it avaiable in any location
- Compile this project `mvn package`
- Execute it using the following command:
` java -Dwebdriver.chrome.driver="[path to google chrome driver exec]" -jar target/remote-printscreen-1.jar [remote site, eg: https://edition.cnn.com/] [generated file destination. eg.: /tmp/cnn.png]`
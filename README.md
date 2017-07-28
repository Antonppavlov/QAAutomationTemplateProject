# QAAutomationTemplateProject

Запуск для mvn:
jetty:stop clean install -Dos=mac -Dselenide.browser=chrome -DtestData=testDataMac site jetty:run -Dorg.eclipse.jetty.annotations.maxWait=120
 
Итог:
запускается сервер джетти по http://localhost:8080

для UNIX не забыть драйверам выставить chmod +x

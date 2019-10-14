set projectLocation=D:\WorkSpacess\OctWorkSpace\Flynas2

cd %projectLocation%

mvn clean test -DsuiteXmlFile=FlyNas.xml

pause

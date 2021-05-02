<b>[빌드]</b><br>
sudo ./gradlew build<br>
<hr>
<b>[실행]</b><br>
java -jar build/libs/생성된파일.jar
<b>[상태확인]</b><br> 
sudo netstat -nap | grep {port}<br>
<hr>
<b>[프로세스 종료]</b><br>
sudo kill -9 {PID}<br>
<hr>
<b>[명령어]</b><br>
ctrl + Z : 프로세스 중지하기<br>
bg: 백그라운드에서 서버를 다시 구동시키기<br>
disown -h: 소유권 포기하기<br>

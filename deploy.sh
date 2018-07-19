echo 'deploy front'
cd payfront
npm run build
cd dist
scp index.html root@wxsportscard.upc.edu.cn:/home/wwwroot/default
scp -r static root@wxsportscard.upc.edu.cn:/home/wwwroot/default
echo 'deploy server'
cd ../../payng
./mvnw.cmd package
cd target
scp payng-0.0.1-SNAPSHOT.jar root@wxsportscard.upc.edu.cn:/root/payng

ssh root@wxsportscard.upc.edu.cn -tt << cmd
cd /root/payng
./run
nohup java -jar payng-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod >> payng.log 2>&1 &
exit
cmd

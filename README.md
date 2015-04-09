# fluentd-mongodb-java-sample

## Install mongodb

You need to srart mongodb daemon before you sart fluetd.

install mongodb on ArchLinux:

```
sudo pacman -Sy mongodb
```

start mongodb daemon:

```
% sudo systemctl start mongodb.service
```

check status of mongodb daemon:

```
% sudo systemctl status mongodb.service
 mongodb.service - High-performance, schema-free document-oriented database
   Loaded: loaded (/usr/lib/systemd/system/mongodb.service; disabled; vendor preset: disabled)
   Active: active (running) since Tue 2015-04-07 15:27:05 JST; 4s ago
 Main PID: 18709 (mongod)
   CGroup: /system.slice/mongodb.service
           └─18709 /usr/bin/mongod --quiet --config /etc/mongodb.conf
```

## Install fluentd-ui

fluentd-ui is a web based management console for fluentd, which is implemented by Rails. This is very easy way to install and manage fluentd.

```
git clone https://github.com/fluent/fluentd-ui.git
cd fluentd-ui
bundle install
```

Now install is done. This contains mongodb plugin as default.

You can start fluentd-ui with the following command.

```
bundle exec rails s
```

## run java logger

```
./gradlew run
```
```
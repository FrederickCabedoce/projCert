FROM devopsedu/webapp
RUN rm -r /var/www/html/*
ADD phppackage.tar.gz /var/www/html
EXPOSE 80/tcp

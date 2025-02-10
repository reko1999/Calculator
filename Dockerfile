FROM ubuntu:22.04

RUN apt update
RUN apt -y install python3
# test.py 파일을 컨테이너의 /home 에 이동시켜라
COPY "C:\Users\reko2\OneDrive\바탕 화면\test.py" /home

EXPOSE 8000

CMD ["python", "/home/test.py"]
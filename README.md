<div align="center">

# 백준 알고리즘
![last-commit badge](https://img.shields.io/github/last-commit/yeeooni/baekjoon-slove?style=flat-square)

</div>

### ✏️작성 취지
- 알고리즘 해결과정 및 고충 정리
- 파일 이력관리 
- 빠른 디버깅, 실행 결과 도출
- 자료구조 공부 (Iterator, Map, Stream)
- 깔끔한 주석 템플릿 

### 💻구성
- Java JDK 8 ( corretto 1.8 )
- Server IntelliJ Local Machine -> Edit Configuration -> Build and run modify options -> Redirect Input & save console to output file  
- Gitkraken
- ~~Gradle~~
- ~~SpringBoot2.x.x~~
- ~~Swagger UI~~
- Slack & Incoming WebHooks API

### 🗂️폴더 구조
- **baekjoon**: 백준 알고리즘(root)
- **category**: 카테고리별 분류
 
> ex) baekjoon/category/$_1
>> baekjoon/array/$(prefix)_문제식별번호

- **algorithm**: 알고리즘(공부 정리)

- 서브모듈을 활용하여 메인 저장소는 이 곳이 되고 그 다음 저장소는 vi-editor 가 되고 그 다음 서브 모듈은 exercise_book 이다.
- **slove -> vi-editor -> exercise_book**
- ![디렉터리-구조](images-2.png "현재-저장소의-디렉터리-구조")

### 👨‍💻구현 방식
1. 백준 알고리즘에서 제시한 입력 데이터를 input.txt 입력
2. 코딩
3. 올바른 값이 output.txt 출력되었는지 확인

### ⚠️주의사항
- 문제를 대충 보지 않는다.
- **입출력**을 정확하게 이해한다.
- 어떻게 **구현**해야 할지 생각한다.
- **오탈자**를 확인한다.
- 예외를 처리한다.
- **디버깅**을 한다.

- **반례**를 스스로 찾아낼 수 있어야한다.
- 한 문제에 **많은 시간**을 할애하지 않는다.
  - 하지만, 포기하지 않고 충분히 고민은 해본다. 남들이 구현한 방식을 참고하는 것도 중요하다. 똑같이는 구현하지 않고 최대한 개성있고 최적화하여 가독성이 좋도록 한다.
  - 현재 한 문제에 가장 오래걸린 시간은 **2일**이다.
- 다양한 접근방식을 생각한다. 너무 깊게도 얇게도 생각하지 않는다. 예상외에 답이 나올 수 있는 방법이 있다.

### 📋추가 예정
- [X] ~~AWS EC2 인스턴스를 이용하여 Docker-compose 설치~~
- [X] ~~Docker 컨테이너를 이용하고 App을 외부에서 접근이 가능하도록 구현~~
- [X] 알고리즘 풀이 주간, 월간 통계・결산하여 알림 서비스

![슬랙-코딩테스트-알고리즘-채널](images.png "슬랙-코딩테스트-알고리즘-채널")

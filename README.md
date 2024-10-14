# Interview Mate
### 컴퓨터 전공생을 위한 ‘AI 기반 맞춤형’ 모의 면접 어플
사용자가 선택한 CS 키워드와 제출한 포트폴리오를 기반으로 면접 질문을 생성하고 이를 기반으로 모의 면접을 진행하는 서비스
> 기간: 2023.03 ~ 2023.06 (4개월)  
팀원: Android 1명, Backend 2명, AI 2명  
개발 언어: Kotlin  
프레임워크: Android  
기술 스택: MVVM, Clean Architecture, Multi Module, Hilt, Flow, Retrofit, ViewPager, RecyclerView 

## 최종 발표영상
[![Video Label](http://img.youtube.com/vi/xyYDRaRKeB4/0.jpg)](https://youtu.be/xyYDRaRKeB4)


## 주요기능
### :key: 로그인/회원가입
- 로그인과 회원가입을 진행할 수 있습니다.
- 회원가입시 맞춤 질문을 받을 직무/기술 스택/언어를 한개씩 선택할 수 있습니다.

| 로그인 | 회원가입 |
| --- | --- |
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/4cf2aa3e-2aea-4713-9932-3da20e45ac93">|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/e2c9df73-4cec-4345-91a8-1750b5613d4c"> |

| 직무 선택 | 기술 스택 선택 | 언어 선택 |
|---|---|---|
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/ceeaa7aa-28ad-4c9d-9014-fec22de56960"> |<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/0233b3b7-4ed1-4b54-9726-0bc0383fad8c"> |<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/d10e976d-8289-4893-b29a-60a8a2cea32b">|

### 📹 모의면접
- 모의 면접 탭을 이용해 면접을 진행할 수 있습니다.
- 이때 모의면접 시작 화면에서도 포트폴리오 등록 유무를 확인할 수 있습니다.
- CS 키워드를 여러개 선택할 수 있습니다.
- 면접은 총 10문제로 진행되며, 20초의 대기 시간이 주어주지고 최대 2분간 답변을 녹화할 수 있습니다.

| 모의면접 탭 | CS 키워드 선택 | 주의 사항 |
| --- | --- | --- |
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/61ea7b27-027b-4236-aca9-a1f50ff6df00">|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/0f0ac5e4-a342-4b18-8546-15736d39ba6c"> | <img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/617a5b34-00da-442b-b77b-ed812dff2ab1"> | 

| 면접 대기 | 면접 진행 |
| --- | --- |
<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/7ff90815-af93-401f-aa7a-4d63e32166a1"> |<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/e73af2aa-4e70-4b3b-9968-88e1dc455e28">|

### 💻 분석결과
- 분석 결과 탭은 일자 별 분석과 종합 분석으로 나뉘어집니다.    

**일자 별 분석**
- 캘린더를 통해 날짜별로 진행된 면접을 확인할 수 있으며, 분석 결과 버튼을 클릭해 회차별 분석 결과를 확인할 수 있습니다.
- 일자 별 분석은 행동 분석과 답변 분석으로 나뉘어집니다.
- 행동 분석에서는 행동에 대한 전체 점수와 인터뷰 영상을 다시 볼 수 있으며, 질문별 시선과 자세의 불안 정도를 확인할 수 있습니다.
- 답변 분석에서는 질문에 대한 사용자 답변과 추천 답변을 확인할 수 있으며, 해당 아이템 클릭시 추가로 답변 분석과 심층 질문을 확인할 수 있습니다.

| 일자 별 분석 | 행동 분석 | 행동 분석 |
| --- | --- | --- |
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/a8489799-62b1-4628-abc5-824ecca396a7">|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/52cfea0b-2991-4e1d-8d2a-ed233d27914c"> | <img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/7838dbc0-55a6-47cd-b136-9b4cbe2e84a1"> |

|답변 분석 | 답변 분석 |
| --- | ---|
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/fdcae964-484e-4927-97db-c139e59906b0"> |<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/ab450f5b-ca25-44d1-bf47-cf5736002247"> |

<br>

**종합 분석**
- 종합 분석에서는 최근 진행된 10번의 모의 면접에 대한 정보를 확인할 수 있습니다.
- 도합 전체 점수와 답변한 키워드 비율, 회차별 시선과 자세의 불안정도를 그래프로 확인할 수 있습니다.

| 종합 분석 | 종합 분석 |
| --- | --- |
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/83f4e4ae-3179-46ae-a4a7-e4eb6869e312">|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/d6607d0b-0367-4d72-aea7-92a49449021f">|

### 🙍 마이페이지
- 마이페이지에서는 닉네임과 등록한 직무 키워드를 확인할 수 있으며 포트폴리오를 등록할 수 있습니다.
- 포트폴리오를 등록하면 포트폴리오에서 질문을 생성해 모의 면접 시 질문을 받을 수 있습니다.
- 포트폴리오 등록 화면에서는 포트폴리오 등록 유무를 확인할 수 있습니다.

| 마이페이지 | 포트폴리오 등록 |
| --- | --- |
|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/a1484c73-6f7f-48f2-82ae-23d0fc787344">|<img width="200" src="https://github.com/wellFoundedDevelopers/Algorithm/assets/74500793/daefa61f-9ea8-46c2-bf9f-ac953ebdf975">|

## 발표자료
[3주차 발표자료](https://www.canva.com/design/DAFxC89Sru0/Z2FSaqlj49GhsANfdUhMLw/edit?utm_content=DAFxC89Sru0&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)   
[4주차 발표자료](https://www.canva.com/design/DAFxC4uamng/3oGIunWJent3bm4ljhT_-g/edit?utm_content=DAFxC4uamng&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)   
[6주차 발표자료](https://www.canva.com/design/DAFxC1IoDC4/oMKDGUzG2s2bPuhZszmkCw/edit?utm_content=DAFxC1IoDC4&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)  
[8주차 발표자료](https://www.canva.com/design/DAFxC8K5X2A/UpAkKAJV6pSDgR8hUW2oMg/edit?utm_content=DAFxC8K5X2A&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)  
[11주차 발표자료](https://www.canva.com/design/DAFxC1hxzSo/wuOoydOCqaJH0Ms75dMgUg/edit?utm_content=DAFxC1hxzSo&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)  
[최종 발표자료](https://www.canva.com/design/DAFxC7OoZ0g/LuHs5BkK9wZUbIdzmAiBiw/edit?utm_content=DAFxC7OoZ0g&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

<p align="center">
  <img src = "https://user-images.githubusercontent.com/86010657/151782399-7ee20871-52fa-42f5-80c3-1a32f860e2a6.png"/>
</p>


# CareBank 케어뱅크
프로젝트 기간: 2021.11 ~ 2022.01 <br>
## [📌  프로젝트 PPT](https://drive.google.com/file/d/1rAsJOBv6qWpIc-WnSU6yIsi0vV2d4LDU/view?usp=sharing)


## <목차>
### 1. [기획 의도 및 목표](#1️⃣-기획-의도-및-목표)
### 2. [구성원](#2️⃣-구성원)
### 3. [기술스택](#3️⃣-기술스택)
### 4. [설계](#4️⃣-설계)
### 5. [담당 구현 기능](#5️⃣-담당구현기능)
            
> 1) [로그인](#로그인)
> 2) [회원가입](#회원가입)
> 3) [관심사 설정](#관심사-설정)
> 4) [마이페이지 - 내정보](#마이페이지-내정보)
> 5) [자주묻는질문 (FAQ)](#자주묻는질문) 

___
### 1️⃣ 기획 의도 및 목표

📝 관심사를 기반으로 맞춤 건강정보를 제공하며, 다이어리 및 건강관리 대시보드로 사용자의 건강 상태를 체크한다. 

📝 사용자의 종합 건강 관리를 편리하게 돕는 웹 어플리케이션으로, 다양한 API를 활용하여 건강 관리 서비스를 제공한다.
___
### 2️⃣ 구성원
[🧑🏻‍💻김성민](https://github.com/kimsungmin96)　
[👩🏻‍💻박준미](https://github.com/junmipark)　
[👩🏻‍💻박희원](https://github.com/hwpphwpp)　
[👩🏻‍💻변수빈](https://github.com/sbyun1)　
____
### 3️⃣ 기술스택
* **Front-End** :  HTML/CSS/javascript, jQuery
<img width="336" alt="front" src="https://user-images.githubusercontent.com/86010657/151784014-e63dd168-780e-4855-87fa-e32cf68fb71a.png">


* **Back-End** :  Java (Spring), AWS(S3, RDS), Apache TomCat, MyBatis
<img width="339" alt="back" src="https://user-images.githubusercontent.com/86010657/151784557-e3cd5f48-0d2d-4f16-afb1-fb3f86b45b58.png">

* **Database** : Oracle
<img width="164" alt="oracle" src="https://user-images.githubusercontent.com/86010657/151784761-60050fb8-65b6-4373-86e8-0ee735ebc362.png">

___
### 4️⃣ 설계 
![ERD](https://user-images.githubusercontent.com/86010657/151782488-9ab78244-24d9-4748-9913-5d5d9c646e9d.png)
___

### 5️⃣ 담당구현기능    
* ## 로그인
    * Spring Security & KaKao Login API 사용
    * 회원가입 시 입력한 아이디와 비밀번호로 로그인한다.
    * 카카오톡 계정을 통한 소셜 로그인이 가능하다.</br></br> 

|기능|화면|
|--|--|
|로그인|<img src="https://user-images.githubusercontent.com/86010657/151785862-cfc00719-5b32-44bf-b227-8b24e79eef88.png" width="800"><br>
|소셜로그인|<img src="https://user-images.githubusercontent.com/86010657/151787466-97e89730-bb58-4ce8-a703-65c75cb195b4.png" width="800"><br>

* ## 회원가입 
    * Spring Security 사용 비밀번호를 암호화하여 저장한다.
    * 가입 시 이름, 아이디, 비밀번호를 필수로 입력해야한다.
    * 전화번호, 생년월일은 선택입력할 수 있다. 
    * 아이디는 화면에서 바로 중복확인이 가능하다.
    * 비밀번호 재확인을 통해 비밀번호가 정확히 입력되었는지 확인한다. </br></br>  



|기능|화면|
|--|--|
|회원가입|<img src="https://user-images.githubusercontent.com/86010657/151788064-8f2a7d4f-2771-4b12-adde-0a4e53914b29.png" width = "800"><br>

* ## 관심사 설정 
    
    * 관심사는 총 22가지로, 크게 4가지 카테고리로 분류하고있다. 
        * 만성질환
        * 건강증진
        * 멘탈케어
        * 체중관리
    * 회원이 설정한 관심사 정보가 없다면 관심사 설정 페이지로 이동한다.
    * 마이페이지의 "내정보" 를 통해 변경이 가능하다. </br></br>  

|기능|화면|
|--|--|
|관심사설정|<img src="https://user-images.githubusercontent.com/86010657/151788900-fb37a136-8484-453b-bdcb-3ae7c8495e83.png" width="800">
<br>

* ## 마이페이지 내정보
    * 회원이 기본 정보 및 관심사를 수정할 수 있다.
    * 아이디는 비밀번호 변경, 이름, 전화번호, 생년월일 등을 변경 할 수 있다.
    * "관심사설정" 버튼을 통해 관심사 설정페이지로 이동되며 관심사 카테고리를 수정할 수 있다.</br></br>  

|기능|화면|
|--|--|
|내정보|<img src="https://user-images.githubusercontent.com/86010657/151790791-72187847-d1e5-4cf1-939c-6e45115f0e3a.png" width="800"><br>
|정보수정|<img src="https://user-images.githubusercontent.com/86010657/151792596-025d6b87-79c2-4a06-a8b7-d3c00770b1d4.png" width="800"><br>

* ## 자주묻는질문
    * FAQ를 조회할 수 있는 페이지
    * 토글 형식으로 구성되어있어 제목을 클릭하면 내용이 나타난다.
    * 관리자로 로그인시 등록,수정,삭제가 가능하다.</br></br> 

|기능|화면|
|--|--|
|FAQ|<img src="https://user-images.githubusercontent.com/86010657/151791454-242e7974-f2d4-4814-95b7-99e466395515.png" width="800"><br>
|관리자 FAQ:버튼|<img src="https://user-images.githubusercontent.com/86010657/151792060-c16a93c5-850c-460b-a15c-e02044130215.png" width="800"><br>
|관리자 FAQ:수정|<img src="https://user-images.githubusercontent.com/86010657/151791739-42ed7597-ce76-4b33-9d0c-5b0cfb5029a0.png" width="800"><br>





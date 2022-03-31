# CarrotMarket
### 중고 거래 앱

#### 중고 제품 판매글을 업로드하고 거래자와 채팅을 나눌 수 있는 당근 마켓 앱의 주요 기능을 구현한 안드로이드 앱 입니다.
### Blog
* <https://hwayomingdlog.tistory.com/265>
* <https://hwayomingdlog.tistory.com/266>
* <https://hwayomingdlog.tistory.com/267>
* <https://hwayomingdlog.tistory.com/268>
* <https://hwayomingdlog.tistory.com/284>
</br>

## 주기능
### 홈
* BottomNavigationBar에 홈 탭을 클릭하면 홈 화면으로 전환됩니다.
* 판매 아이템 리스트를 RecyclerView에 표시합니다.
* 판매 아이템을 클릭하면 판매자와의 채팅방이 개설됩니다.
* 로그인 상태에서 우측 하단의 FloatingActionButton을 클릭하면 판매 아이템을 등록하는 화면으로 전환됩니다.
</br>

### 채팅
* BottomNavigationBar에 채팅 탭을 클릭하면 채팅 화면으로 전환됩니다.
* 개설된 채팅방 리스트가 판매글 제목으로 나타납니다.
* 리스트 중 하나를 클릭하면 해당 채팅방으로 화면이 전환되며, 상대방 아이디와 함께 주고받은 채팅 메세지가 나타납니다.
* 채팅방에서 하단 텍스트 입력창을 통해 상대방에게 채팅 메세지를 보낼 수 있습니다.
</br>

### 아이템 등록 화면
* 판매글 제목과 가격, 상품 이미지를 등록할 수 있습니다.
* 이미지 등록하기 버튼을 클릭하면 사진첩에 관한 접근 권한을 요청합니다.
* 권한 요청을 수락하면 갤러리에 있는 사진을 선택할 수 있습니다.
* 하단의 등록하기 버튼으 클릭하면 작성한 판매글이 등록되어 홈 화면에 해당 판매글이 추가됩니다.
</br>

### 마이페이지
* BottomNavigationBar에 마이페이지 탭을 클릭하면 마이페이지 화면으로 전환됩니다.
* 아이디와 패스워드를 입력한 후, 회원가입 버튼을 클릭해 가입할 수 있습니다.
* 아이디와 패스워드를 입력한 후, 로그인 버튼을 클릭해 로그인할 수 있습니다.
* 이전에 로그인한 이력이 있다면 자동으로 로그인 되며, 로그아웃 버튼을 클릭해 로그아웃 할 수 있습니다.
</br>

## 활용 기술
* BottomNavigationView - 하단에 홈, 채팅, 마이페이지 메뉴를 구성해 클릭 이벤트가 발생하면 Fragment를 전환하였습니다.
* Fragment - 홈, 채팅, 마이페이지 화면을 Fragment로 구성하여 재사용성을 높였습니다.
* ViewBinding - xml 레이아웃 파일의 바인딩 클래스를 자동으로 생성하는 ViewBinding 기법을 활용했습니다.
* Firebase Authentication - Firebase Authentication을 활용해서 이메일과 비밀번호로 회원가입 및 로그인 기능을 구현했습니다.
* Firebase Realtime Database - 모든 클라이언트에 실시간으로 데이터가 동기화 되도록 Firebase Realtime Database를 사용했습니다.
* Firebase Storage - 이미지를 업로드하고 다운로드하는 기능을 구현하기 위해 Firebase Cloud Storage를 활용했습니다.
* RecyclerView - ListAdapter를 상속하는 어댑터를 구현하여 DiffUtil을 활용해 RecyclerView 데이터를 업데이트하도록 구현하였습니다.
* Glide - RecyclerView Item의 ImageView에 Firebase Storage에 저장된 이미지를 URL로부터 불러오기 위해 Glide를 활용했습니다.
</br>

***
<img src="/img/img0.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img1.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img2.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img3.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img4.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img5.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img6.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img7.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img8.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img9.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img10.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img11.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img12.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img13.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img14.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img15.png" width="300px" height="600px" title="" alt=""></img>

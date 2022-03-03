# BottomNavigationWithFAB
이 프로젝트는 중간에 FloatingActionButton이 있는 BottomNavigationView를 만드는 방법을 배웁니다.

## 1.Material Design Dependency

프로젝트에 적용된 디펜던시
```
implementation 'com.google.android.material:material:1.6.0-alpha03'
```

### 참고
[Getting started with Material Components for Android - Github](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md)
[Getting started with Material Components for Android - MATERIAL DESIGN](https://material.io/develop/android/docs/getting-started)

## 2.Resource icon 추가
- Resource Manager > Vector Asset > Clip Art > 필요한 이미지 찾아서 이름 지정

## 3. menu 추가
- res 우 클릭 > New > Android Resource File > Resource Type: menu > bottom_nav_menu 생성
- bottom_nav_menu.xml 에 item 추가

## 4. activity_main 에 BottomAppBar, FloatingActionButton 으로 네비게이션 구성
- 최상위 위젯을 CoordinatorLayout 으로 변경

```
<com.google.android.material.bottomappbar.BottomAppBar
    android:id="@+id/bottomAppBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:fabCradleMargin="20dp"
    app:fabCradleVerticalOffset="10dp"
    app:fabCradleRoundedCornerRadius="20dp"/>
```
- BottomAppBar 옵션으로 상세한 디자인 수정 가능
    - fabCradleMargin: FloatingActionButton 의 여백을 결정
    - fabCradleVerticalOffset: FloatingActionButton 의 수직 위치 변경
    - fabCradleRoundedCornerRadius: FloatingActionButton 주위 모서리 둥글게 만들기

```
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:id="@+id/fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/ic_add"
    app:layout_anchor="@id/bottomAppBar"/>
```
- `layout_anchor` 속성을 사용해서 bottomAppBar 의 가운데 위치하도록 지정

### 네비게이션 가운데 FloatingActionButton 이 자리 잡고 이상하게 나온다면 style 변경
```
<style name="Theme.BottomNavigationWithFAB" parent="Theme.MaterialComponents">
```

- values > themes > parent style을 `Theme.MaterialComponents`으로 변경

<br/>

**BottomAppBar 영역에 NavigationView 추가하기**

```
<com.google.android.material.bottomnavigation.BottomNavigationView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginEnd="16dp"
            android:background="@android:color/transparent"
            app:menu="@menu/bottom_nav_menu" />
```

- menu: menu 로 만들어놓은 xml 을 사용해서 네비게이션뷰에서 표시
- background: FloatingActionButton 에 디자인 적용해놓은것이 보이지 않으므로 배경을 투명으로 처리
- marginEnd: 무슨 이유인지는 모르겠으나 왼쪽 여백이 생긴 상태로 생성 되므로 오른쪽 영역에 16dp 를 주어서 네비게이션뷰가 가운데 위치하도록 처리

## 5. 네비게이션 배경 제거
BottomNavigationView 에 그림자가 생겨 이상하게 보이는데 xml 상에서는 수정이 불가능 하므로 Ativity 에서 코드로 처리

```kotlin
binding.bottomNavigationView.background = null
```

- xml 미리보기에서는 그림자가 아직도 제거 되지 않아 보이지만 실행시키면 그림자 제거되어 있습니다.




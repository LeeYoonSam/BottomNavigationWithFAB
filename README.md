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
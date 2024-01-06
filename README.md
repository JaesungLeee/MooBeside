## ⚙️ In Progress

<h1 align="center">MooBeside</h1>

<p align="center">
<a href="[https://kotlinlang.org](https://kotlinlang.org/)"><img alt="Kotlin Version" src="https://img.shields.io/badge/Kotlin-1.8.0-blueviolet.svg?style=flat"/></a>
<a href="https://android-arsenal.com/api?level=23"><img alt="API" src="https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat"/></a>
<a href="https://developer.android.com/studio/releases/gradle-plugin"><img alt="AGP" src="https://img.shields.io/badge/AGP-8.2.0-blue?style=flat"/></a>
<a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-MIT-blue.svg"/></a>
</p>

<!--Description-->

<!--<img src="" />-->

## App Download

<a href="https://play.google.com/store/apps/details?id=com.jslee.moobeside">
<img src="https://user-images.githubusercontent.com/63157395/211233100-2f255c00-3336-4125-b5da-2fd935e40b5a.png" width="150" />
</a>

## Tech stack & Open-source libraries

### Android

- Minimum SDK level 24
- Target SDK level 33
- [Kotlin](https://kotlinlang.org/)
- [Android View System](https://developer.android.com/guide/topics/ui/declaring-layout?hl=ko)
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) 기반 비동기 처리
- Jetpack
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - 구성 변경에도 UI 데이터를 보존할 수 있는 StateHolder를 제공하는 라이브러리
    - [Navigation](https://developer.android.com/guide/navigation) - 화면(with Composable) 간의 이동을 지원하는 라이브러리
    - [Paging](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - 대량의 데이터 로드 시, 네트워크 대역폭과 시스템 리소스를 효율적으로 사용할 수 있도록 Page 단위 로딩을 지원하는 라이브러리
    - [DataBinding](https://developer.android.com/topic/libraries/data-binding) for XML - 데이터를 레이아웃에 직접 바인딩 가능하게 함으로서 기존 `findViewById`를 대체하는 라이브러리
- [Hilt](https://dagger.dev/hilt/) - Dagger 기반의 Android 의존성 주입 라이브러리
- [Glide](https://bumptech.github.io/glide/) - 빠르고 효율적인 Android 이미지 로딩 라이브러리
- [Retrofit2 & OkHttp3](https://github.com/square/retrofit) - REST API 통신을 구축하는 라이브러리
- Firebase
    - [Firebase Dynamic Links](https://firebase.google.com/docs/dynamic-links?hl=ko) - 앱 설치 여부에 관계없이 여러 플랫폼에서 원하는 대로 작동하는 링크
- Kakao
    - [Kakao Share](https://developers.kakao.com/docs/latest/ko/message/android-link) - 사용자가 카카오톡 친구에게 카카오톡 메시지를 통해 공유할 수 있는 기능 지원

### Gradle

- Version Catalog 를 활용하여 의존성 라이브러리들과 플러그인을 관리합니다.

  
<!--
## Features

> feature 1
> 

<div align="center">

| description1 | description2 | description3 |
| --- | --- | --- |
| <img src="" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> |

</div>

> feature 2
> 

<div align="center">

| description1 | description2 | description3 |
| --- | --- | --- |
| <img src="" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> |

</div>

> feature 3
> 

<div align="center">

| description1 | description2 | description3 |
| --- | --- | --- |
| <img src="" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> |

</div>

> feature 4
> 

<div align="center">

| description1 | description2 | description3 |
| --- | --- | --- |
| <img src="" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> | <img src="p" align="center" width="300px"/> |

</div>

## Architecture

Description

<p align = 'center'>
<img width = '600' src = ''>
</p>

Description

<p align = 'center'>
<img width = '900' src = ''>
</p>

```
-->

# Flow Coding Test

## 지원자
임규진

## 기술 스택
- **Java**: 17
- **Spring Boot**: 3.3.2 RELEASE
- **Spring JPA**
- **MySQL**
- **Lombok**
- **Gradle**

## 테이블 스키마

| 변수              | 타입    | 설명           |
|-------------------|---------|----------------|
| `extensionName` (PK) | `String` | 확장자 명       |
| `createdAt`       | `Date`  | 추가 시간       |

## 과제 내용

기존 확장자 목록은 다음과 같습니다:
- bat
- cmd
- com
- cpl
- exe
- scr
- js

### 기능 요구 사항
1. **체크박스 상태 유지**: 페이지 새로 고침 시, 체크박스에 있는 기존 확장자 상태가 유지되어야 합니다.
2. **확장자 추가**: 추가 버튼 클릭 시, 입력된 확장자가 데이터베이스에 추가되며, 아래 영역에 표시됩니다.
3. **확장자 삭제**: 'x' 버튼 클릭 시, 해당 태그가 삭제되며 데이터베이스에서도 삭제됩니다.

## API 명세

### 확장자 조회
- **Endpoint**: `/api/extensions`
- **Method**: `GET`
- **Response**:
  ```json
  [
      {
          "createdAt": "2024-08-18T07:18:55",
          "extensionName": "bat"
      },
      {
          "createdAt": "2024-08-18T07:18:56",
          "extensionName": "cmd"
      },
      ...
  ]
Status Code:
200 OK: 데이터가 있을 경우
203 NO CONTENT: 데이터가 없을 경우
### 확장자 추가
- **Endpoint:**  /api/extensions
- **Method:** POST
- **Request Body:**
json
{
    "extensionName": "jpg"
}
Response:
201 CREATED: 확장자 추가 성공
400 BAD REQUEST: 확장자가 이미 존재할 경우
### 확장자 추가
- **Endpoint:**  /api/extensions/{extensionName}
- **Method:** DELETE
- **Request Body:**
Response:
200 OK: 확장자 삭제 성공
400 BAD REQUEST: 데이터베이스에 없는 확장자를 삭제 시
테스트
테스트는 JUnit4를 사용하여 진행합니다.

확장자 조회 테스트: 확장자 목록을 올바르게 조회할 수 있는지 확인합니다.
확장자 추가 테스트: 새로운 확장자를 추가하고, 데이터베이스와 UI에서 올바르게 반영되는지 확인합니다.
확장자 수정 테스트: 유효하지 않은 확장자 값으로 수정 시, 적절한 오류를 반환하는지 확인합니다.

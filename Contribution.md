## Singleton

- Subteam 2 : Nguyen Duc Anh Contribution

  | stt | class                     | explan                                                   |
  | --- | ------------------------- | -------------------------------------------------------- |
  | 1   | Cart                      | 1 shop chỉ cần 1 cart nên có thể dùng Singleton cho Cart |
  | 2   | InterbankPayloadConverter | là một lớp ngoài nên chỉ cần Singleton                   |

## Factory Method và Template Method

## Clean code

Đức Anh:

- Xóa các import package thừa trong view
- AuthenticationController.java thay đổi md5 -> md5Encryption, sb -> digestSB
- View thay đổi một số tên phương thức rõ ràng hơn

## Clean Code: Data level Refactoring and Method Level Refactoring

Subteam 2 : Nguyen Duc Anh Contribution
stt | class | explan
--- | --- | --- |
1 | InterbankPayloadConverter | Không giữa các số trong chương trình, chuyển các mã code "01" đến "07" thành hằng
2 |entity.db.AIMSDB | Thay đổi các string có sẵn bằng các hằng số
3 | controller.PaymentController | Phương thức getExpirationDate đang ở mức 2 level of abstraction chuyển thành 1 level
4 | controller.ViewCartController | Sử dụng 1 dòng để return, bỏ qua một biến subtotal

[Xem đóng góp](https://docs.google.com/document/d/1-voyUEHkCD-C_3M4Oq6uI08dBzfmziVxGPpPU1EjUBQ/edit)

## Clean code 3: Clean Class

Subteam 2 : Nguyen Duc Anh Contribution
stt | class | explan
--- | --- | --- |
1 | PlaceOrderController | Large class, chuyển các method ko liên quan sang package helper, class Validate để xử lý validate
2 | AuthenticationController | Large class, chuyển method xử lý md5 và trong class helper.Security 

## Observer Design Pattern

Subteam 2: Nguyễn Đức Anh Contribution
stt | class | explan
--- | --- | --- |
1 | CartScreenHandler và MediaHandler | CartScreenHandler là lớp Observer MediaHandler là lớp Subject giúp cho việc update Cart
## Singleton

- Subteam 2 : Nguyen Duc Anh Contribution

  | stt | class                     | explan                                                   |
  | --- | ------------------------- | -------------------------------------------------------- |
  | 1   | Cart                      | 1 shop chỉ cần 1 cart nên có thể dùng Singleton cho Cart |
  | 2   | InterbankPayloadConverter | là một lớp ngoài nên chỉ cần Singleton                   |

## Factory Method
- Subteam 1: Le Xuan An

stt | class | explan
--- | --- | --- |
1 | SimpleCardFactory, Card  | Khi thêm một phương thức thanh toán mới. Việc sử dụng Factory method giúp việc tạo một đối tượng thẻ mới đơn giản hơn.  


## Template Method

- Subteam 2 : Nguyen Duc Anh Contribution

  | stt | class               | explan                                                                                                                                                                                                                                                                                                                                                                                                                                               |
  | --- | ------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | 1   | MediaDetailAbstract | Khi thêm một yêu cầu mới là xem chi tiết sản phẩm, với việc xem chi tiết ta có các bước rõ ràng từng bước để xem nên em sử dụng Template, design là sử dụng MediaDetailAbstract là lớp abstract public một method detail và MediaHandler sẽ liên kết với class này, tùy từng loại Media ta chỉ cần kế thừa MediaDetailAbstract và implements các phương thức abstract. MediaHandler mỗi khi gặp một loại class thì chỉ cần truyền và class tương ứng |

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

## State Design Pattern

Subteam 2: Nguyễn Đức Anh Contribution
stt | class | explan
--- | --- | --- |
1 | Order, State | Lớp Oder được coi là Client có thêm method setState để chỉnh sửa trạng thái, State đóng vai trò là inteface, các State riêng biệt của Order được implements từ State. Order chỉ cần setState các class đã được implements tương ứng với mỗi state của order.

## Adapter Design Pattern

Subteam 2: Nguyễn Đức Anh Contribution
stt | class | explan
--- | --- | --- |
1 | Order, State | Lớp Oder được coi là Client có thêm method setState để chỉnh sửa trạng thái, State đóng vai trò là inteface, các State riêng biệt của Order được implements từ State. Order chỉ cần setState các class đã được implements tương ứng với mỗi state của order.

## SOLID
Subteam 2: Nguyễn Mạnh Cường Contribution


stt | class | explan
--- | --- | --- |
1 | AuthenticationController  | SRP AuthenticationController thực hiện một lúc nhiều method nên tách riêng một class UserController chứa các phương thức login(), logout(), getMainUser(),...
2 | PaymentController  | SRP chuyển thành method trong class Validate để tái sử dụng
3 | PaymentTransaction | OCP tạo 1 class mới là GeneralPayment, và cho Card implement GeneralPayment
4 | BaseController  | LSP sử dụng các class khác để kế thừa cho những lớp dùng BaseController kế thừa
5 | BaseScreenHandle  | ISP Tách ra mộ class riêng  PreviousScreenHandler có 2 phương thức setPreviousScreen, getPreviousScreen
6 | PaymentTransaction  | DIP Thay thế lớp Card cho lớp CreditCard


## Clean code

Subteam 2: Nguyễn Mạnh Cường Contribution

stt | class | explan
--- | --- | --- |
1 | InterbankSubsystem  | ctrl -> interbankSubsystemController
2 | PaymentController  | isValidMonthAndYear ->
isValidTimeOrder



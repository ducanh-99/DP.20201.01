## SOLID

Subteam 1: Nguyen Dinh Quang Anh Contribution
| stt | class                    | explan                                                                                             |
| --- | ------------------------ | ---------------------------------------------------------------------------------------------------|
| 1   | MediaDAO | Vi phạm nguyên lý LSP: 3 class BookDAO, CDDAO, DVDDAO ko thể lấy được tất cả Books, CD,DVDs giống như lớp MediaDAO |
| 2   | payment/Card.java | OCP: Nếu muốn thêm phương thức thanh toán mới thì phải thêm interface GeneralPayment và implement các method |

Subteam 2: Nguyễn Mạnh Cường Contribution

| stt | class                    | explan                                                                                                                                                        |
| --- | ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1   | AuthenticationController | SRP AuthenticationController thực hiện một lúc nhiều method nên tách riêng một class UserController chứa các phương thức login(), logout(), getMainUser(),... |
| 2   | PaymentController        | SRP chuyển thành method trong class Validate để tái sử dụng                                                                                                   |
| 3   | PaymentTransaction       | OCP tạo 1 class mới là GeneralPayment, và cho Card implement GeneralPayment                                                                                   |
| 4   | BaseController           | LSP sử dụng các class khác để kế thừa cho những lớp dùng BaseController kế thừa                                                                               |
| 5   | BaseScreenHandle         | ISP Tách ra mộ class riêng PreviousScreenHandler có 2 phương thức setPreviousScreen, getPreviousScreen                                                        |
| 6   | PaymentTransaction       | DIP Thay thế lớp Card cho lớp CreditCard                                                                                                                      |

## Clean code

Subteam 1: Nguyễn Đình Quang Anh Contribution
| stt | class              | explan                               |
| --- | ------------------ | ------------------------------------ |
| 1   | ShippingConfigs | 22, 48 nên đặt tên gợi nhớ chứ ko nên truyền thẳng vào hàm |


Subteam 2: Nguyễn Mạnh Cường Contribution

| stt | class              | explan                               |
| --- | ------------------ | ------------------------------------ |
| 1   | InterbankSubsystem | ctrl -> interbankSubsystemController |
| 2   | PaymentController  | isValidMonthAndYear ->               |

Subteam 2: Đức Anh

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

## Clean code 3: Clean Class

Subteam 1: Nguyen Dinh Quang Anh Contribution
stt | class | explan
--- | --- | --- |
1 | MediaDAO | getMediaById được sử dụng rất nhiều lần bởi client -> Tách ra thành interface và implement lại trong MediaDAO để thỏa mãn Interface-Level Refactoring

Subteam 1: Le Xuan An Contribution

stt | class | explan
--- | --- | --- |
1 | InterbankPayloadConverter, DateController| Vì hàm getToday độc lập về mặt dữ liệu trong class InterbankPayloadConverter nên đưa vào class DateController rồi cho InterbankPayloadConverter gọi đến. Làm như vậy sẽ khiến class InterbankPayloadConverter đỡ cồng kềnh hơn|

Subteam 2 : Nguyen Duc Anh Contribution
stt | class | explan
--- | --- | --- |
1 | PlaceOrderController | Large class, chuyển các method ko liên quan sang package helper, class Validate để xử lý validate
2 | AuthenticationController | Large class, chuyển method xử lý md5 và trong class helper.Security

## Singleton
- Subteam 1: Le Xuan An Contribution

stt | class | explan
--- | --- | --- |
1 | Invoice| Mỗi 1 lần mua hàng chỉ cần 1 hóa đơn nếu thay đổi gì chỉ cần up date bằng việc gọi đến getInstance và truyền vào đối tượng order để cập nhật. Tránh trường hợp hóa đơn mở rộng nhiều trường dữ liệu khởi tạo mất thời gian|
- Subteam 2 : Nguyen Duc Anh Contribution

  | stt | class                     | explan                                                   |
  | --- | ------------------------- | -------------------------------------------------------- |
  | 1   | Cart                      | 1 shop chỉ cần 1 cart nên có thể dùng Singleton cho Cart |
  | 2   | InterbankPayloadConverter | là một lớp ngoài nên chỉ cần Singleton                   |

## Factory Method

- Subteam 1: Le Xuan An

| stt | class                   | explan                                                                                                                 |
| --- | ----------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| 1   | SimpleCardFactory, Card | Khi thêm một phương thức thanh toán mới. Việc sử dụng Factory method giúp việc tạo một đối tượng thẻ mới đơn giản hơn. |

- Subteam1: Nguyen Dinh Quang Anh Contribution
  | stt | class                   | explan                                                                                                                 |
  | --- | ----------------------- | ---------------------------------------------------------------------------------------------------------------------- |
  | 1   | order/Order.java | client ko nên new OrderItem mà việc này nên dành cho Factory Method, trong class FactoryOrderItem() sẽ trả về OrderItem cho client |


## Template Method

- Subteam 2 : Nguyen Duc Anh Contribution

  | stt | class               | explan                                                                                                                                                                                                                                                                                                                                                                                                                                               |
  | --- | ------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | 1   | MediaDetailAbstract | Khi thêm một yêu cầu mới là xem chi tiết sản phẩm, với việc xem chi tiết ta có các bước rõ ràng từng bước để xem nên em sử dụng Template, design là sử dụng MediaDetailAbstract là lớp abstract public một method detail và MediaHandler sẽ liên kết với class này, tùy từng loại Media ta chỉ cần kế thừa MediaDetailAbstract và implements các phương thức abstract. MediaHandler mỗi khi gặp một loại class thì chỉ cần truyền và class tương ứng |

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
1 | DeliveryInfo, DistanceCalculatorInterface | Khi thay đổi interface tính khoảng cách mới, để các interface giao tiếp được với nhau ta sử dụng Adapter, ta có một lớp DistanceCalculatorInterface có phương thức calculatorDistance(), các Adapter sẽ kế thừa lớp này, trong các Adapter sẽ có các Adaptee là các lib t

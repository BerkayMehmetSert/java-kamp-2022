## Spring Boot 

Entities : Veri tabanı nesnelerini tuttuğumuz katman.

DataAccess : Veri tabanı işlemlerini yapan katmanımız .

Business : İş kurallarını tuttuğumuz katman.

WebAPI : API katmanımız.

Concretes : Somut sınıflarımızı tuttuğumuz katman.

Abstracts : Soyut sınıflarımızı tuttuğumuz katman. 

@Service : Business katmanındaki sınıflarımızı işaretlememizi sağlar.

@Repository : DataAccess katmanındaki sınıflarımızı işaretlememizi sağlar.

@Restcontroller : Controller sınıflarımızı Restful API olarak kullanmamızı sağlar.

@Requestmapping : Controller sınıflarımızın hangi url ile çalışacağını belirtir.

@GetMapping : Get isteklerini karşılamamızı sağlar.

@AutoWired : Spring IoC Container’ın içindeki nesneleri otomatik olarak bağlamamızı sağlar. Spring yeni bir nesne oluştururken, bu nesnenin bağımlılıklarını otomatik olarak çözer.



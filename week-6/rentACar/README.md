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

@RequestBody : Request ile gelen veriyi alır Default olarak spring boot ile gelir.

@GetMapping : Get isteklerini karşılamamızı sağlar.

@PostMapping : Post isteklerini karşılamamızı sağlar.

@PutMapping : Put isteklerini karşılamamızı sağlar. (Update)

@DeleteMapping : Delete isteklerini karşılamamızı sağlar.

@AutoWired : Spring IoC Container’ın içindeki nesneleri otomatik olarak bağlamamızı sağlar. Spring yeni bir nesne
oluştururken, bu nesnenin bağımlılıklarını otomatik olarak çözer.

@Table : Veri tabanında hangi tabloya karşılık geleceğini belirtir.

@Data : Getter, Setter, ToString, EqualsAndHashCode, RequiredArgsConstructor anotasyonlarını tek bir anotasyon ile
kullanmamızı sağlar.

@AllArgsContructor : Tüm alanları parametre alan bir constructor oluşturur.

@NoArgsContructor : Parametresiz bir constructor oluşturur.

@Getters : Sadece Getter’ları oluşturur.

@Setters : Sadece Setter’ları oluşturur.

@Entity : Veri tabanı nesnemizi işaretlememizi sağlar.

@Colum : Veri tabanı nesnemizin hangi kolona karşılık geleceğini belirtir.

@Id : Veri tabanı nesnemizin id alanını işaretlememizi sağlar (primary key).

@GeneratedValue : Veri tabanı nesnemizin id alanının otomatik artan olmasını sağlar.

JpaRepository : Veri tabanı işlemlerini yapmamızı sağlayan sınıf.

ModelMapper : Model sınıflarımızı birbirine dönüştürmemizi sağlayan sınıf.

@Bean : Spring IoC Container’ın içindeki nesneleri otomatik olarak bağlamamızı sağlar. Spring yeni bir nesne oluştururken, bu nesnenin bağımlılıklarını otomatik olarak çözer.
# 🛍️ Sistema de Gestión de Productos - Tienda Online

## 📋 Descripción del Proyecto

Este proyecto es un **sistema completo de gestión de productos** desarrollado con **Spring Boot** que permite administrar el inventario de una tienda online. La aplicación implementa operaciones CRUD (Create, Read, Update, Delete) para productos con una interfaz web moderna y responsive.

## 🎯 Finalidad

El sistema está diseñado para:
- ✅ **Gestionar productos** de forma eficiente
- ✅ **Administrar inventario** con control de stock
- ✅ **Categorizar productos** por tipo
- ✅ **Proporcionar una interfaz intuitiva** para usuarios no técnicos
- ✅ **Demostrar buenas prácticas** de desarrollo Spring Boot

## 🚀 Características Principales

### 🔧 Funcionalidades
- **Lista de Productos**: Visualización completa del inventario
- **Agregar Productos**: Formulario para registrar nuevos productos
- **Editar Productos**: Modificación de información existente
- **Eliminar Productos**: Eliminación con confirmación de seguridad
- **Categorización**: Organización por categorías predefinidas
- **Control de Stock**: Indicadores visuales de disponibilidad

### 🏗️ Arquitectura Técnica
- **Backend**: Spring Boot 3.x con Spring MVC
- **Frontend**: Thymeleaf + Bootstrap 5 + Font Awesome
- **Base de Datos**: H2 Database (en memoria)
- **Persistencia**: JPA/Hibernate
- **Patrón**: DAO (Data Access Object)

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 17+ | Lenguaje de programación |
| **Spring Boot** | 3.x | Framework principal |
| **Spring Web** | - | MVC y controladores REST |
| **Spring Data JPA** | - | Persistencia de datos |
| **H2 Database** | - | Base de datos en memoria |
| **Thymeleaf** | - | Motor de plantillas |
| **Bootstrap** | 5.3.0 | Framework CSS |
| **Font Awesome** | 6.0.0 | Iconografía |
| **Maven** | 3.x | Gestión de dependencias |

## 📁 Estructura del Proyecto

```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/proyecto1/demo/
│   │   │       ├── DemoApplication.java          # Clase principal
│   │   │       ├── Controllers/
│   │   │       │   ├── ClienteController.java    # Controlador de clientes
│   │   │       │   └── ProductoController.java   # Controlador de productos
│   │   │       └── Models/
│   │   │           └── Entity/
│   │   │               ├── Product.java          # Entidad JPA
│   │   │               └── DAO/
│   │   │                   ├── ProductDAO.java   # Interfaz DAO
│   │   │                   └── ProductDAOImp.java# Implementación DAO
│   │   └── resources/
│   │       ├── application.properties            # Configuración
│   │       ├── data.sql                         # Datos iniciales
│   │       ├── static/
│   │       │   └── estilos.css                  # Estilos personalizados
│   │       └── templates/
│   │           ├── index.html                   # Página principal
│   │           └── productos/
│   │               ├── list.html                # Lista de productos
│   │               └── form.html                # Formulario CRUD
│   └── test/
│       └── java/
│           └── com/proyecto1/demo/
│               └── DemoApplicationTests.java     # Tests unitarios
├── pom.xml                                       # Configuración Maven
└── README.md                                     # Este archivo
```

## 🗃️ Modelo de Datos

### Entidad Product
```java
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;           // ID autogenerado
    private String name;       // Nombre del producto
    private float price;       // Precio del producto
    private int stock;         // Cantidad en inventario
    private String category;   // Categoría del producto
}
```

### Datos Pre-cargados
El sistema incluye 12 productos de ejemplo en diferentes categorías:
- 📱 Electrónicos (laptops, smartphones, auriculares, etc.)
- 🪑 Muebles (mesas, sillas, escritorios)
- 📚 Libros
- 🏠 Electrodomésticos
- 🎒 Accesorios

## 🚀 Instalación y Ejecución

### Prerrequisitos
- ☕ **Java 17+** instalado
- 📦 **Maven 3.x** instalado
- 🌐 **Navegador web** moderno

### Pasos de Instalación

1. **Clonar el repositorio**
```bash
git clone <url-del-repositorio>
cd demo
```

2. **Instalar dependencias**
```bash
mvn clean install
```

3. **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```
o ejecutar la clase principal `DemoApplication.java` desde el IDE.

4. **Acceder a la aplicación**
- Abrir navegador en: `http://localhost:8080`
- Base de datos H2 Console: `http://localhost:8080/h2-console`

## 🌐 Endpoints Disponibles

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| `GET` | `/` | Página principal |
| `GET` | `/productos` | Lista todos los productos |
| `GET` | `/productos/new-product` | Formulario nuevo producto |
| `POST` | `/productos/save` | Guardar nuevo producto |
| `GET` | `/productos/edit/{id}` | Formulario editar producto |
| `POST` | `/productos/update/{id}` | Actualizar producto |
| `GET` | `/productos/delete/{id}` | Eliminar producto |

## 📸 Screenshots de la Aplicación

### 🏠 Página Principal
- Panel de administración con acceso rápido a funcionalidades
- Información sobre las tecnologías utilizadas

### 📋 Lista de Productos
- Tabla responsive con todos los productos
- Indicadores de stock con colores
- Botones de acción (editar/eliminar)

### ✏️ Formulario de Productos
- Campos validados (nombre, precio, stock, categoría)
- Dropdown con categorías predefinidas
- Diferentes formularios para crear/editar

## 🔧 Configuración

### Base de Datos H2
```properties
# application.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
```

### Puerto del Servidor
```properties
server.port=8080
```

## 🧪 Testing

Ejecutar tests:
```bash
mvn test
```

El proyecto incluye tests básicos de integración para verificar que el contexto de Spring Boot se carga correctamente.

## 📈 Posibles Mejoras Futuras

- 🔐 **Autenticación y autorización** de usuarios
- 🖼️ **Gestión de imágenes** para productos
- 🔍 **Búsqueda y filtros** avanzados
- 📊 **Dashboard con estadísticas** de inventario
- 🛒 **Funcionalidad de carrito** de compras
- 📧 **Notificaciones** de stock bajo
- 💾 **Base de datos persistente** (MySQL/PostgreSQL)
- 🌍 **API REST** para integraciones

## 👥 Contribución

Este proyecto fue desarrollado como parte de una prueba técnica para demostrar conocimientos en:
- ✅ Desarrollo web con Spring Boot
- ✅ Manejo de bases de datos con JPA
- ✅ Implementación del patrón DAO
- ✅ Desarrollo de interfaces web responsive
- ✅ Buenas prácticas de programación

## 📝 Licencia

Este proyecto es de uso académico y demostrativo.

---

**Desarrollado con ❤️ usando Spring Boot**

*Para más información o consultas, revisar la documentación en el código fuente.*
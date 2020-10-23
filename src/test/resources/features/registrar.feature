# language: es

Característica: Realizar proceso de registro en la pagina uTest
  Yo como usuario
  Quiero registrarme en la pagina uTest
  Para tener los servicios que ofrece

  Escenario: Registro exitoso
    Dado que Diego esta en el formulario de registro
    Cuando ingrese la informacion personal
      | Nombre | Apellido | Correo                  | FechaNacimiento  |
      | Diego  | Merchan  | dfmerchan1001@gmail.com | November-17-1997 |
    Y la informacion de direcciones
      | Ciudad   | CodigoPostal | Pais     |
      | Medellín | 919191       | Colombia |
    Y la informacion de dipositivos
      | Computador | Version | Idioma  | Celular | Modelo          | Sistema           |
      | Linux      | CentOS  | Spanish | Huawei  | Y9 Prime (2019) | Android 9.0 (Pie) |
    Entonces ingresa la clave <Diego*12345>
    Y observara el mensaje <Welcome to the world's largest community of freelance software testers!>

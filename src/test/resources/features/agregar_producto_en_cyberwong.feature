#Author: l1_fdo@hotmai.com

  @EtiquetaPrincipal
  Feature: El cliente selecciona un articulo
    El cliente
    Realiza la seleccion de un articulo
    En la pagina cyberwong

  Background: El cliente ingresa a la pagina cyberwong
    Given El cliente abre el navegador

    @SeleccionarArticulo
    Scenario Outline: El cliente selecciona un articulo
      Given El cliente selecciona un producto
      When Confirma sus datos de domicilio
        | correo   | direccion   | numero   |
        | <correo> | <direccion> | <numero> |
      Then Verifica que el articulo se haya agregado
      Examples:
        | correo        | direccion  | numero |
        | l1_@gmail.com | Carrera 40 | 344    |


